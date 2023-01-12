package typings.cheerio

import typings.domhandler.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiFormsMod {
  
  @JSImport("cheerio/lib/esm/api/forms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serialize[T /* <: AnyNode */](): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[String]
  
  inline def serializeArray[T /* <: AnyNode */](): js.Array[SerializedField] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeArray")().asInstanceOf[js.Array[SerializedField]]
  
  trait SerializedField extends StObject {
    
    var name: String
    
    var value: String
  }
  object SerializedField {
    
    inline def apply(name: String, value: String): SerializedField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedField] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
