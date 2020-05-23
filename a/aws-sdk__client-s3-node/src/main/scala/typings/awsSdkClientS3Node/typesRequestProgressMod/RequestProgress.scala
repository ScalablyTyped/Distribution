package typings.awsSdkClientS3Node.typesRequestProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestProgress extends js.Object {
  /**
    * <p>Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object RequestProgress {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): RequestProgress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestProgress]
  }
}

