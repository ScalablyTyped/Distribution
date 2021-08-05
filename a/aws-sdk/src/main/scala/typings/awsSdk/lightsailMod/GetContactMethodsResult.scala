package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactMethodsResult extends StObject {
  
  /**
    * An array of objects that describe the contact methods.
    */
  var contactMethods: js.UndefOr[ContactMethodsList] = js.undefined
}
object GetContactMethodsResult {
  
  inline def apply(): GetContactMethodsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsResult]
  }
  
  extension [Self <: GetContactMethodsResult](x: Self) {
    
    inline def setContactMethods(value: ContactMethodsList): Self = StObject.set(x, "contactMethods", value.asInstanceOf[js.Any])
    
    inline def setContactMethodsUndefined: Self = StObject.set(x, "contactMethods", js.undefined)
    
    inline def setContactMethodsVarargs(value: ContactMethod*): Self = StObject.set(x, "contactMethods", js.Array(value :_*))
  }
}
