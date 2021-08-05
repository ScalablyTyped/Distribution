package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestreamAction extends StObject {
  
  /**
    * The name of an Amazon Timestream database.
    */
  var databaseName: TimestreamDatabaseName
  
  /**
    * Metadata attributes of the time series that are written in each measure record.
    */
  var dimensions: TimestreamDimensionList
  
  /**
    * The ARN of the role that grants permission to write to the Amazon Timestream database table.
    */
  var roleArn: AwsArn
  
  /**
    * The name of the database table into which to write the measure records.
    */
  var tableName: TimestreamTableName
  
  /**
    * Specifies an application-defined value to replace the default value assigned to the Timestream record's timestamp in the time column. You can use this property to specify the value and the precision of the Timestream record's timestamp. You can specify a value from the message payload or a value computed by a substitution template. If omitted, the topic rule action assigns the timestamp, in milliseconds, at the time it processed the rule. 
    */
  var timestamp: js.UndefOr[TimestreamTimestamp] = js.undefined
}
object TimestreamAction {
  
  inline def apply(
    databaseName: TimestreamDatabaseName,
    dimensions: TimestreamDimensionList,
    roleArn: AwsArn,
    tableName: TimestreamTableName
  ): TimestreamAction = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestreamAction]
  }
  
  extension [Self <: TimestreamAction](x: Self) {
    
    inline def setDatabaseName(value: TimestreamDatabaseName): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: TimestreamDimensionList): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(value: TimestreamDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TimestreamTableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: TimestreamTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
