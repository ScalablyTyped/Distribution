package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptStepDetails extends StObject {
  
  var DestinationFileLocation: InputFileLocation
  
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
  
  /**
    * The type of encryption used. Currently, this value must be PGP.
    */
  var Type: EncryptionType
}
object DecryptStepDetails {
  
  inline def apply(DestinationFileLocation: InputFileLocation, Type: EncryptionType): DecryptStepDetails = {
    val __obj = js.Dynamic.literal(DestinationFileLocation = DestinationFileLocation.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptStepDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptStepDetails] (val x: Self) extends AnyVal {
    
    inline def setDestinationFileLocation(value: InputFileLocation): Self = StObject.set(x, "DestinationFileLocation", value.asInstanceOf[js.Any])
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOverwriteExisting(value: OverwriteExisting): Self = StObject.set(x, "OverwriteExisting", value.asInstanceOf[js.Any])
    
    inline def setOverwriteExistingUndefined: Self = StObject.set(x, "OverwriteExisting", js.undefined)
    
    inline def setSourceFileLocation(value: SourceFileLocation): Self = StObject.set(x, "SourceFileLocation", value.asInstanceOf[js.Any])
    
    inline def setSourceFileLocationUndefined: Self = StObject.set(x, "SourceFileLocation", js.undefined)
    
    inline def setType(value: EncryptionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
