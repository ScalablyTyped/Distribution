package typings.convertSourceMap

import typings.convertSourceMap.convertSourceMapStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[uri] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: uri): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    }
  }
  
  trait Multiline extends StObject {
    
    var multiline: js.UndefOr[Boolean] = js.undefined
  }
  object Multiline {
    
    inline def apply(): Multiline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Multiline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Multiline] (val x: Self) extends AnyVal {
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    }
  }
}
