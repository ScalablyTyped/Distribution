package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotAttributeResult extends js.Object {
  var DBSnapshotAttributesResult: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshotAttributesResult] = js.native
}

object ModifyDBSnapshotAttributeResult {
  @scala.inline
  def apply(): ModifyDBSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSnapshotAttributeResult]
  }
  @scala.inline
  implicit class ModifyDBSnapshotAttributeResultOps[Self <: ModifyDBSnapshotAttributeResult] (val x: Self) extends AnyVal {
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
    def setDBSnapshotAttributesResult(value: DBSnapshotAttributesResult): Self = this.set("DBSnapshotAttributesResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSnapshotAttributesResult: Self = this.set("DBSnapshotAttributesResult", js.undefined)
  }
  
}

