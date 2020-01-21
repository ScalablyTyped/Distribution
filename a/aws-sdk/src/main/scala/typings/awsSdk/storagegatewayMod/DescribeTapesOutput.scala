package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapesOutput extends js.Object {
  /**
    * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of results. If a response does not contain a marker, then there are no more results to be retrieved.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of virtual tape descriptions.
    */
  var Tapes: js.UndefOr[typings.awsSdk.storagegatewayMod.Tapes] = js.native
}

object DescribeTapesOutput {
  @scala.inline
  def apply(Marker: Marker = null, Tapes: Tapes = null): DescribeTapesOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Tapes != null) __obj.updateDynamic("Tapes")(Tapes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTapesOutput]
  }
}

