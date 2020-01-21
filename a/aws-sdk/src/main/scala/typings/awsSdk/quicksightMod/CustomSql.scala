package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(DataSourceArn: Arn, Name: CustomSqlName, SqlQuery: SqlQuery, Columns: InputColumnList = null): CustomSql = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SqlQuery = SqlQuery.asInstanceOf[js.Any])
    if (Columns != null) __obj.updateDynamic("Columns")(Columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSql]
  }
}

