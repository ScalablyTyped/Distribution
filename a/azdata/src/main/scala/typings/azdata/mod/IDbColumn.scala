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
  implicit class IDbColumnMutableBuilder[Self <: IDbColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDBNull(value: Boolean): Self = StObject.set(x, "allowDBNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDBNullUndefined: Self = StObject.set(x, "allowDBNull", js.undefined)
    
    @scala.inline
    def setBaseCatalogName(value: String): Self = StObject.set(x, "baseCatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseColumnName(value: String): Self = StObject.set(x, "baseColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseSchemaName(value: String): Self = StObject.set(x, "baseSchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseServerName(value: String): Self = StObject.set(x, "baseServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTableName(value: String): Self = StObject.set(x, "baseTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrdinal(value: Double): Self = StObject.set(x, "columnOrdinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrdinalUndefined: Self = StObject.set(x, "columnOrdinal", js.undefined)
    
    @scala.inline
    def setColumnSize(value: Double): Self = StObject.set(x, "columnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSizeUndefined: Self = StObject.set(x, "columnSize", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAliased(value: Boolean): Self = StObject.set(x, "isAliased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAliasedUndefined: Self = StObject.set(x, "isAliased", js.undefined)
    
    @scala.inline
    def setIsAutoIncrement(value: Boolean): Self = StObject.set(x, "isAutoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoIncrementUndefined: Self = StObject.set(x, "isAutoIncrement", js.undefined)
    
    @scala.inline
    def setIsBytes(value: Boolean): Self = StObject.set(x, "isBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBytesUndefined: Self = StObject.set(x, "isBytes", js.undefined)
    
    @scala.inline
    def setIsChars(value: Boolean): Self = StObject.set(x, "isChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCharsUndefined: Self = StObject.set(x, "isChars", js.undefined)
    
    @scala.inline
    def setIsExpression(value: Boolean): Self = StObject.set(x, "isExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpressionUndefined: Self = StObject.set(x, "isExpression", js.undefined)
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    @scala.inline
    def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentityUndefined: Self = StObject.set(x, "isIdentity", js.undefined)
    
    @scala.inline
    def setIsJson(value: Boolean): Self = StObject.set(x, "isJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsJsonUndefined: Self = StObject.set(x, "isJson", js.undefined)
    
    @scala.inline
    def setIsKey(value: Boolean): Self = StObject.set(x, "isKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKeyUndefined: Self = StObject.set(x, "isKey", js.undefined)
    
    @scala.inline
    def setIsLong(value: Boolean): Self = StObject.set(x, "isLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLongUndefined: Self = StObject.set(x, "isLong", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
    
    @scala.inline
    def setIsSqlVariant(value: Boolean): Self = StObject.set(x, "isSqlVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSqlVariantUndefined: Self = StObject.set(x, "isSqlVariant", js.undefined)
    
    @scala.inline
    def setIsUdt(value: Boolean): Self = StObject.set(x, "isUdt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUdtUndefined: Self = StObject.set(x, "isUdt", js.undefined)
    
    @scala.inline
    def setIsUnique(value: Boolean): Self = StObject.set(x, "isUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUniqueUndefined: Self = StObject.set(x, "isUnique", js.undefined)
    
    @scala.inline
    def setIsXml(value: Boolean): Self = StObject.set(x, "isXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXmlUndefined: Self = StObject.set(x, "isXml", js.undefined)
    
    @scala.inline
    def setNumericPrecision(value: Double): Self = StObject.set(x, "numericPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericPrecisionUndefined: Self = StObject.set(x, "numericPrecision", js.undefined)
    
    @scala.inline
    def setNumericScale(value: Double): Self = StObject.set(x, "numericScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericScaleUndefined: Self = StObject.set(x, "numericScale", js.undefined)
    
    @scala.inline
    def setUdtAssemblyQualifiedName(value: String): Self = StObject.set(x, "udtAssemblyQualifiedName", value.asInstanceOf[js.Any])
  }
}
