package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be deleted.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
}

object DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
  @scala.inline
  implicit class DeleteGlobalSecondaryIndexActionOps[Self <: DeleteGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
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
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
  }
  
}

