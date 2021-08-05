package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDbColumn extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: IDbColumn](x: Self) {
    
    inline def setAllowDBNull(value: Boolean): Self = StObject.set(x, "allowDBNull", value.asInstanceOf[js.Any])
    
    inline def setAllowDBNullUndefined: Self = StObject.set(x, "allowDBNull", js.undefined)
    
    inline def setBaseCatalogName(value: String): Self = StObject.set(x, "baseCatalogName", value.asInstanceOf[js.Any])
    
    inline def setBaseColumnName(value: String): Self = StObject.set(x, "baseColumnName", value.asInstanceOf[js.Any])
    
    inline def setBaseSchemaName(value: String): Self = StObject.set(x, "baseSchemaName", value.asInstanceOf[js.Any])
    
    inline def setBaseServerName(value: String): Self = StObject.set(x, "baseServerName", value.asInstanceOf[js.Any])
    
    inline def setBaseTableName(value: String): Self = StObject.set(x, "baseTableName", value.asInstanceOf[js.Any])
    
    inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnOrdinal(value: Double): Self = StObject.set(x, "columnOrdinal", value.asInstanceOf[js.Any])
    
    inline def setColumnOrdinalUndefined: Self = StObject.set(x, "columnOrdinal", js.undefined)
    
    inline def setColumnSize(value: Double): Self = StObject.set(x, "columnSize", value.asInstanceOf[js.Any])
    
    inline def setColumnSizeUndefined: Self = StObject.set(x, "columnSize", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    inline def setIsAliased(value: Boolean): Self = StObject.set(x, "isAliased", value.asInstanceOf[js.Any])
    
    inline def setIsAliasedUndefined: Self = StObject.set(x, "isAliased", js.undefined)
    
    inline def setIsAutoIncrement(value: Boolean): Self = StObject.set(x, "isAutoIncrement", value.asInstanceOf[js.Any])
    
    inline def setIsAutoIncrementUndefined: Self = StObject.set(x, "isAutoIncrement", js.undefined)
    
    inline def setIsBytes(value: Boolean): Self = StObject.set(x, "isBytes", value.asInstanceOf[js.Any])
    
    inline def setIsBytesUndefined: Self = StObject.set(x, "isBytes", js.undefined)
    
    inline def setIsChars(value: Boolean): Self = StObject.set(x, "isChars", value.asInstanceOf[js.Any])
    
    inline def setIsCharsUndefined: Self = StObject.set(x, "isChars", js.undefined)
    
    inline def setIsExpression(value: Boolean): Self = StObject.set(x, "isExpression", value.asInstanceOf[js.Any])
    
    inline def setIsExpressionUndefined: Self = StObject.set(x, "isExpression", js.undefined)
    
    inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    inline def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    inline def setIsIdentityUndefined: Self = StObject.set(x, "isIdentity", js.undefined)
    
    inline def setIsJson(value: Boolean): Self = StObject.set(x, "isJson", value.asInstanceOf[js.Any])
    
    inline def setIsJsonUndefined: Self = StObject.set(x, "isJson", js.undefined)
    
    inline def setIsKey(value: Boolean): Self = StObject.set(x, "isKey", value.asInstanceOf[js.Any])
    
    inline def setIsKeyUndefined: Self = StObject.set(x, "isKey", js.undefined)
    
    inline def setIsLong(value: Boolean): Self = StObject.set(x, "isLong", value.asInstanceOf[js.Any])
    
    inline def setIsLongUndefined: Self = StObject.set(x, "isLong", js.undefined)
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    
    inline def setIsSqlVariant(value: Boolean): Self = StObject.set(x, "isSqlVariant", value.asInstanceOf[js.Any])
    
    inline def setIsSqlVariantUndefined: Self = StObject.set(x, "isSqlVariant", js.undefined)
    
    inline def setIsUdt(value: Boolean): Self = StObject.set(x, "isUdt", value.asInstanceOf[js.Any])
    
    inline def setIsUdtUndefined: Self = StObject.set(x, "isUdt", js.undefined)
    
    inline def setIsUnique(value: Boolean): Self = StObject.set(x, "isUnique", value.asInstanceOf[js.Any])
    
    inline def setIsUniqueUndefined: Self = StObject.set(x, "isUnique", js.undefined)
    
    inline def setIsXml(value: Boolean): Self = StObject.set(x, "isXml", value.asInstanceOf[js.Any])
    
    inline def setIsXmlUndefined: Self = StObject.set(x, "isXml", js.undefined)
    
    inline def setNumericPrecision(value: Double): Self = StObject.set(x, "numericPrecision", value.asInstanceOf[js.Any])
    
    inline def setNumericPrecisionUndefined: Self = StObject.set(x, "numericPrecision", js.undefined)
    
    inline def setNumericScale(value: Double): Self = StObject.set(x, "numericScale", value.asInstanceOf[js.Any])
    
    inline def setNumericScaleUndefined: Self = StObject.set(x, "numericScale", js.undefined)
    
    inline def setUdtAssemblyQualifiedName(value: String): Self = StObject.set(x, "udtAssemblyQualifiedName", value.asInstanceOf[js.Any])
  }
}
