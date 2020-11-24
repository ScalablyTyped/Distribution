package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectVersionResponse extends js.Object {
  
  /**
    * The ARN of the model version that was created. Use DescribeProjectVersion to get the current status of the training operation.
    */
  var ProjectVersionArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectVersionArn] = js.native
}
object CreateProjectVersionResponse {
  
  @scala.inline
  def apply(): CreateProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectVersionResponse]
  }
  
  @scala.inline
  implicit class CreateProjectVersionResponseOps[Self <: CreateProjectVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = this.set("ProjectVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectVersionArn: Self = this.set("ProjectVersionArn", js.undefined)
  }
}
