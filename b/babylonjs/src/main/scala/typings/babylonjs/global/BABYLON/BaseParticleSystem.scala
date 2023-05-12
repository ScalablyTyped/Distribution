package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseParticleSystem")
@js.native
open class BaseParticleSystem protected ()
  extends StObject
     with typings.babylonjs.BABYLON.BaseParticleSystem {
  /**
    * Instantiates a particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    */
  def this(name: String) = this()
  
  /**
    * Gets or sets the active clipplane 1
    */
  /* CompleteClass */
  var clipPlane: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 2
    */
  /* CompleteClass */
  var clipPlane2: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 3
    */
  /* CompleteClass */
  var clipPlane3: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 4
    */
  /* CompleteClass */
  var clipPlane4: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 5
    */
  /* CompleteClass */
  var clipPlane5: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 6
    */
  /* CompleteClass */
  var clipPlane6: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
}
/* static members */
object BaseParticleSystem {
  
  @JSGlobal("BABYLON.BaseParticleSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add current color and particle color multiplied by particle’s alpha
    */
  @JSGlobal("BABYLON.BaseParticleSystem.BLENDMODE_ADD")
  @js.native
  def BLENDMODE_ADD: Double = js.native
  inline def BLENDMODE_ADD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_ADD")(x.asInstanceOf[js.Any])
  
  /**
    * Multiply current color with particle color
    */
  @JSGlobal("BABYLON.BaseParticleSystem.BLENDMODE_MULTIPLY")
  @js.native
  def BLENDMODE_MULTIPLY: Double = js.native
  
  /**
    * Multiply current color with particle color then add current color and particle color multiplied by particle’s alpha
    */
  @JSGlobal("BABYLON.BaseParticleSystem.BLENDMODE_MULTIPLYADD")
  @js.native
  def BLENDMODE_MULTIPLYADD: Double = js.native
  inline def BLENDMODE_MULTIPLYADD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_MULTIPLYADD")(x.asInstanceOf[js.Any])
  
  inline def BLENDMODE_MULTIPLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_MULTIPLY")(x.asInstanceOf[js.Any])
  
  /**
    * Source color is added to the destination color without alpha affecting the result
    */
  @JSGlobal("BABYLON.BaseParticleSystem.BLENDMODE_ONEONE")
  @js.native
  def BLENDMODE_ONEONE: Double = js.native
  inline def BLENDMODE_ONEONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_ONEONE")(x.asInstanceOf[js.Any])
  
  /**
    * Blend current color and particle color using particle’s alpha
    */
  @JSGlobal("BABYLON.BaseParticleSystem.BLENDMODE_STANDARD")
  @js.native
  def BLENDMODE_STANDARD: Double = js.native
  inline def BLENDMODE_STANDARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_STANDARD")(x.asInstanceOf[js.Any])
}
