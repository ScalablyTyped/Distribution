package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var Name: DimensionName = js.native
  /**
    * The value representing the dimension measurement.
    */
  var Value: DimensionValue = js.native
}

object Dimension {
  @scala.inline
  def apply(Name: DimensionName, Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Dimension]
  }
}

