package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectRequest extends js.Object {
  
  /**
    * The name of the project to be updated.
    */
  var Name: ProjectName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
    */
  var RoleArn: Arn = js.native
  
  var Sample: js.UndefOr[typings.awsSdk.databrewMod.Sample] = js.native
}
object UpdateProjectRequest {
  
  @scala.inline
  def apply(Name: ProjectName, RoleArn: Arn): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  @scala.inline
  implicit class UpdateProjectRequestOps[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: ProjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample(value: Sample): Self = this.set("Sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSample: Self = this.set("Sample", js.undefined)
  }
}
