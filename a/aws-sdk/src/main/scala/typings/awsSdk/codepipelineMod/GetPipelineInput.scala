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
  def apply(name: PipelineName, version: js.UndefOr[PipelineVersion] = js.undefined): GetPipelineInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineInput]
  }
}

