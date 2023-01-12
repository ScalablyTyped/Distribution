package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespaces extends StObject {
  
  var namespaces: js.UndefOr[js.Array[String]] = js.undefined
}
object Namespaces {
  
  inline def apply(): Namespaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespaces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Namespaces] (val x: Self) extends AnyVal {
    
    inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value*))
  }
}
