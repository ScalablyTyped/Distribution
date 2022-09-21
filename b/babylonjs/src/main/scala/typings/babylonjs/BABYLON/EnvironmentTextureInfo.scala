package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.BABYLON.EnvironmentTextureInfoV1
  - typings.babylonjs.BABYLON.EnvironmentTextureInfoV2
*/
trait EnvironmentTextureInfo extends StObject
object EnvironmentTextureInfo {
  
  inline def EnvironmentTextureInfoV1(irradiance: Any, specular: Any, width: Double): typings.babylonjs.BABYLON.EnvironmentTextureInfoV1 = {
    val __obj = js.Dynamic.literal(irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 1, width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babylonjs.BABYLON.EnvironmentTextureInfoV1]
  }
  
  inline def EnvironmentTextureInfoV2(imageType: String, irradiance: Any, specular: Any, width: Double): typings.babylonjs.BABYLON.EnvironmentTextureInfoV2 = {
    val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], irradiance = irradiance.asInstanceOf[js.Any], specular = specular.asInstanceOf[js.Any], version = 2, width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babylonjs.BABYLON.EnvironmentTextureInfoV2]
  }
}
