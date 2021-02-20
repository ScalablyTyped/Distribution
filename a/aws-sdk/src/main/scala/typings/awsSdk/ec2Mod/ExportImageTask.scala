package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportImageTask extends StObject {
  
  /**
    * A description of the image being exported.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the export image task.
    */
  var ExportImageTaskId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the image.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * The percent complete of the export image task.
    */
  var Progress: js.UndefOr[String] = js.native
  
  /**
    * Information about the destination Amazon S3 bucket.
    */
  var S3ExportLocation: js.UndefOr[ExportTaskS3Location] = js.native
  
  /**
    * The status of the export image task. The possible values are active, completed, deleting, and deleted.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The status message for the export image task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the image being exported.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ExportImageTask {
  
  @scala.inline
  def apply(): ExportImageTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportImageTask]
  }
  
  @scala.inline
  implicit class ExportImageTaskMutableBuilder[Self <: ExportImageTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExportImageTaskId(value: String): Self = StObject.set(x, "ExportImageTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportImageTaskIdUndefined: Self = StObject.set(x, "ExportImageTaskId", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setS3ExportLocation(value: ExportTaskS3Location): Self = StObject.set(x, "S3ExportLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ExportLocationUndefined: Self = StObject.set(x, "S3ExportLocation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
