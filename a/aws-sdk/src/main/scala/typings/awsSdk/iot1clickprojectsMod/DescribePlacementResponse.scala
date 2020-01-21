package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlacementResponse extends js.Object {
  /**
    * An object describing the placement.
    */
  var placement: PlacementDescription = js.native
}

object DescribePlacementResponse {
  @scala.inline
  def apply(placement: PlacementDescription): DescribePlacementResponse = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePlacementResponse]
  }
}

