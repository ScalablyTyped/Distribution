package typings.awsSdkClientDynamodbBrowser.typesCapacityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capacity extends js.Object {
  /**
    * <p>The total number of capacity units consumed on a table or an index.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.native
}

object Capacity {
  @scala.inline
  def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  @scala.inline
  implicit class CapacityOps[Self <: Capacity] (val x: Self) extends AnyVal {
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
    def setCapacityUnits(value: Double): Self = this.set("CapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityUnits: Self = this.set("CapacityUnits", js.undefined)
  }
  
}

