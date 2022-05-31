package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHtmlElementTextureOptions extends StObject {
  
  /**
    * Defines the engine instance to use the texture with. It is not mandatory if you define a scene.
    */
  var engine: Nullable[ThinEngine]
  
  /**
    * Defines wether mip maps should be created or not.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the sampling mode of the texture.
    */
  var samplingMode: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the scene the texture belongs to. It is not mandatory if you define an engine.
    */
  var scene: Nullable[Scene]
}
object IHtmlElementTextureOptions {
  
  inline def apply(): IHtmlElementTextureOptions = {
    val __obj = js.Dynamic.literal(engine = null, scene = null)
    __obj.asInstanceOf[IHtmlElementTextureOptions]
  }
  
  extension [Self <: IHtmlElementTextureOptions](x: Self) {
    
    inline def setEngine(value: Nullable[ThinEngine]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineNull: Self = StObject.set(x, "engine", null)
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    inline def setScene(value: Nullable[Scene]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSceneNull: Self = StObject.set(x, "scene", null)
  }
}
