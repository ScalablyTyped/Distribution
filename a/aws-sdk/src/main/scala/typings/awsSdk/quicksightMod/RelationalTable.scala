package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalTable extends js.Object {
  
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
  implicit class RelationalTableOps[Self <: RelationalTable] (val x: Self) extends AnyVal {
    
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
    def setDataSourceArn(value: Arn): Self = this.set("DataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputColumnsVarargs(value: InputColumn*): Self = this.set("InputColumns", js.Array(value :_*))
    
    @scala.inline
    def setInputColumns(value: InputColumnList): Self = this.set("InputColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RelationalTableName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: RelationalTableSchema): Self = this.set("Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
  }
}
