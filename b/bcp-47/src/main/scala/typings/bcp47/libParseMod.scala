package typings.bcp47

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  @JSImport("bcp-47/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(tag: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def parse(tag: String, options: Options): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  trait Extension extends StObject {
    
    var extensions: js.Array[String]
    
    var singleton: String
  }
  object Extension {
    
    inline def apply(extensions: js.Array[String], singleton: String): Extension = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], singleton = singleton.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setSingleton(value: String): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var forgiving: js.UndefOr[Boolean] = js.undefined
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var warning: js.UndefOr[Warning] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setForgiving(value: Boolean): Self = StObject.set(x, "forgiving", value.asInstanceOf[js.Any])
      
      inline def setForgivingUndefined: Self = StObject.set(x, "forgiving", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setWarning(value: (/* reason */ String, /* code */ Double, /* offset */ Double) => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction3(value))
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait Schema extends StObject {
    
    var extendedLanguageSubtags: js.Array[String]
    
    var extensions: js.Array[Extension]
    
    var irregular: js.UndefOr[String | Null] = js.undefined
    
    var language: js.UndefOr[String | Null] = js.undefined
    
    var privateuse: js.Array[String]
    
    var region: js.UndefOr[String | Null] = js.undefined
    
    var regular: js.UndefOr[String | Null] = js.undefined
    
    var script: js.UndefOr[String | Null] = js.undefined
    
    var variants: js.Array[String]
  }
  object Schema {
    
    inline def apply(
      extendedLanguageSubtags: js.Array[String],
      extensions: js.Array[Extension],
      privateuse: js.Array[String],
      variants: js.Array[String]
    ): Schema = {
      val __obj = js.Dynamic.literal(extendedLanguageSubtags = extendedLanguageSubtags.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], privateuse = privateuse.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      inline def setExtendedLanguageSubtags(value: js.Array[String]): Self = StObject.set(x, "extendedLanguageSubtags", value.asInstanceOf[js.Any])
      
      inline def setExtendedLanguageSubtagsVarargs(value: String*): Self = StObject.set(x, "extendedLanguageSubtags", js.Array(value*))
      
      inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIrregular(value: String): Self = StObject.set(x, "irregular", value.asInstanceOf[js.Any])
      
      inline def setIrregularNull: Self = StObject.set(x, "irregular", null)
      
      inline def setIrregularUndefined: Self = StObject.set(x, "irregular", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageNull: Self = StObject.set(x, "language", null)
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPrivateuse(value: js.Array[String]): Self = StObject.set(x, "privateuse", value.asInstanceOf[js.Any])
      
      inline def setPrivateuseVarargs(value: String*): Self = StObject.set(x, "privateuse", js.Array(value*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionNull: Self = StObject.set(x, "region", null)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularNull: Self = StObject.set(x, "regular", null)
      
      inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
  
  type Warning = js.Function3[/* reason */ String, /* code */ Double, /* offset */ Double, Unit]
}
