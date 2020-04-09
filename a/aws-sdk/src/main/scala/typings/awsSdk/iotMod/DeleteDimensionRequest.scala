package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDimensionRequest extends js.Object {
  /**
    * The unique identifier for the dimension that you want to delete.
    */
  var name: DimensionName = js.native
}

object DeleteDimensionRequest {
  @scala.inline
  def apply(name: DimensionName): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
}

