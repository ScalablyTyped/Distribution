package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata extends js.Object {
  /**
    * The type of the column.
    */
  var arrayBaseColumnType: js.UndefOr[Integer] = js.native
  /**
    * A value that indicates whether the column increments automatically.
    */
  var isAutoIncrement: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column is case-sensitive.
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether the column contains currency values.
    */
  var isCurrency: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether an integer column is signed.
    */
  var isSigned: js.UndefOr[Boolean] = js.native
  /**
    * The label for the column.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The name of the column.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether the column is nullable.
    */
  var nullable: js.UndefOr[Integer] = js.native
  /**
    * The precision value of a decimal number column.
    */
  var precision: js.UndefOr[Integer] = js.native
  /**
    * The scale value of a decimal number column.
    */
  var scale: js.UndefOr[Integer] = js.native
  /**
    * The name of the schema that owns the table that includes the column.
    */
  var schemaName: js.UndefOr[String] = js.native
  /**
    * The name of the table that includes the column.
    */
  var tableName: js.UndefOr[String] = js.native
  /**
    * The type of the column.
    */
  var `type`: js.UndefOr[Integer] = js.native
  /**
    * The database-specific data type of the column.
    */
  var typeName: js.UndefOr[String] = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply(): ColumnMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMetadata]
  }
  @scala.inline
  implicit class ColumnMetadataOps[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
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
    def setArrayBaseColumnType(value: Integer): Self = this.set("arrayBaseColumnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayBaseColumnType: Self = this.set("arrayBaseColumnType", js.undefined)
    @scala.inline
    def setIsAutoIncrement(value: Boolean): Self = this.set("isAutoIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutoIncrement: Self = this.set("isAutoIncrement", js.undefined)
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = this.set("isCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCaseSensitive: Self = this.set("isCaseSensitive", js.undefined)
    @scala.inline
    def setIsCurrency(value: Boolean): Self = this.set("isCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCurrency: Self = this.set("isCurrency", js.undefined)
    @scala.inline
    def setIsSigned(value: Boolean): Self = this.set("isSigned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSigned: Self = this.set("isSigned", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNullable(value: Integer): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    @scala.inline
    def setPrecision(value: Integer): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setScale(value: Integer): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("schemaName", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    @scala.inline
    def setType(value: Integer): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeName: Self = this.set("typeName", js.undefined)
  }
  
}

