package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartApplicationRequest extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
    */
  var RunConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.RunConfiguration = js.native
}
object StartApplicationRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, RunConfiguration: RunConfiguration): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RunConfiguration = RunConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  
  @scala.inline
  implicit class StartApplicationRequestMutableBuilder[Self <: StartApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfiguration(value: RunConfiguration): Self = StObject.set(x, "RunConfiguration", value.asInstanceOf[js.Any])
  }
}
