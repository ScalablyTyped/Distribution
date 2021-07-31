package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeDeveloperIdentitiesResponse extends StObject {
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.undefined
}
object MergeDeveloperIdentitiesResponse {
  
  @scala.inline
  def apply(): MergeDeveloperIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeDeveloperIdentitiesResponse]
  }
  
  @scala.inline
  implicit class MergeDeveloperIdentitiesResponseMutableBuilder[Self <: MergeDeveloperIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
