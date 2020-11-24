package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightmapMode extends js.Object {
  
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
  implicit class LightmapModeOps[Self <: LightmapMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLightmapMode(value: Boolean): Self = this.set("lightmapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedNormals(value: Boolean): Self = this.set("needNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedRebuild(value: Boolean): Self = this.set("needRebuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = this.set("shadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularEnabled(value: Boolean): Self = this.set("specularEnabled", value.asInstanceOf[js.Any])
  }
}
