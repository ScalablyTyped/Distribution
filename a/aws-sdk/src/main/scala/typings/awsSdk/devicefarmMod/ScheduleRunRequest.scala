package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleRunRequest extends StObject {
  
  /**
    * The ARN of an application package to run tests against, created with CreateUpload. See ListUploads.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Information about the settings for the run to be scheduled.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined
  
  /**
    * The ARN of the device pool for the run to be scheduled.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The filter criteria used to dynamically select a set of devices for a test run and the maximum number of devices to be included in the run. Either  devicePoolArn  or  deviceSelectionConfiguration  is required in a request.
    */
  var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.undefined
  
  /**
    * Specifies configuration information about a test run, such as the execution timeout (in minutes).
    */
  var executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.undefined
  
  /**
    * The name for the run to be scheduled.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The ARN of the project for the run to be scheduled.
    */
  var projectArn: AmazonResourceName
  
  /**
    * Information about the test for the run to be scheduled.
    */
  var test: ScheduleRunTest
}
object ScheduleRunRequest {
  
  inline def apply(projectArn: AmazonResourceName, test: ScheduleRunTest): ScheduleRunRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunRequest]
  }
  
  extension [Self <: ScheduleRunRequest](x: Self) {
    
    inline def setAppArn(value: AmazonResourceName): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    inline def setConfiguration(value: ScheduleRunConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDevicePoolArn(value: AmazonResourceName): Self = StObject.set(x, "devicePoolArn", value.asInstanceOf[js.Any])
    
    inline def setDevicePoolArnUndefined: Self = StObject.set(x, "devicePoolArn", js.undefined)
    
    inline def setDeviceSelectionConfiguration(value: DeviceSelectionConfiguration): Self = StObject.set(x, "deviceSelectionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceSelectionConfigurationUndefined: Self = StObject.set(x, "deviceSelectionConfiguration", js.undefined)
    
    inline def setExecutionConfiguration(value: ExecutionConfiguration): Self = StObject.set(x, "executionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExecutionConfigurationUndefined: Self = StObject.set(x, "executionConfiguration", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectArn(value: AmazonResourceName): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    inline def setTest(value: ScheduleRunTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
