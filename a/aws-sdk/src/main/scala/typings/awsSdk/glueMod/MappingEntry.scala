package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingEntry extends js.Object {
  /**
    * The source path.
    */
  var SourcePath: js.UndefOr[SchemaPathString] = js.native
  /**
    * The name of the source table.
    */
  var SourceTable: js.UndefOr[TableName] = js.native
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[FieldType] = js.native
  /**
    * The target path.
    */
  var TargetPath: js.UndefOr[SchemaPathString] = js.native
  /**
    * The target table.
    */
  var TargetTable: js.UndefOr[TableName] = js.native
  /**
    * The target type.
    */
  var TargetType: js.UndefOr[FieldType] = js.native
}

object MappingEntry {
  @scala.inline
  def apply(): MappingEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingEntry]
  }
  @scala.inline
  implicit class MappingEntryOps[Self <: MappingEntry] (val x: Self) extends AnyVal {
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
    def setSourcePath(value: SchemaPathString): Self = this.set("SourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePath: Self = this.set("SourcePath", js.undefined)
    @scala.inline
    def setSourceTable(value: TableName): Self = this.set("SourceTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceTable: Self = this.set("SourceTable", js.undefined)
    @scala.inline
    def setSourceType(value: FieldType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    @scala.inline
    def setTargetPath(value: SchemaPathString): Self = this.set("TargetPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPath: Self = this.set("TargetPath", js.undefined)
    @scala.inline
    def setTargetTable(value: TableName): Self = this.set("TargetTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTable: Self = this.set("TargetTable", js.undefined)
    @scala.inline
    def setTargetType(value: FieldType): Self = this.set("TargetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("TargetType", js.undefined)
  }
  
}

