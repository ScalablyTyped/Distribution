package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimplificationTask extends StObject {
  
  /**
    * Mesh to simplify
    */
  var mesh: Mesh = js.native
  
  /**
    * Defines if parallel processing can be used
    */
  var parallelProcessing: Boolean = js.native
  
  /**
    * Array of settings
    */
  var settings: js.Array[ISimplificationSettings] = js.native
  
  /**
    * Simplification type
    */
  var simplificationType: SimplificationType = js.native
  
  /**
    * Callback called on success
    */
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.native
}
object ISimplificationTask {
  
  @scala.inline
  def apply(
    mesh: Mesh,
    parallelProcessing: Boolean,
    settings: js.Array[ISimplificationSettings],
    simplificationType: SimplificationType
  ): ISimplificationTask = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], parallelProcessing = parallelProcessing.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], simplificationType = simplificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationTask]
  }
  
  @scala.inline
  implicit class ISimplificationTaskMutableBuilder[Self <: ISimplificationTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMesh(value: Mesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelProcessing(value: Boolean): Self = StObject.set(x, "parallelProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: js.Array[ISimplificationSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: ISimplificationSettings*): Self = StObject.set(x, "settings", js.Array(value :_*))
    
    @scala.inline
    def setSimplificationType(value: SimplificationType): Self = StObject.set(x, "simplificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCallback(value: () => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
  }
}
