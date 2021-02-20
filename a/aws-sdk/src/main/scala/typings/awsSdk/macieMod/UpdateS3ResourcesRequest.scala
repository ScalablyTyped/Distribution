package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateS3ResourcesRequest extends StObject {
  
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
  implicit class UpdateS3ResourcesRequestMutableBuilder[Self <: UpdateS3ResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
    
    @scala.inline
    def setS3ResourcesUpdate(value: S3ResourcesClassificationUpdate): Self = StObject.set(x, "s3ResourcesUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ResourcesUpdateVarargs(value: S3ResourceClassificationUpdate*): Self = StObject.set(x, "s3ResourcesUpdate", js.Array(value :_*))
  }
}
