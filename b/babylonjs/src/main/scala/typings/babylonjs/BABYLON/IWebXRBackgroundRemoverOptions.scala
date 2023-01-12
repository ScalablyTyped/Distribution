package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Ground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRBackgroundRemoverOptions extends StObject {
  
  /**
    * Further background meshes to disable when entering AR
    */
  var backgroundMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
  
  /**
    * flags to configure the removal of the environment helper.
    * If not set, the entire background will be removed. If set, flags should be set as well.
    */
  var environmentHelperRemovalFlags: js.UndefOr[Ground] = js.undefined
  
  /**
    * don't disable the environment helper
    */
  var ignoreEnvironmentHelper: js.UndefOr[Boolean] = js.undefined
}
object IWebXRBackgroundRemoverOptions {
  
  inline def apply(): IWebXRBackgroundRemoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRBackgroundRemoverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRBackgroundRemoverOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "backgroundMeshes", value.asInstanceOf[js.Any])
    
    inline def setBackgroundMeshesUndefined: Self = StObject.set(x, "backgroundMeshes", js.undefined)
    
    inline def setBackgroundMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "backgroundMeshes", js.Array(value*))
    
    inline def setEnvironmentHelperRemovalFlags(value: Ground): Self = StObject.set(x, "environmentHelperRemovalFlags", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentHelperRemovalFlagsUndefined: Self = StObject.set(x, "environmentHelperRemovalFlags", js.undefined)
    
    inline def setIgnoreEnvironmentHelper(value: Boolean): Self = StObject.set(x, "ignoreEnvironmentHelper", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEnvironmentHelperUndefined: Self = StObject.set(x, "ignoreEnvironmentHelper", js.undefined)
  }
}
