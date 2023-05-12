package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKinesisStreamingDestinationOutput extends StObject {
  
  /**
    * <p>The list of replica structures for the table being described.</p>
    */
  var KinesisDataStreamDestinations: js.UndefOr[js.Array[KinesisDataStreamDestination]] = js.undefined
  
  /**
    * <p>The name of the table being described.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DescribeKinesisStreamingDestinationOutput {
  
  inline def apply(): DescribeKinesisStreamingDestinationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKinesisStreamingDestinationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKinesisStreamingDestinationOutput] (val x: Self) extends AnyVal {
    
    inline def setKinesisDataStreamDestinations(value: js.Array[KinesisDataStreamDestination]): Self = StObject.set(x, "KinesisDataStreamDestinations", value.asInstanceOf[js.Any])
    
    inline def setKinesisDataStreamDestinationsUndefined: Self = StObject.set(x, "KinesisDataStreamDestinations", js.undefined)
    
    inline def setKinesisDataStreamDestinationsVarargs(value: KinesisDataStreamDestination*): Self = StObject.set(x, "KinesisDataStreamDestinations", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
