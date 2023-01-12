package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStepDetails extends StObject {
  
  /**
    * The name of the step, used as an identifier.
    */
  var Name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow.   Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value.   Enter ${original.file} to use the originally-uploaded file location as input for this step.  
    */
  var SourceFileLocation: js.UndefOr[typings.awsSdk.clientsTransferMod.SourceFileLocation] = js.undefined
}
object DeleteStepDetails {
  
  inline def apply(): DeleteStepDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStepDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStepDetails] (val x: Self) extends AnyVal {
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSourceFileLocation(value: SourceFileLocation): Self = StObject.set(x, "SourceFileLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceFileLocationUndefined: Self = StObject.set(x, "SourceFileLocation", js.undefined)
  }
}
