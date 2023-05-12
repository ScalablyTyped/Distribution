package typings.babylonjs

import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.renderingFluidRendererFluidRenderingObjectMod.FluidRenderingObject
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingFluidRendererFluidRenderingObjectParticleSystemMod {
  
  @JSImport("babylonjs/Rendering/fluidRenderer/fluidRenderingObjectParticleSystem", "FluidRenderingObjectParticleSystem")
  @js.native
  open class FluidRenderingObjectParticleSystem protected () extends FluidRenderingObject {
    /**
      * Creates a new instance of the class
      * @param scene The scene the particle system is part of
      * @param ps The particle system
      */
    def this(scene: Scene, ps: IParticleSystem) = this()
    
    /* private */ var _blendMode: Any = js.native
    
    /* private */ var _onBeforeDrawParticleObserver: Any = js.native
    
    /* private */ var _originalRender: Any = js.native
    
    /* private */ var _particleSystem: Any = js.native
    
    /* private */ var _updateInAnimate: Any = js.native
    
    /* private */ var _useTrueRenderingForDiffuseTexture: Any = js.native
    
    /** Gets the particle system */
    def particleSystem: IParticleSystem = js.native
    
    /**
      * Gets or sets a boolean indicating that the diffuse texture should be generated based on the regular rendering of the particle system (default: true).
      * Sometimes, generating the diffuse texture this way may be sub-optimal. In that case, you can disable this property, in which case the particle system will be
      * rendered using a ALPHA_COMBINE mode instead of the one used by the particle system.
      */
    def useTrueRenderingForDiffuseTexture: Boolean = js.native
    def useTrueRenderingForDiffuseTexture_=(use: Boolean): Unit = js.native
  }
}
