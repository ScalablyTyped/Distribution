package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSortingEntity extends js.Object {
  /**
    * The category for sorting the snapshots.
    */
  var Attribute: SnapshotAttributeToSortBy = js.native
  /**
    * The order for listing the attributes.
    */
  var SortOrder: js.UndefOr[SortByOrder] = js.native
}

object SnapshotSortingEntity {
  @scala.inline
  def apply(Attribute: SnapshotAttributeToSortBy): SnapshotSortingEntity = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSortingEntity]
  }
  @scala.inline
  implicit class SnapshotSortingEntityOps[Self <: SnapshotSortingEntity] (val x: Self) extends AnyVal {
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
    def setAttribute(value: SnapshotAttributeToSortBy): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrder(value: SortByOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
  
}

