package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSoftwareUpdateJobResponse extends StObject {
  
  /**
    * The IoT Job ARN corresponding to this update.
    */
  var IotJobArn: js.UndefOr[string] = js.native
  
  /**
    * The IoT Job Id corresponding to this update.
    */
  var IotJobId: js.UndefOr[string] = js.native
  
  /**
    * The software version installed on the device or devices after the update.
    */
  var PlatformSoftwareVersion: js.UndefOr[string] = js.native
}
object CreateSoftwareUpdateJobResponse {
  
  @scala.inline
  def apply(): CreateSoftwareUpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
  }
  
  @scala.inline
  implicit class CreateSoftwareUpdateJobResponseMutableBuilder[Self <: CreateSoftwareUpdateJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIotJobArn(value: string): Self = StObject.set(x, "IotJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotJobArnUndefined: Self = StObject.set(x, "IotJobArn", js.undefined)
    
    @scala.inline
    def setIotJobId(value: string): Self = StObject.set(x, "IotJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIotJobIdUndefined: Self = StObject.set(x, "IotJobId", js.undefined)
    
    @scala.inline
    def setPlatformSoftwareVersion(value: string): Self = StObject.set(x, "PlatformSoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformSoftwareVersionUndefined: Self = StObject.set(x, "PlatformSoftwareVersion", js.undefined)
  }
}
