package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDbColumn extends js.Object {
  var allowDBNull: js.UndefOr[Boolean] = js.native
  var baseCatalogName: String = js.native
  var baseColumnName: String = js.native
  var baseSchemaName: String = js.native
  var baseServerName: String = js.native
  var baseTableName: String = js.native
  var columnName: String = js.native
  var columnOrdinal: js.UndefOr[Double] = js.native
  var columnSize: js.UndefOr[Double] = js.native
  var dataType: String = js.native
  var dataTypeName: String = js.native
  var isAliased: js.UndefOr[Boolean] = js.native
  var isAutoIncrement: js.UndefOr[Boolean] = js.native
  var isBytes: js.UndefOr[Boolean] = js.native
  var isChars: js.UndefOr[Boolean] = js.native
  var isExpression: js.UndefOr[Boolean] = js.native
  var isHidden: js.UndefOr[Boolean] = js.native
  var isIdentity: js.UndefOr[Boolean] = js.native
  var isJson: js.UndefOr[Boolean] = js.native
  var isKey: js.UndefOr[Boolean] = js.native
  var isLong: js.UndefOr[Boolean] = js.native
  var isReadOnly: js.UndefOr[Boolean] = js.native
  var isSqlVariant: js.UndefOr[Boolean] = js.native
  var isUdt: js.UndefOr[Boolean] = js.native
  var isUnique: js.UndefOr[Boolean] = js.native
  var isXml: js.UndefOr[Boolean] = js.native
  var numericPrecision: js.UndefOr[Double] = js.native
  var numericScale: js.UndefOr[Double] = js.native
  var udtAssemblyQualifiedName: String = js.native
}

object IDbColumn {
  @scala.inline
  def apply(
    baseCatalogName: String,
    baseColumnName: String,
    baseSchemaName: String,
    baseServerName: String,
    baseTableName: String,
    columnName: String,
    dataType: String,
    dataTypeName: String,
    udtAssemblyQualifiedName: String
  ): IDbColumn = {
    val __obj = js.Dynamic.literal(baseCatalogName = baseCatalogName.asInstanceOf[js.Any], baseColumnName = baseColumnName.asInstanceOf[js.Any], baseSchemaName = baseSchemaName.asInstanceOf[js.Any], baseServerName = baseServerName.asInstanceOf[js.Any], baseTableName = baseTableName.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], dataTypeName = dataTypeName.asInstanceOf[js.Any], udtAssemblyQualifiedName = udtAssemblyQualifiedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDbColumn]
  }
  @scala.inline
  implicit class IDbColumnOps[Self <: IDbColumn] (val x: Self) extends AnyVal {
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
    def setBaseCatalogName(value: String): Self = this.set("baseCatalogName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseColumnName(value: String): Self = this.set("baseColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseSchemaName(value: String): Self = this.set("baseSchemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseServerName(value: String): Self = this.set("baseServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseTableName(value: String): Self = this.set("baseTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTypeName(value: String): Self = this.set("dataTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUdtAssemblyQualifiedName(value: String): Self = this.set("udtAssemblyQualifiedName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowDBNull(value: Boolean): Self = this.set("allowDBNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDBNull: Self = this.set("allowDBNull", js.undefined)
    @scala.inline
    def setColumnOrdinal(value: Double): Self = this.set("columnOrdinal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnOrdinal: Self = this.set("columnOrdinal", js.undefined)
    @scala.inline
    def setColumnSize(value: Double): Self = this.set("columnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSize: Self = this.set("columnSize", js.undefined)
    @scala.inline
    def setIsAliased(value: Boolean): Self = this.set("isAliased", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAliased: Self = this.set("isAliased", js.undefined)
    @scala.inline
    def setIsAutoIncrement(value: Boolean): Self = this.set("isAutoIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutoIncrement: Self = this.set("isAutoIncrement", js.undefined)
    @scala.inline
    def setIsBytes(value: Boolean): Self = this.set("isBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBytes: Self = this.set("isBytes", js.undefined)
    @scala.inline
    def setIsChars(value: Boolean): Self = this.set("isChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChars: Self = this.set("isChars", js.undefined)
    @scala.inline
    def setIsExpression(value: Boolean): Self = this.set("isExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpression: Self = this.set("isExpression", js.undefined)
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    @scala.inline
    def setIsIdentity(value: Boolean): Self = this.set("isIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIdentity: Self = this.set("isIdentity", js.undefined)
    @scala.inline
    def setIsJson(value: Boolean): Self = this.set("isJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsJson: Self = this.set("isJson", js.undefined)
    @scala.inline
    def setIsKey(value: Boolean): Self = this.set("isKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsKey: Self = this.set("isKey", js.undefined)
    @scala.inline
    def setIsLong(value: Boolean): Self = this.set("isLong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLong: Self = this.set("isLong", js.undefined)
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    @scala.inline
    def setIsSqlVariant(value: Boolean): Self = this.set("isSqlVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSqlVariant: Self = this.set("isSqlVariant", js.undefined)
    @scala.inline
    def setIsUdt(value: Boolean): Self = this.set("isUdt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUdt: Self = this.set("isUdt", js.undefined)
    @scala.inline
    def setIsUnique(value: Boolean): Self = this.set("isUnique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUnique: Self = this.set("isUnique", js.undefined)
    @scala.inline
    def setIsXml(value: Boolean): Self = this.set("isXml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsXml: Self = this.set("isXml", js.undefined)
    @scala.inline
    def setNumericPrecision(value: Double): Self = this.set("numericPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericPrecision: Self = this.set("numericPrecision", js.undefined)
    @scala.inline
    def setNumericScale(value: Double): Self = this.set("numericScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericScale: Self = this.set("numericScale", js.undefined)
  }
  
}

