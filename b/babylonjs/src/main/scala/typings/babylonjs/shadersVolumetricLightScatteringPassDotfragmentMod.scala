package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadersVolumetricLightScatteringPassDotfragmentMod {
  
  object volumetricLightScatteringPassPixelShader {
    
    @JSImport("babylonjs/Shaders/volumetricLightScatteringPass.fragment", "volumetricLightScatteringPassPixelShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Shaders/volumetricLightScatteringPass.fragment", "volumetricLightScatteringPassPixelShader.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Shaders/volumetricLightScatteringPass.fragment", "volumetricLightScatteringPassPixelShader.shader")
    @js.native
    def shader: String = js.native
    inline def shader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shader")(x.asInstanceOf[js.Any])
  }
}
