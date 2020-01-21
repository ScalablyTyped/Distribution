package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: ExperimentSourceArn = js.native
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.sagemakerMod.SourceType] = js.native
}

object ExperimentSource {
  @scala.inline
  def apply(SourceArn: ExperimentSourceArn, SourceType: SourceType = null): ExperimentSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentSource]
  }
}

