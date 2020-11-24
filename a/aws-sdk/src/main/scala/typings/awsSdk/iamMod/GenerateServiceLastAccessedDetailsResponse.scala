package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
  
  /**
    * The JobId that you can use in the GetServiceLastAccessedDetails or GetServiceLastAccessedDetailsWithEntities operations. The JobId returned by GenerateServiceLastAccessedDetail must be used by the same role within a session, or by the same user when used to call GetServiceLastAccessedDetail.
    */
  var JobId: js.UndefOr[jobIDType] = js.native
}
object GenerateServiceLastAccessedDetailsResponse {
  
  @scala.inline
  def apply(): GenerateServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsResponse]
  }
  
  @scala.inline
  implicit class GenerateServiceLastAccessedDetailsResponseOps[Self <: GenerateServiceLastAccessedDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: jobIDType): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
  }
}
