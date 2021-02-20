package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName = js.native
  
  /**
    * The name of the Timestream table.
    */
  var TableName: ResourceName = js.native
}
object DescribeTableRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, TableName: ResourceName): DescribeTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableRequest]
  }
  
  @scala.inline
  implicit class DescribeTableRequestMutableBuilder[Self <: DescribeTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
