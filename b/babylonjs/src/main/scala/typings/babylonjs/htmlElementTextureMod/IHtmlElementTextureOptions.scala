package typings.babylonjs.htmlElementTextureMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHtmlElementTextureOptions extends js.Object {
  
  /**
    * Defines the engine instance to use the texture with. It is not mandatory if you define a scene.
    */
  var engine: Nullable[ThinEngine] = js.native
  
  /**
    * Defines wether mip maps should be created or not.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the sampling mode of the texture.
    */
  var samplingMode: js.UndefOr[Double] = js.native
  
  /**
    * Defines the scene the texture belongs to. It is not mandatory if you define an engine.
    */
  var scene: Nullable[Scene] = js.native
}
object IHtmlElementTextureOptions {
  
  @scala.inline
  def apply(): IHtmlElementTextureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHtmlElementTextureOptions]
  }
  
  @scala.inline
  implicit class IHtmlElementTextureOptionsOps[Self <: IHtmlElementTextureOptions] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: Nullable[ThinEngine]): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineNull: Self = this.set("engine", null)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = this.set("generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateMipMaps: Self = this.set("generateMipMaps", js.undefined)
    
    @scala.inline
    def setSamplingMode(value: Double): Self = this.set("samplingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingMode: Self = this.set("samplingMode", js.undefined)
    
    @scala.inline
    def setScene(value: Nullable[Scene]): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneNull: Self = this.set("scene", null)
  }
}
