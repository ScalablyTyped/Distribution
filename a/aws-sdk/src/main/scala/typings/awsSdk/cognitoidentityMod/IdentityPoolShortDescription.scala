package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolShortDescription extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityPoolId] = js.native
  
  /**
    * A string that you provide.
    */
  var IdentityPoolName: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityPoolName] = js.native
}
object IdentityPoolShortDescription {
  
  @scala.inline
  def apply(): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
  
  @scala.inline
  implicit class IdentityPoolShortDescriptionMutableBuilder[Self <: IdentityPoolShortDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setIdentityPoolName(value: IdentityPoolName): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolNameUndefined: Self = StObject.set(x, "IdentityPoolName", js.undefined)
  }
}
