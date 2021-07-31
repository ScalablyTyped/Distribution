package typings.awsSdk.redshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMetadata extends StObject {
  
  /**
    * The default value of the column. 
    */
  var columnDefault: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether the column is case-sensitive. 
    */
  var isCaseSensitive: js.UndefOr[bool] = js.undefined
  
  /**
    * A value that indicates whether the column contains currency values.
    */
  var isCurrency: js.UndefOr[bool] = js.undefined
  
  /**
    * A value that indicates whether an integer column is signed.
    */
  var isSigned: js.UndefOr[bool] = js.undefined
  
  /**
    * The label for the column. 
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The length of the column.
    */
  var length: js.UndefOr[Integer] = js.undefined
  
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
    * The name of the schema that contains the table that includes the column.
    */
  var schemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the table that includes the column. 
    */
  var tableName: js.UndefOr[String] = js.undefined
  
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
    def setColumnDefault(value: String): Self = StObject.set(x, "columnDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDefaultUndefined: Self = StObject.set(x, "columnDefault", js.undefined)
    
    @scala.inline
    def setIsCaseSensitive(value: bool): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    @scala.inline
    def setIsCurrency(value: bool): Self = StObject.set(x, "isCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrencyUndefined: Self = StObject.set(x, "isCurrency", js.undefined)
    
    @scala.inline
    def setIsSigned(value: bool): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSignedUndefined: Self = StObject.set(x, "isSigned", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLength(value: Integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
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
    def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
