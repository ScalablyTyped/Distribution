package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetContentDeliveryDestination extends StObject {
  
  /**
    * Configuration information for delivery of dataset contents to AWS IoT Events.
    */
  var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.native
  
  /**
    * Configuration information for delivery of dataset contents to Amazon S3.
    */
  var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.native
}
object DatasetContentDeliveryDestination {
  
  @scala.inline
  def apply(): DatasetContentDeliveryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentDeliveryDestination]
  }
  
  @scala.inline
  implicit class DatasetContentDeliveryDestinationMutableBuilder[Self <: DatasetContentDeliveryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIotEventsDestinationConfiguration(value: IotEventsDestinationConfiguration): Self = StObject.set(x, "iotEventsDestinationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotEventsDestinationConfigurationUndefined: Self = StObject.set(x, "iotEventsDestinationConfiguration", js.undefined)
    
    @scala.inline
    def setS3DestinationConfiguration(value: S3DestinationConfiguration): Self = StObject.set(x, "s3DestinationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationConfigurationUndefined: Self = StObject.set(x, "s3DestinationConfiguration", js.undefined)
  }
}
