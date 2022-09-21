package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRotationPolicy
  extends StObject
     with KeyRotationPolicyProperties {
  
  /**
    * The created time in UTC.
    * May be undefined if a policy has not been explicitly set.
    */
  val createdOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the Key Rotation Policy.
    * May be undefined if a policy has not been explicitly set.
    */
  val id: js.UndefOr[String] = js.undefined
  
  /**
    * The last updated time in UTC.
    * May be undefined if a policy has not been explicitly set.
    */
  val updatedOn: js.UndefOr[js.Date] = js.undefined
}
object KeyRotationPolicy {
  
  inline def apply(): KeyRotationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRotationPolicy]
  }
  
  extension [Self <: KeyRotationPolicy](x: Self) {
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnUndefined: Self = StObject.set(x, "createdOn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUpdatedOn(value: js.Date): Self = StObject.set(x, "updatedOn", value.asInstanceOf[js.Any])
    
    inline def setUpdatedOnUndefined: Self = StObject.set(x, "updatedOn", js.undefined)
  }
}
