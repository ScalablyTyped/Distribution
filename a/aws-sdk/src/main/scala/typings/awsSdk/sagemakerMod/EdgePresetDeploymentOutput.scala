package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgePresetDeploymentOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the generated deployable resource.
    */
  var Artifact: js.UndefOr[EdgePresetDeploymentArtifact] = js.undefined
  
  /**
    * The status of the deployable resource.
    */
  var Status: js.UndefOr[EdgePresetDeploymentStatus] = js.undefined
  
  /**
    * Returns a message describing the status of the deployed resource.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment type created by SageMaker Edge Manager. Currently only supports Amazon Web Services IoT Greengrass Version 2 components.
    */
  var Type: EdgePresetDeploymentType
}
object EdgePresetDeploymentOutput {
  
  inline def apply(Type: EdgePresetDeploymentType): EdgePresetDeploymentOutput = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgePresetDeploymentOutput]
  }
  
  extension [Self <: EdgePresetDeploymentOutput](x: Self) {
    
    inline def setArtifact(value: EdgePresetDeploymentArtifact): Self = StObject.set(x, "Artifact", value.asInstanceOf[js.Any])
    
    inline def setArtifactUndefined: Self = StObject.set(x, "Artifact", js.undefined)
    
    inline def setStatus(value: EdgePresetDeploymentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: EdgePresetDeploymentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
