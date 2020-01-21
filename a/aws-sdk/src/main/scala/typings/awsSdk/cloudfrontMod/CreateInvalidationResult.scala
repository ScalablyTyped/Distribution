package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvalidationResult extends js.Object {
  /**
    * The invalidation's information.
    */
  var Invalidation: js.UndefOr[typings.awsSdk.cloudfrontMod.Invalidation] = js.native
  /**
    * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateInvalidationResult {
  @scala.inline
  def apply(Invalidation: Invalidation = null, Location: String = null): CreateInvalidationResult = {
    val __obj = js.Dynamic.literal()
    if (Invalidation != null) __obj.updateDynamic("Invalidation")(Invalidation.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvalidationResult]
  }
}

