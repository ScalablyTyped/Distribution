package typings.copyWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.copyWebpackPlugin.mod.ToType
import typings.copyWebpackPlugin.mod.TransformerCacheObject
import typings.node.bufferMod.global.Buffer
import typings.webpack.mod.WebpackLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with TransformerCacheObject {
    
    def keys(defaultCacheKeys: StringDictionary[Any], absoluteFilename: String): js.Promise[StringDictionary[Any]]
  }
  object `0` {
    
    inline def apply(keys: (StringDictionary[Any], String) => js.Promise[StringDictionary[Any]]): `0` = {
      val __obj = js.Dynamic.literal(keys = js.Any.fromFunction2(keys))
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setKeys(value: (StringDictionary[Any], String) => js.Promise[StringDictionary[Any]]): Self = StObject.set(x, "keys", js.Any.fromFunction2(value))
    }
  }
  
  trait AbsoluteFilename extends StObject {
    
    var absoluteFilename: js.UndefOr[String] = js.undefined
    
    var context: String
  }
  object AbsoluteFilename {
    
    inline def apply(context: String): AbsoluteFilename = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteFilename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbsoluteFilename] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteFilenameUndefined: Self = StObject.set(x, "absoluteFilename", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var absoluteFilename: String
    
    var data: Buffer
    
    var sourceFilename: String
  }
  object Data {
    
    inline def apply(absoluteFilename: String, data: Buffer, sourceFilename: String): Data = {
      val __obj = js.Dynamic.literal(absoluteFilename = absoluteFilename.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sourceFilename = sourceFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filename extends StObject {
    
    var absoluteFilename: String
    
    var filename: String
    
    var sourceFilename: String
    
    var toType: ToType
  }
  object Filename {
    
    inline def apply(absoluteFilename: String, filename: String, sourceFilename: String, toType: ToType): Filename = {
      val __obj = js.Dynamic.literal(absoluteFilename = absoluteFilename.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], sourceFilename = sourceFilename.asInstanceOf[js.Any], toType = toType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setToType(value: ToType): Self = StObject.set(x, "toType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(name: String): WebpackLogger = js.native
    def apply(name: js.Function0[String]): WebpackLogger = js.native
  }
  
  trait Keys
    extends StObject
       with TransformerCacheObject {
    
    var keys: StringDictionary[Any]
  }
  object Keys {
    
    inline def apply(keys: StringDictionary[Any]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
      
      inline def setKeys(value: StringDictionary[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
}
