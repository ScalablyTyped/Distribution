package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectResult extends js.Object {
  /**
    * A list of items that match the select expression.
    */
  var Items: js.UndefOr[ItemList] = js.native
  /**
    * An opaque token indicating that more items than MaxNumberOfItems were matched, the response size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SelectResult {
  @scala.inline
  def apply(): SelectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectResult]
  }
  @scala.inline
  implicit class SelectResultOps[Self <: SelectResult] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Item*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: ItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

