package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOperation extends js.Object {
  /**
    * A transform operation that casts a column to a different type.
    */
  var CastColumnTypeOperation: js.UndefOr[typings.awsSdk.quicksightMod.CastColumnTypeOperation] = js.native
  /**
    * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  var CreateColumnsOperation: js.UndefOr[typings.awsSdk.quicksightMod.CreateColumnsOperation] = js.native
  /**
    * An operation that filters rows based on some condition.
    */
  var FilterOperation: js.UndefOr[typings.awsSdk.quicksightMod.FilterOperation] = js.native
  /**
    * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  var ProjectOperation: js.UndefOr[typings.awsSdk.quicksightMod.ProjectOperation] = js.native
  /**
    * An operation that renames a column.
    */
  var RenameColumnOperation: js.UndefOr[typings.awsSdk.quicksightMod.RenameColumnOperation] = js.native
  /**
    * An operation that tags a column with additional information.
    */
  var TagColumnOperation: js.UndefOr[typings.awsSdk.quicksightMod.TagColumnOperation] = js.native
}

object TransformOperation {
  @scala.inline
  def apply(): TransformOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOperation]
  }
  @scala.inline
  implicit class TransformOperationOps[Self <: TransformOperation] (val x: Self) extends AnyVal {
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
    def setCastColumnTypeOperation(value: CastColumnTypeOperation): Self = this.set("CastColumnTypeOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCastColumnTypeOperation: Self = this.set("CastColumnTypeOperation", js.undefined)
    @scala.inline
    def setCreateColumnsOperation(value: CreateColumnsOperation): Self = this.set("CreateColumnsOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateColumnsOperation: Self = this.set("CreateColumnsOperation", js.undefined)
    @scala.inline
    def setFilterOperation(value: FilterOperation): Self = this.set("FilterOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOperation: Self = this.set("FilterOperation", js.undefined)
    @scala.inline
    def setProjectOperation(value: ProjectOperation): Self = this.set("ProjectOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectOperation: Self = this.set("ProjectOperation", js.undefined)
    @scala.inline
    def setRenameColumnOperation(value: RenameColumnOperation): Self = this.set("RenameColumnOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenameColumnOperation: Self = this.set("RenameColumnOperation", js.undefined)
    @scala.inline
    def setTagColumnOperation(value: TagColumnOperation): Self = this.set("TagColumnOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagColumnOperation: Self = this.set("TagColumnOperation", js.undefined)
  }
  
}

