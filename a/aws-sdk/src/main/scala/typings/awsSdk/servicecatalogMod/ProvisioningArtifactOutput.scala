package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactOutput extends StObject {
  
  /**
    * Description of the provisioning artifact output key.
    */
  var Description: js.UndefOr[OutputDescription] = js.undefined
  
  /**
    * The provisioning artifact output key.
    */
  var Key: js.UndefOr[ProvisioningArtifactOutputKey] = js.undefined
}
object ProvisioningArtifactOutput {
  
  @scala.inline
  def apply(): ProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactOutputMutableBuilder[Self <: ProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: OutputDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKey(value: ProvisioningArtifactOutputKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
