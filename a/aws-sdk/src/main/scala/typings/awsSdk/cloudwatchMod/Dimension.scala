package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimension extends js.Object {
  /**
    * The name of the dimension. Dimension names cannot contain blank spaces or non-ASCII characters.
    */
  var Name: DimensionName = js.native
  /**
    * The value of the dimension.
    */
  var Value: DimensionValue = js.native
}

object Dimension {
  @scala.inline
  def apply(Name: DimensionName, Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: DimensionName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: DimensionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

