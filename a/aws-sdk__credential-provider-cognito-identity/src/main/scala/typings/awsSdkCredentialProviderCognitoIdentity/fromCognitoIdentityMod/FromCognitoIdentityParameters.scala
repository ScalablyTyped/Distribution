package typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod

import typings.awsSdkClientCognitoIdentity.mod.CognitoIdentityClient
import typings.awsSdkCredentialProviderCognitoIdentity.cognitoProviderParametersMod.CognitoProviderParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromCognitoIdentityParameters extends CognitoProviderParameters {
  
  /**
    * The unique identifier for the identity against which credentials will be
    * issued.
    */
  var identityId: String = js.native
}
object FromCognitoIdentityParameters {
  
  @scala.inline
  def apply(client: CognitoIdentityClient, identityId: String): FromCognitoIdentityParameters = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromCognitoIdentityParameters]
  }
  
  @scala.inline
  implicit class FromCognitoIdentityParametersOps[Self <: FromCognitoIdentityParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityId(value: String): Self = this.set("identityId", value.asInstanceOf[js.Any])
  }
}
