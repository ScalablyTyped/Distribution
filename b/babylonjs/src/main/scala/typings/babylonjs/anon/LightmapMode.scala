package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightmapMode extends StObject {
  
  var lightmapMode: Boolean
  
  var needNormals: Boolean
  
  var needRebuild: Boolean
  
  var shadowEnabled: Boolean
  
  var specularEnabled: Boolean
}
object LightmapMode {
  
  inline def apply(
    lightmapMode: Boolean,
    needNormals: Boolean,
    needRebuild: Boolean,
    shadowEnabled: Boolean,
    specularEnabled: Boolean
  ): LightmapMode = {
    val __obj = js.Dynamic.literal(lightmapMode = lightmapMode.asInstanceOf[js.Any], needNormals = needNormals.asInstanceOf[js.Any], needRebuild = needRebuild.asInstanceOf[js.Any], shadowEnabled = shadowEnabled.asInstanceOf[js.Any], specularEnabled = specularEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightmapMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightmapMode] (val x: Self) extends AnyVal {
    
    inline def setLightmapMode(value: Boolean): Self = StObject.set(x, "lightmapMode", value.asInstanceOf[js.Any])
    
    inline def setNeedNormals(value: Boolean): Self = StObject.set(x, "needNormals", value.asInstanceOf[js.Any])
    
    inline def setNeedRebuild(value: Boolean): Self = StObject.set(x, "needRebuild", value.asInstanceOf[js.Any])
    
    inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
    
    inline def setSpecularEnabled(value: Boolean): Self = StObject.set(x, "specularEnabled", value.asInstanceOf[js.Any])
  }
}
