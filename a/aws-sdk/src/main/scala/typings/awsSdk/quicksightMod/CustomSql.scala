package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSql extends StObject {
  
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
  implicit class CustomSqlMutableBuilder[Self <: CustomSql] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: InputColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: InputColumn*): Self = StObject.set(x, "Columns", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: CustomSqlName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlQuery(value: SqlQuery): Self = StObject.set(x, "SqlQuery", value.asInstanceOf[js.Any])
  }
}
