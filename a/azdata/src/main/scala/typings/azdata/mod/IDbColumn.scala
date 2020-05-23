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
    columnOrdinal: js.UndefOr[Double] = js.undefined,
    columnSize: js.UndefOr[Double] = js.undefined,
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
    numericPrecision: js.UndefOr[Double] = js.undefined,
    numericScale: js.UndefOr[Double] = js.undefined
  ): IDbColumn = {
    val __obj = js.Dynamic.literal(baseCatalogName = baseCatalogName.asInstanceOf[js.Any], baseColumnName = baseColumnName.asInstanceOf[js.Any], baseSchemaName = baseSchemaName.asInstanceOf[js.Any], baseServerName = baseServerName.asInstanceOf[js.Any], baseTableName = baseTableName.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], dataTypeName = dataTypeName.asInstanceOf[js.Any], udtAssemblyQualifiedName = udtAssemblyQualifiedName.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDBNull)) __obj.updateDynamic("allowDBNull")(allowDBNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnOrdinal)) __obj.updateDynamic("columnOrdinal")(columnOrdinal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSize)) __obj.updateDynamic("columnSize")(columnSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAliased)) __obj.updateDynamic("isAliased")(isAliased.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAutoIncrement)) __obj.updateDynamic("isAutoIncrement")(isAutoIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBytes)) __obj.updateDynamic("isBytes")(isBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isChars)) __obj.updateDynamic("isChars")(isChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpression)) __obj.updateDynamic("isExpression")(isExpression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdentity)) __obj.updateDynamic("isIdentity")(isIdentity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isJson)) __obj.updateDynamic("isJson")(isJson.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isKey)) __obj.updateDynamic("isKey")(isKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLong)) __obj.updateDynamic("isLong")(isLong.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isReadOnly)) __obj.updateDynamic("isReadOnly")(isReadOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSqlVariant)) __obj.updateDynamic("isSqlVariant")(isSqlVariant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUdt)) __obj.updateDynamic("isUdt")(isUdt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isXml)) __obj.updateDynamic("isXml")(isXml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numericPrecision)) __obj.updateDynamic("numericPrecision")(numericPrecision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numericScale)) __obj.updateDynamic("numericScale")(numericScale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDbColumn]
  }
}

