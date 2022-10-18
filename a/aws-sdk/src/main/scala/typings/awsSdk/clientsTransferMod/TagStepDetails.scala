package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagStepDetails extends StObject {
  
  /**
    * The name of the step, used as an identifier.
    */
  var Name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow.   Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value.   Enter ${original.file} to use the originally-uploaded file location as input for this step.  
    */
  var SourceFileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.SourceFileLocation] = js.undefined
  
  /**
    * Array that contains from 1 to 10 key/value pairs.
    */
  var Tags: js.UndefOr[S3Tags] = js.undefined
}
object TagStepDetails {
  
  inline def apply(): TagStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagStepDetails]
  }
  
  extension [Self <: TagStepDetails](x: Self) {
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSourceFileLocation(value: SourceFileLocation): Self = StObject.set(x, "SourceFileLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceFileLocationUndefined: Self = StObject.set(x, "SourceFileLocation", js.undefined)
    
    inline def setTags(value: S3Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
