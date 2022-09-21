package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimplificationTask extends StObject {
  
  /**
    * Mesh to simplify
    */
  var mesh: Mesh
  
  /**
    * Defines if parallel processing can be used
    */
  var parallelProcessing: Boolean
  
  /**
    * Array of settings
    */
  var settings: js.Array[ISimplificationSettings]
  
  /**
    * Simplification type
    */
  var simplificationType: SimplificationType
  
  /**
    * Callback called on success
    */
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ISimplificationTask {
  
  inline def apply(
    mesh: Mesh,
    parallelProcessing: Boolean,
    settings: js.Array[ISimplificationSettings],
    simplificationType: SimplificationType
  ): ISimplificationTask = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], parallelProcessing = parallelProcessing.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], simplificationType = simplificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationTask]
  }
  
  extension [Self <: ISimplificationTask](x: Self) {
    
    inline def setMesh(value: Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setParallelProcessing(value: Boolean): Self = StObject.set(x, "parallelProcessing", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Array[ISimplificationSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsVarargs(value: ISimplificationSettings*): Self = StObject.set(x, "settings", js.Array(value*))
    
    inline def setSimplificationType(value: SimplificationType): Self = StObject.set(x, "simplificationType", value.asInstanceOf[js.Any])
    
    inline def setSuccessCallback(value: () => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction0(value))
    
    inline def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
  }
}
