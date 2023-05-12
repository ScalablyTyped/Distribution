package typings.cyclonedx.anon

import typings.cyclonedx.mod.Contact
import typings.cyclonedx.mod.ContactPerson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Individuals extends StObject {
  
  var individuals: js.UndefOr[js.Array[ContactPerson]] = js.undefined
  
  var organizations: js.UndefOr[js.Array[Contact]] = js.undefined
}
object Individuals {
  
  inline def apply(): Individuals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Individuals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Individuals] (val x: Self) extends AnyVal {
    
    inline def setIndividuals(value: js.Array[ContactPerson]): Self = StObject.set(x, "individuals", value.asInstanceOf[js.Any])
    
    inline def setIndividualsUndefined: Self = StObject.set(x, "individuals", js.undefined)
    
    inline def setIndividualsVarargs(value: ContactPerson*): Self = StObject.set(x, "individuals", js.Array(value*))
    
    inline def setOrganizations(value: js.Array[Contact]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: Contact*): Self = StObject.set(x, "organizations", js.Array(value*))
  }
}
