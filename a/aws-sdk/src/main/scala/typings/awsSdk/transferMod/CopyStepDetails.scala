package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyStepDetails extends StObject {
  
  /**
    * Specifies the location for the file being copied. Only applicable for Copy type workflow steps. Use ${Transfer:username} in this field to parametrize the destination prefix by username.
    */
  var DestinationFileLocation: js.UndefOr[InputFileLocation] = js.undefined
  
  /**
    * The name of the step, used as an identifier.
    */
  var Name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
    */
  var OverwriteExisting: js.UndefOr[typings.awsSdk.transferMod.OverwriteExisting] = js.undefined
  
  /**
    * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow.   Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value.   Enter ${original.file} to use the originally-uploaded file location as input for this step.  
    */
  var SourceFileLocation: js.UndefOr[typings.awsSdk.transferMod.SourceFileLocation] = js.undefined
}
object CopyStepDetails {
  
  inline def apply(): CopyStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyStepDetails]
  }
  
  extension [Self <: CopyStepDetails](x: Self) {
    
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
