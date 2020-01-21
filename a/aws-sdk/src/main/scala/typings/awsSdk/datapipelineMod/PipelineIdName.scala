package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineIdName extends js.Object {
  /**
    * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
    */
  var id: js.UndefOr[typings.awsSdk.datapipelineMod.id] = js.native
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[id] = js.native
}

object PipelineIdName {
  @scala.inline
  def apply(id: id = null, name: id = null): PipelineIdName = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineIdName]
  }
}

