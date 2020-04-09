package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDimensionRequest extends js.Object {
  /**
    * The unique identifier for the dimension.
    */
  var name: DimensionName = js.native
}

object DescribeDimensionRequest {
  @scala.inline
  def apply(name: DimensionName): DescribeDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDimensionRequest]
  }
}

