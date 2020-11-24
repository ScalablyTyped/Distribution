package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSql extends js.Object {
  
  /**
    * The column schema from the SQL query result set.
    */
  var Columns: js.UndefOr[InputColumnList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var DataSourceArn: Arn = js.native
  
  /**
    * A display name for the SQL query result.
    */
  var Name: CustomSqlName = js.native
  
  /**
    * The SQL query.
    */
  var SqlQuery: typings.awsSdk.quicksightMod.SqlQuery = js.native
}
object CustomSql {
  
  @scala.inline
  def apply(DataSourceArn: Arn, Name: CustomSqlName, SqlQuery: SqlQuery): CustomSql = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SqlQuery = SqlQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSql]
  }
  
  @scala.inline
  implicit class CustomSqlOps[Self <: CustomSql] (val x: Self) extends AnyVal {
    
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
    def setName(value: CustomSqlName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlQuery(value: SqlQuery): Self = this.set("SqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: InputColumn*): Self = this.set("Columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: InputColumnList): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("Columns", js.undefined)
  }
}
