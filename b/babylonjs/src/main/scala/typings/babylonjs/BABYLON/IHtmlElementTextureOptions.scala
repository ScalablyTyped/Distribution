package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHtmlElementTextureOptions extends StObject {
  
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
  implicit class IHtmlElementTextureOptionsMutableBuilder[Self <: IHtmlElementTextureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: Nullable[ThinEngine]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineNull: Self = StObject.set(x, "engine", null)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    @scala.inline
    def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    @scala.inline
    def setScene(value: Nullable[Scene]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneNull: Self = StObject.set(x, "scene", null)
  }
}
