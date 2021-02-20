package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightmapMode extends StObject {
  
  var lightmapMode: Boolean = js.native
  
  var needNormals: Boolean = js.native
  
  var needRebuild: Boolean = js.native
  
  var shadowEnabled: Boolean = js.native
  
  var specularEnabled: Boolean = js.native
}
object LightmapMode {
  
  @scala.inline
  def apply(
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
  implicit class LightmapModeMutableBuilder[Self <: LightmapMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLightmapMode(value: Boolean): Self = StObject.set(x, "lightmapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedNormals(value: Boolean): Self = StObject.set(x, "needNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedRebuild(value: Boolean): Self = StObject.set(x, "needRebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularEnabled(value: Boolean): Self = StObject.set(x, "specularEnabled", value.asInstanceOf[js.Any])
  }
}
