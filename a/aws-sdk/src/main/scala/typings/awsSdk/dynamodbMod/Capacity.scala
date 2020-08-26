package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capacity extends js.Object {
  /**
    * The total number of capacity units consumed on a table or an index.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The total number of read capacity units consumed on a table or an index.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The total number of write capacity units consumed on a table or an index.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapacityUnits(value: ConsumedCapacityUnits): Self = this.set("CapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityUnits: Self = this.set("CapacityUnits", js.undefined)
    @scala.inline
    def setReadCapacityUnits(value: ConsumedCapacityUnits): Self = this.set("ReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadCapacityUnits: Self = this.set("ReadCapacityUnits", js.undefined)
    @scala.inline
    def setWriteCapacityUnits(value: ConsumedCapacityUnits): Self = this.set("WriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteCapacityUnits: Self = this.set("WriteCapacityUnits", js.undefined)
  }
  
}

