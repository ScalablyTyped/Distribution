package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsEntity extends js.Object {
  /**
    * The data returned by the query.
    */
  var Data: js.UndefOr[OpsEntityItemMap] = js.native
  /**
    * The query ID.
    */
  var Id: js.UndefOr[OpsEntityId] = js.native
}

object OpsEntity {
  @scala.inline
  def apply(): OpsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntity]
  }
  @scala.inline
  implicit class OpsEntityOps[Self <: OpsEntity] (val x: Self) extends AnyVal {
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
    def setData(value: OpsEntityItemMap): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    @scala.inline
    def setId(value: OpsEntityId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

