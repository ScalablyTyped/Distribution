package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePartitionKey extends js.Object {
  /**
    * A dimension map that contains the dimension(s) for this partition.
    */
  var Dimensions: DimensionMap = js.native
}

object ResponsePartitionKey {
  @scala.inline
  def apply(Dimensions: DimensionMap): ResponsePartitionKey = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsePartitionKey]
  }
}

