package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends StObject {
  
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typings.awsSdk.servicecatalogMod.FailedServiceActionAssociations] = js.undefined
}
object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
  
  @scala.inline
  def apply(): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit class BatchDisassociateServiceActionFromProvisioningArtifactOutputMutableBuilder[Self <: BatchDisassociateServiceActionFromProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedServiceActionAssociations(value: FailedServiceActionAssociations): Self = StObject.set(x, "FailedServiceActionAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedServiceActionAssociationsUndefined: Self = StObject.set(x, "FailedServiceActionAssociations", js.undefined)
    
    @scala.inline
    def setFailedServiceActionAssociationsVarargs(value: FailedServiceActionAssociation*): Self = StObject.set(x, "FailedServiceActionAssociations", js.Array(value :_*))
  }
}
