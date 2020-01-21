package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvalidationResult extends js.Object {
  /**
    * The invalidation's information. For more information, see Invalidation Complex Type. 
    */
  var Invalidation: js.UndefOr[typings.awsSdk.cloudfrontMod.Invalidation] = js.native
}

object GetInvalidationResult {
  @scala.inline
  def apply(Invalidation: Invalidation = null): GetInvalidationResult = {
    val __obj = js.Dynamic.literal()
    if (Invalidation != null) __obj.updateDynamic("Invalidation")(Invalidation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvalidationResult]
  }
}

