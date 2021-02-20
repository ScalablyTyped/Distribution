package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionTask extends StObject {
  
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: js.UndefOr[String] = js.native
  
  /**
    * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel the task.
    */
  var ExpirationTime: js.UndefOr[String] = js.native
  
  /**
    * If the task is for importing an instance, this contains information about the import instance task.
    */
  var ImportInstance: js.UndefOr[ImportInstanceTaskDetails] = js.native
  
  /**
    * If the task is for importing a volume, this contains information about the import volume task.
    */
  var ImportVolume: js.UndefOr[ImportVolumeTaskDetails] = js.native
  
  /**
    * The state of the conversion task.
    */
  var State: js.UndefOr[ConversionTaskState] = js.native
  
  /**
    * The status message related to the conversion task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ConversionTask {
  
  @scala.inline
  def apply(): ConversionTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionTask]
  }
  
  @scala.inline
  implicit class ConversionTaskMutableBuilder[Self <: ConversionTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionTaskId(value: String): Self = StObject.set(x, "ConversionTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionTaskIdUndefined: Self = StObject.set(x, "ConversionTaskId", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setImportInstance(value: ImportInstanceTaskDetails): Self = StObject.set(x, "ImportInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportInstanceUndefined: Self = StObject.set(x, "ImportInstance", js.undefined)
    
    @scala.inline
    def setImportVolume(value: ImportVolumeTaskDetails): Self = StObject.set(x, "ImportVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportVolumeUndefined: Self = StObject.set(x, "ImportVolume", js.undefined)
    
    @scala.inline
    def setState(value: ConversionTaskState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
