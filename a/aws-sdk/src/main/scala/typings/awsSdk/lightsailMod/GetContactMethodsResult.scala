package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContactMethodsResult extends StObject {
  
  /**
    * An array of objects that describe the contact methods.
    */
  var contactMethods: js.UndefOr[ContactMethodsList] = js.native
}
object GetContactMethodsResult {
  
  @scala.inline
  def apply(): GetContactMethodsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsResult]
  }
  
  @scala.inline
  implicit class GetContactMethodsResultMutableBuilder[Self <: GetContactMethodsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactMethods(value: ContactMethodsList): Self = StObject.set(x, "contactMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactMethodsUndefined: Self = StObject.set(x, "contactMethods", js.undefined)
    
    @scala.inline
    def setContactMethodsVarargs(value: ContactMethod*): Self = StObject.set(x, "contactMethods", js.Array(value :_*))
  }
}
