package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRecorder extends StObject {
  
  /**
    * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the configuration recorder. You cannot change the assigned name.
    */
  var name: js.UndefOr[RecorderName] = js.undefined
  
  /**
    * Specifies the types of AWS resources for which AWS Config records configuration changes.
    */
  var recordingGroup: js.UndefOr[RecordingGroup] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
    */
  var roleARN: js.UndefOr[String] = js.undefined
}
object ConfigurationRecorder {
  
  @scala.inline
  def apply(): ConfigurationRecorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorder]
  }
  
  @scala.inline
  implicit class ConfigurationRecorderMutableBuilder[Self <: ConfigurationRecorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecorderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecordingGroup(value: RecordingGroup): Self = StObject.set(x, "recordingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingGroupUndefined: Self = StObject.set(x, "recordingGroup", js.undefined)
    
    @scala.inline
    def setRoleARN(value: String): Self = StObject.set(x, "roleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "roleARN", js.undefined)
  }
}
