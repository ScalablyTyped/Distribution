package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalTable extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn = js.native
  
  /**
    * The column schema of the table.
    */
  var InputColumns: InputColumnList = js.native
  
  /**
    * The name of the relational table.
    */
  var Name: RelationalTableName = js.native
  
  /**
    * The schema name. This name applies to certain relational database engines.
    */
  var Schema: js.UndefOr[RelationalTableSchema] = js.native
}
object RelationalTable {
  
  @scala.inline
  def apply(DataSourceArn: Arn, InputColumns: InputColumnList, Name: RelationalTableName): RelationalTable = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalTable]
  }
  
  @scala.inline
  implicit class RelationalTableMutableBuilder[Self <: RelationalTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputColumns(value: InputColumnList): Self = StObject.set(x, "InputColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputColumnsVarargs(value: InputColumn*): Self = StObject.set(x, "InputColumns", js.Array(value :_*))
    
    @scala.inline
    def setName(value: RelationalTableName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: RelationalTableSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
  }
}
