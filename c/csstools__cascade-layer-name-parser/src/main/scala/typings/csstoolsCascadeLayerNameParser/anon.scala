package typings.csstoolsCascadeLayerNameParser

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var parts: js.Array[CSSToken]
    
    var segments: js.Array[String]
  }
  object Name {
    
    inline def apply(name: String, parts: js.Array[CSSToken], segments: js.Array[String]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParts(value: js.Array[CSSToken]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: CSSToken*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setSegments(value: js.Array[String]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: String*): Self = StObject.set(x, "segments", js.Array(value*))
    }
  }
}
