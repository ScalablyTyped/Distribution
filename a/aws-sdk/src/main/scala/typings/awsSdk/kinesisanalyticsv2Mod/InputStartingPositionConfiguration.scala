package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputStartingPositionConfiguration extends StObject {
  
  /**
    * The starting position on the stream.    NOW - Start reading just after the most recent record in the stream, and start at the request timestamp that the customer issued.    TRIM_HORIZON - Start reading at the last untrimmed record in the stream, which is the oldest record available in the stream. This option is not available for an Amazon Kinesis Data Firehose delivery stream.    LAST_STOPPED_POINT - Resume reading from where the application last stopped reading.  
    */
  var InputStartingPosition: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPosition] = js.native
}
object InputStartingPositionConfiguration {
  
  @scala.inline
  def apply(): InputStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class InputStartingPositionConfigurationMutableBuilder[Self <: InputStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputStartingPosition(value: InputStartingPosition): Self = StObject.set(x, "InputStartingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionUndefined: Self = StObject.set(x, "InputStartingPosition", js.undefined)
  }
}
