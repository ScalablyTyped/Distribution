package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSource extends js.Object {
  /**
    * The source ARN.
    */
  var SourceArn: TrialComponentSourceArn = js.native
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.sagemakerMod.SourceType] = js.native
}

object TrialComponentSource {
  @scala.inline
  def apply(SourceArn: TrialComponentSourceArn, SourceType: SourceType = null): TrialComponentSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSource]
  }
}

