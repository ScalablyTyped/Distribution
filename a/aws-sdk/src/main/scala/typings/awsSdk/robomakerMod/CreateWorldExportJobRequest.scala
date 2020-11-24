package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorldExportJobRequest extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
    */
  var iamRole: IamRole = js.native
  
  var outputLocation: OutputLocation = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world export job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * A list of Amazon Resource Names (arns) that correspond to worlds to export.
    */
  var worlds: Arns = js.native
}
object CreateWorldExportJobRequest {
  
  @scala.inline
  def apply(iamRole: IamRole, outputLocation: OutputLocation, worlds: Arns): CreateWorldExportJobRequest = {
    val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any], outputLocation = outputLocation.asInstanceOf[js.Any], worlds = worlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorldExportJobRequest]
  }
  
  @scala.inline
  implicit class CreateWorldExportJobRequestOps[Self <: CreateWorldExportJobRequest] (val x: Self) extends AnyVal {
    
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
    def setIamRole(value: IamRole): Self = this.set("iamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("outputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldsVarargs(value: Arn*): Self = this.set("worlds", js.Array(value :_*))
    
    @scala.inline
    def setWorlds(value: Arns): Self = this.set("worlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
