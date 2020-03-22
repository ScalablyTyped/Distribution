package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDbColumn extends js.Object {
  var allowDBNull: js.UndefOr[Boolean] = js.undefined
  var baseCatalogName: String
  var baseColumnName: String
  var baseSchemaName: String
  var baseServerName: String
  var baseTableName: String
  var columnName: String
  var columnOrdinal: js.UndefOr[Double] = js.undefined
  var columnSize: js.UndefOr[Double] = js.undefined
  var dataType: String
  var dataTypeName: String
  var isAliased: js.UndefOr[Boolean] = js.undefined
  var isAutoIncrement: js.UndefOr[Boolean] = js.undefined
  var isBytes: js.UndefOr[Boolean] = js.undefined
  var isChars: js.UndefOr[Boolean] = js.undefined
  var isExpression: js.UndefOr[Boolean] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var isIdentity: js.UndefOr[Boolean] = js.undefined
  var isJson: js.UndefOr[Boolean] = js.undefined
  var isKey: js.UndefOr[Boolean] = js.undefined
  var isLong: js.UndefOr[Boolean] = js.undefined
  var isReadOnly: js.UndefOr[Boolean] = js.undefined
  var isSqlVariant: js.UndefOr[Boolean] = js.undefined
  var isUdt: js.UndefOr[Boolean] = js.undefined
  var isUnique: js.UndefOr[Boolean] = js.undefined
  var isXml: js.UndefOr[Boolean] = js.undefined
  var numericPrecision: js.UndefOr[Double] = js.undefined
  var numericScale: js.UndefOr[Double] = js.undefined
  var udtAssemblyQualifiedName: String
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
    udtAssemblyQualifiedName: String,
    allowDBNull: js.UndefOr[Boolean] = js.undefined,
    columnOrdinal: Int | Double = null,
    columnSize: Int | Double = null,
    isAliased: js.UndefOr[Boolean] = js.undefined,
    isAutoIncrement: js.UndefOr[Boolean] = js.undefined,
    isBytes: js.UndefOr[Boolean] = js.undefined,
    isChars: js.UndefOr[Boolean] = js.undefined,
    isExpression: js.UndefOr[Boolean] = js.undefined,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    isIdentity: js.UndefOr[Boolean] = js.undefined,
    isJson: js.UndefOr[Boolean] = js.undefined,
    isKey: js.UndefOr[Boolean] = js.undefined,
    isLong: js.UndefOr[Boolean] = js.undefined,
    isReadOnly: js.UndefOr[Boolean] = js.undefined,
    isSqlVariant: js.UndefOr[Boolean] = js.undefined,
    isUdt: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    isXml: js.UndefOr[Boolean] = js.undefined,
    numericPrecision: Int | Double = null,
    numericScale: Int | Double = null
  ): IDbColumn = {
    val __obj = js.Dynamic.literal(baseCatalogName = baseCatalogName.asInstanceOf[js.Any], baseColumnName = baseColumnName.asInstanceOf[js.Any], baseSchemaName = baseSchemaName.asInstanceOf[js.Any], baseServerName = baseServerName.asInstanceOf[js.Any], baseTableName = baseTableName.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], dataTypeName = dataTypeName.asInstanceOf[js.Any], udtAssemblyQualifiedName = udtAssemblyQualifiedName.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDBNull)) __obj.updateDynamic("allowDBNull")(allowDBNull.asInstanceOf[js.Any])
    if (columnOrdinal != null) __obj.updateDynamic("columnOrdinal")(columnOrdinal.asInstanceOf[js.Any])
    if (columnSize != null) __obj.updateDynamic("columnSize")(columnSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isAliased)) __obj.updateDynamic("isAliased")(isAliased.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoIncrement)) __obj.updateDynamic("isAutoIncrement")(isAutoIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(isBytes)) __obj.updateDynamic("isBytes")(isBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(isChars)) __obj.updateDynamic("isChars")(isChars.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpression)) __obj.updateDynamic("isExpression")(isExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdentity)) __obj.updateDynamic("isIdentity")(isIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(isJson)) __obj.updateDynamic("isJson")(isJson.asInstanceOf[js.Any])
    if (!js.isUndefined(isKey)) __obj.updateDynamic("isKey")(isKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isLong)) __obj.updateDynamic("isLong")(isLong.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadOnly)) __obj.updateDynamic("isReadOnly")(isReadOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(isSqlVariant)) __obj.updateDynamic("isSqlVariant")(isSqlVariant.asInstanceOf[js.Any])
    if (!js.isUndefined(isUdt)) __obj.updateDynamic("isUdt")(isUdt.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    if (!js.isUndefined(isXml)) __obj.updateDynamic("isXml")(isXml.asInstanceOf[js.Any])
    if (numericPrecision != null) __obj.updateDynamic("numericPrecision")(numericPrecision.asInstanceOf[js.Any])
    if (numericScale != null) __obj.updateDynamic("numericScale")(numericScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDbColumn]
  }
}

