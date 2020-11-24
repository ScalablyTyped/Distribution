package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGrantResponse extends js.Object {
  
  /**
    * The unique identifier for the grant. You can use the GrantId in a subsequent RetireGrant or RevokeGrant operation.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  
  /**
    * The grant token. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantToken: js.UndefOr[GrantTokenType] = js.native
}
object CreateGrantResponse {
  
  @scala.inline
  def apply(): CreateGrantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGrantResponse]
  }
  
  @scala.inline
  implicit class CreateGrantResponseOps[Self <: CreateGrantResponse] (val x: Self) extends AnyVal {
    
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
    def setGrantId(value: GrantIdType): Self = this.set("GrantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantId: Self = this.set("GrantId", js.undefined)
    
    @scala.inline
    def setGrantToken(value: GrantTokenType): Self = this.set("GrantToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantToken: Self = this.set("GrantToken", js.undefined)
  }
}
