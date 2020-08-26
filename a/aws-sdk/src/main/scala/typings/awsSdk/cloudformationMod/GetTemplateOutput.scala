package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateOutput extends js.Object {
  /**
    * The stage of the template that you can retrieve. For stacks, the Original and Processed templates are always available. For change sets, the Original template is always available. After AWS CloudFormation finishes creating the change set, the Processed template becomes available.
    */
  var StagesAvailable: js.UndefOr[StageList] = js.native
  /**
    * Structure containing the template body. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) AWS CloudFormation returns the same template that was used when the stack was created.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.native
}

object GetTemplateOutput {
  @scala.inline
  def apply(): GetTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateOutput]
  }
  @scala.inline
  implicit class GetTemplateOutputOps[Self <: GetTemplateOutput] (val x: Self) extends AnyVal {
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
    def setStagesAvailableVarargs(value: TemplateStage*): Self = this.set("StagesAvailable", js.Array(value :_*))
    @scala.inline
    def setStagesAvailable(value: StageList): Self = this.set("StagesAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStagesAvailable: Self = this.set("StagesAvailable", js.undefined)
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = this.set("TemplateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateBody: Self = this.set("TemplateBody", js.undefined)
  }
  
}

