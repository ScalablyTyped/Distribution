package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamAction extends js.Object {
  
  /**
    * The name of an Amazon Timestream database.
    */
  var databaseName: TimestreamDatabaseName = js.native
  
  /**
    * Metadata attributes of the time series that are written in each measure record.
    */
  var dimensions: TimestreamDimensionList = js.native
  
  /**
    * The ARN of the role that grants permission to write to the Amazon Timestream database table.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The name of the database table into which to write the measure records.
    */
  var tableName: TimestreamTableName = js.native
  
  /**
    * Specifies an application-defined value to replace the default value assigned to the Timestream record's timestamp in the time column. You can use this property to specify the value and the precision of the Timestream record's timestamp. You can specify a value from the message payload or a value computed by a substitution template. If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the rule. 
    */
  var timestamp: js.UndefOr[TimestreamTimestamp] = js.native
}
object TimestreamAction {
  
  @scala.inline
  def apply(
    databaseName: TimestreamDatabaseName,
    dimensions: TimestreamDimensionList,
    roleArn: AwsArn,
    tableName: TimestreamTableName
  ): TimestreamAction = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamAction]
  }
  
  @scala.inline
  implicit class TimestreamActionOps[Self <: TimestreamAction] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: TimestreamDatabaseName): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(value: TimestreamDimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: TimestreamDimensionList): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: TimestreamTableName): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: TimestreamTimestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
