package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderingObjectParticleSystem
  extends StObject
     with FluidRenderingObject {
  
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
