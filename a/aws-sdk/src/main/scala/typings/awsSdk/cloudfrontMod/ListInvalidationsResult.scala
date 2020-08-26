package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvalidationsResult extends js.Object {
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typings.awsSdk.cloudfrontMod.InvalidationList] = js.native
}

object ListInvalidationsResult {
  @scala.inline
  def apply(): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvalidationsResult]
  }
  @scala.inline
  implicit class ListInvalidationsResultOps[Self <: ListInvalidationsResult] (val x: Self) extends AnyVal {
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
    def setInvalidationList(value: InvalidationList): Self = this.set("InvalidationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidationList: Self = this.set("InvalidationList", js.undefined)
  }
  
}

