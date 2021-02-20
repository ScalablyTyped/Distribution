package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageDescriptor extends StObject {
  
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var BucketColumns: js.UndefOr[NameStringList] = js.native
  
  /**
    * A list of the Columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.native
  
  /**
    *  True if the data in the table is compressed, or False if not.
    */
  var Compressed: js.UndefOr[Boolean] = js.native
  
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var InputFormat: js.UndefOr[FormatString] = js.native
  
  /**
    * The physical location of the table. By default, this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var Location: js.UndefOr[LocationString] = js.native
  
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var NumberOfBuckets: js.UndefOr[Integer] = js.native
  
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var OutputFormat: js.UndefOr[FormatString] = js.native
  
  /**
    * The user-supplied properties in key-value form.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * An object that references a schema stored in the AWS Glue Schema Registry. When creating a table, you can pass an empty list of columns for the schema, and instead use a schema reference.
    */
  var SchemaReference: js.UndefOr[typings.awsSdk.glueMod.SchemaReference] = js.native
  
  /**
    * The serialization/deserialization (SerDe) information.
    */
  var SerdeInfo: js.UndefOr[SerDeInfo] = js.native
  
  /**
    * The information about values that appear frequently in a column (skewed values).
    */
  var SkewedInfo: js.UndefOr[typings.awsSdk.glueMod.SkewedInfo] = js.native
  
  /**
    * A list specifying the sort order of each bucket in the table.
    */
  var SortColumns: js.UndefOr[OrderList] = js.native
  
  /**
    *  True if the table data is stored in subdirectories, or False if not.
    */
  var StoredAsSubDirectories: js.UndefOr[Boolean] = js.native
}
object StorageDescriptor {
  
  @scala.inline
  def apply(): StorageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageDescriptor]
  }
  
  @scala.inline
  implicit class StorageDescriptorMutableBuilder[Self <: StorageDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketColumns(value: NameStringList): Self = StObject.set(x, "BucketColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketColumnsUndefined: Self = StObject.set(x, "BucketColumns", js.undefined)
    
    @scala.inline
    def setBucketColumnsVarargs(value: NameString*): Self = StObject.set(x, "BucketColumns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
    
    @scala.inline
    def setCompressed(value: Boolean): Self = StObject.set(x, "Compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressedUndefined: Self = StObject.set(x, "Compressed", js.undefined)
    
    @scala.inline
    def setInputFormat(value: FormatString): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFormatUndefined: Self = StObject.set(x, "InputFormat", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationString): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setNumberOfBuckets(value: Integer): Self = StObject.set(x, "NumberOfBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBucketsUndefined: Self = StObject.set(x, "NumberOfBuckets", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: FormatString): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setSchemaReference(value: SchemaReference): Self = StObject.set(x, "SchemaReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaReferenceUndefined: Self = StObject.set(x, "SchemaReference", js.undefined)
    
    @scala.inline
    def setSerdeInfo(value: SerDeInfo): Self = StObject.set(x, "SerdeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerdeInfoUndefined: Self = StObject.set(x, "SerdeInfo", js.undefined)
    
    @scala.inline
    def setSkewedInfo(value: SkewedInfo): Self = StObject.set(x, "SkewedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedInfoUndefined: Self = StObject.set(x, "SkewedInfo", js.undefined)
    
    @scala.inline
    def setSortColumns(value: OrderList): Self = StObject.set(x, "SortColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortColumnsUndefined: Self = StObject.set(x, "SortColumns", js.undefined)
    
    @scala.inline
    def setSortColumnsVarargs(value: Order*): Self = StObject.set(x, "SortColumns", js.Array(value :_*))
    
    @scala.inline
    def setStoredAsSubDirectories(value: Boolean): Self = StObject.set(x, "StoredAsSubDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredAsSubDirectoriesUndefined: Self = StObject.set(x, "StoredAsSubDirectories", js.undefined)
  }
}
