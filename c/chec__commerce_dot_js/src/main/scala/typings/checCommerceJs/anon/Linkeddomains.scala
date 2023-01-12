package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linkeddomains extends StObject {
  
  var linked_domains: js.Array[String] | Null
  
  var tracking_id: String | Null
}
object Linkeddomains {
  
  inline def apply(): Linkeddomains = {
    val __obj = js.Dynamic.literal(linked_domains = null, tracking_id = null)
    __obj.asInstanceOf[Linkeddomains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Linkeddomains] (val x: Self) extends AnyVal {
    
    inline def setLinked_domains(value: js.Array[String]): Self = StObject.set(x, "linked_domains", value.asInstanceOf[js.Any])
    
    inline def setLinked_domainsNull: Self = StObject.set(x, "linked_domains", null)
    
    inline def setLinked_domainsVarargs(value: String*): Self = StObject.set(x, "linked_domains", js.Array(value*))
    
    inline def setTracking_id(value: String): Self = StObject.set(x, "tracking_id", value.asInstanceOf[js.Any])
    
    inline def setTracking_idNull: Self = StObject.set(x, "tracking_id", null)
  }
}
