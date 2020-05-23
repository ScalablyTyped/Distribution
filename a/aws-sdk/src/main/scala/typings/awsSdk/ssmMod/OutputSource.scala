package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSource extends js.Object {
  /**
    * The ID of the output source, for example the URL of an S3 bucket.
    */
  var OutputSourceId: js.UndefOr[typings.awsSdk.ssmMod.OutputSourceId] = js.native
  /**
    * The type of source where the association execution details are stored, for example, Amazon S3.
    */
  var OutputSourceType: js.UndefOr[typings.awsSdk.ssmMod.OutputSourceType] = js.native
}

object OutputSource {
  @scala.inline
  def apply(OutputSourceId: OutputSourceId = null, OutputSourceType: OutputSourceType = null): OutputSource = {
    val __obj = js.Dynamic.literal()
    if (OutputSourceId != null) __obj.updateDynamic("OutputSourceId")(OutputSourceId.asInstanceOf[js.Any])
    if (OutputSourceType != null) __obj.updateDynamic("OutputSourceType")(OutputSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSource]
  }
}

