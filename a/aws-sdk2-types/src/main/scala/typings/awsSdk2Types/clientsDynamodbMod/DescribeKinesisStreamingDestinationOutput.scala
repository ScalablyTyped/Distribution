package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKinesisStreamingDestinationOutput extends StObject {
  
  /**
    * The list of replica structures for the table being described.
    */
  var KinesisDataStreamDestinations: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.KinesisDataStreamDestinations] = js.undefined
  
  /**
    * The name of the table being described.
    */
  var TableName: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableName] = js.undefined
}
object DescribeKinesisStreamingDestinationOutput {
  
  inline def apply(): DescribeKinesisStreamingDestinationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKinesisStreamingDestinationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKinesisStreamingDestinationOutput] (val x: Self) extends AnyVal {
    
    inline def setKinesisDataStreamDestinations(value: KinesisDataStreamDestinations): Self = StObject.set(x, "KinesisDataStreamDestinations", value.asInstanceOf[js.Any])
    
    inline def setKinesisDataStreamDestinationsUndefined: Self = StObject.set(x, "KinesisDataStreamDestinations", js.undefined)
    
    inline def setKinesisDataStreamDestinationsVarargs(value: KinesisDataStreamDestination*): Self = StObject.set(x, "KinesisDataStreamDestinations", js.Array(value*))
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
