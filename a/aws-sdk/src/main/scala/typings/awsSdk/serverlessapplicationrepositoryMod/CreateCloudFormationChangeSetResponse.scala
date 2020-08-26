package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFormationChangeSetResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the change set.Length constraints: Minimum length of 1.Pattern: ARN:[-a-zA-Z0-9:/]*
    */
  var ChangeSetId: js.UndefOr[string] = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[string] = js.native
}

object CreateCloudFormationChangeSetResponse {
  @scala.inline
  def apply(): CreateCloudFormationChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCloudFormationChangeSetResponse]
  }
  @scala.inline
  implicit class CreateCloudFormationChangeSetResponseOps[Self <: CreateCloudFormationChangeSetResponse] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setChangeSetId(value: string): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemanticVersion: Self = this.set("SemanticVersion", js.undefined)
    @scala.inline
    def setStackId(value: string): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

