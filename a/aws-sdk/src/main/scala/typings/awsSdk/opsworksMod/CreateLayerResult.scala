package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLayerResult extends js.Object {
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
}

object CreateLayerResult {
  @scala.inline
  def apply(LayerId: String = null): CreateLayerResult = {
    val __obj = js.Dynamic.literal()
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLayerResult]
  }
}

