package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMetadata extends StObject {
  
  /**
    * The type of the column.
    */
  var arrayBaseColumnType: js.UndefOr[Integer] = js.undefined
  
  /**
    * A value that indicates whether the column increments automatically.
    */
  var isAutoIncrement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the column is case-sensitive.
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the column contains currency values.
    */
  var isCurrency: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether an integer column is signed.
    */
  var isSigned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label for the column.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the column.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the column is nullable.
    */
  var nullable: js.UndefOr[Integer] = js.undefined
  
  /**
    * The precision value of a decimal number column.
    */
  var precision: js.UndefOr[Integer] = js.undefined
  
  /**
    * The scale value of a decimal number column.
    */
  var scale: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the schema that owns the table that includes the column.
    */
  var schemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the table that includes the column.
    */
  var tableName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the column.
    */
  var `type`: js.UndefOr[Integer] = js.undefined
  
  /**
    * The database-specific data type of the column.
    */
  var typeName: js.UndefOr[String] = js.undefined
}
object ColumnMetadata {
  
  @scala.inline
  def apply(): ColumnMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMetadata]
  }
  
  @scala.inline
  implicit class ColumnMetadataMutableBuilder[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBaseColumnType(value: Integer): Self = StObject.set(x, "arrayBaseColumnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayBaseColumnTypeUndefined: Self = StObject.set(x, "arrayBaseColumnType", js.undefined)
    
    @scala.inline
    def setIsAutoIncrement(value: Boolean): Self = StObject.set(x, "isAutoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoIncrementUndefined: Self = StObject.set(x, "isAutoIncrement", js.undefined)
    
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    @scala.inline
    def setIsCurrency(value: Boolean): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
    
    @scala.inline
    def setIsSigned(value: Boolean): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSignedUndefined: Self = StObject.set(x, "isSigned", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNullable(value: Integer): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setPrecision(value: Integer): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setScale(value: Integer): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "schemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "schemaName", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    @scala.inline
    def setType(value: Integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
