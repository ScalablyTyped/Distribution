package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionTask extends js.Object {
  
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
  implicit class ConversionTaskOps[Self <: ConversionTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConversionTaskId(value: String): Self = this.set("ConversionTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionTaskId: Self = this.set("ConversionTaskId", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("ExpirationTime", js.undefined)
    
    @scala.inline
    def setImportInstance(value: ImportInstanceTaskDetails): Self = this.set("ImportInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportInstance: Self = this.set("ImportInstance", js.undefined)
    
    @scala.inline
    def setImportVolume(value: ImportVolumeTaskDetails): Self = this.set("ImportVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportVolume: Self = this.set("ImportVolume", js.undefined)
    
    @scala.inline
    def setState(value: ConversionTaskState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
