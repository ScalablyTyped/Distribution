package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyStepDetails extends StObject {
  
  /**
    * Specifies the location for the file being copied. Use ${Transfer:username} or ${Transfer:UploadDate} in this field to parametrize the destination prefix by username or uploaded date.   Set the value of DestinationFileLocation to ${Transfer:username} to copy uploaded files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that uploaded the file.   Set the value of DestinationFileLocation to ${Transfer:UploadDate} to copy uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.  The system resolves UploadDate to a date format of YYYY-MM-DD, based on the date the file is uploaded.   
    */
  var DestinationFileLocation: js.UndefOr[InputFileLocation] = js.undefined
  
  /**
    * The name of the step, used as an identifier.
    */
  var Name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * A flag that indicates whether to overwrite an existing file of the same name. The default is FALSE.
    */
  var OverwriteExisting: js.UndefOr[typings.awsSdk.clientsTransferMod.OverwriteExisting] = js.undefined
  
  /**
    * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow.   To use the previous file as the input, enter ${previous.file}. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value.   To use the originally uploaded file location as input for this step, enter ${original.file}.  
    */
  var SourceFileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.SourceFileLocation] = js.undefined
}
object CopyStepDetails {
  
  inline def apply(): CopyStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyStepDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyStepDetails] (val x: Self) extends AnyVal {
    
    inline def setDestinationFileLocation(value: InputFileLocation): Self = StObject.set(x, "DestinationFileLocation", value.asInstanceOf[js.Any])
    
    inline def setDestinationFileLocationUndefined: Self = StObject.set(x, "DestinationFileLocation", js.undefined)
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOverwriteExisting(value: OverwriteExisting): Self = StObject.set(x, "OverwriteExisting", value.asInstanceOf[js.Any])
    
    inline def setOverwriteExistingUndefined: Self = StObject.set(x, "OverwriteExisting", js.undefined)
    
    inline def setSourceFileLocation(value: SourceFileLocation): Self = StObject.set(x, "SourceFileLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceFileLocationUndefined: Self = StObject.set(x, "SourceFileLocation", js.undefined)
  }
}
