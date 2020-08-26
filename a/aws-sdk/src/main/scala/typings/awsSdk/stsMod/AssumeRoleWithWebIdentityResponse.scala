package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleWithWebIdentityResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you can use to refer to the resulting temporary security credentials. For example, you can reference these credentials as a principal in a resource-based policy by using the ARN or assumed role ID. The ARN and ID include the RoleSessionName that you specified when you called AssumeRole. 
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdk.stsMod.AssumedRoleUser] = js.native
  /**
    * The intended audience (also known as client ID) of the web identity token. This is traditionally the client identifier issued to the application that requested the web identity token.
    */
  var Audience: js.UndefOr[typings.awsSdk.stsMod.Audience] = js.native
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.stsMod.Credentials] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
  /**
    *  The issuing authority of the web identity token presented. For OpenID Connect ID tokens, this contains the value of the iss field. For OAuth 2.0 access tokens, this contains the value of the ProviderId parameter that was passed in the AssumeRoleWithWebIdentity request.
    */
  var Provider: js.UndefOr[Issuer] = js.native
  /**
    * The unique user identifier that is returned by the identity provider. This identifier is associated with the WebIdentityToken that was submitted with the AssumeRoleWithWebIdentity call. The identifier is typically unique to the user and the application that acquired the WebIdentityToken (pairwise identifier). For OpenID Connect ID tokens, this field contains the value returned by the identity provider as the token's sub (Subject) claim. 
    */
  var SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType] = js.native
}

object AssumeRoleWithWebIdentityResponse {
  @scala.inline
  def apply(): AssumeRoleWithWebIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithWebIdentityResponse]
  }
  @scala.inline
  implicit class AssumeRoleWithWebIdentityResponseOps[Self <: AssumeRoleWithWebIdentityResponse] (val x: Self) extends AnyVal {
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
    def setAssumedRoleUser(value: AssumedRoleUser): Self = this.set("AssumedRoleUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumedRoleUser: Self = this.set("AssumedRoleUser", js.undefined)
    @scala.inline
    def setAudience(value: Audience): Self = this.set("Audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("Audience", js.undefined)
    @scala.inline
    def setCredentials(value: Credentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    @scala.inline
    def setPackedPolicySize(value: nonNegativeIntegerType): Self = this.set("PackedPolicySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackedPolicySize: Self = this.set("PackedPolicySize", js.undefined)
    @scala.inline
    def setProvider(value: Issuer): Self = this.set("Provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("Provider", js.undefined)
    @scala.inline
    def setSubjectFromWebIdentityToken(value: webIdentitySubjectType): Self = this.set("SubjectFromWebIdentityToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectFromWebIdentityToken: Self = this.set("SubjectFromWebIdentityToken", js.undefined)
  }
  
}

