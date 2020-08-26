package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineInput extends js.Object {
  /**
    * The name of the pipeline for which you want to get information. Pipeline names must be unique under an AWS user account.
    */
  var name: PipelineName = js.native
  /**
    * The version number of the pipeline. If you do not specify a version, defaults to the current version.
    */
  var version: js.UndefOr[PipelineVersion] = js.native
}

object GetPipelineInput {
  @scala.inline
  def apply(name: PipelineName): GetPipelineInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineInput]
  }
  @scala.inline
  implicit class GetPipelineInputOps[Self <: GetPipelineInput] (val x: Self) extends AnyVal {
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
    def setName(value: PipelineName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: PipelineVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

