package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlRunConfiguration extends StObject {
  
  /**
    * The input source ID. You can get this ID by calling the DescribeApplication operation. 
    */
  var InputId: Id = js.native
  
  /**
    * The point at which you want the application to start processing records from the streaming source. 
    */
  var InputStartingPositionConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration = js.native
}
object SqlRunConfiguration {
  
  @scala.inline
  def apply(InputId: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): SqlRunConfiguration = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlRunConfiguration]
  }
  
  @scala.inline
  implicit class SqlRunConfigurationMutableBuilder[Self <: SqlRunConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
  }
}
