package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateS3ResourcesRequest extends js.Object {
  
  /**
    * The AWS ID of the Amazon Macie Classic member account whose S3 resources' classification types you want to update. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  
  /**
    * The S3 resources whose classification types you want to update.
    */
  var s3ResourcesUpdate: S3ResourcesClassificationUpdate = js.native
}
object UpdateS3ResourcesRequest {
  
  @scala.inline
  def apply(s3ResourcesUpdate: S3ResourcesClassificationUpdate): UpdateS3ResourcesRequest = {
    val __obj = js.Dynamic.literal(s3ResourcesUpdate = s3ResourcesUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateS3ResourcesRequest]
  }
  
  @scala.inline
  implicit class UpdateS3ResourcesRequestOps[Self <: UpdateS3ResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setS3ResourcesUpdateVarargs(value: S3ResourceClassificationUpdate*): Self = this.set("s3ResourcesUpdate", js.Array(value :_*))
    
    @scala.inline
    def setS3ResourcesUpdate(value: S3ResourcesClassificationUpdate): Self = this.set("s3ResourcesUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = this.set("memberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberAccountId: Self = this.set("memberAccountId", js.undefined)
  }
}
