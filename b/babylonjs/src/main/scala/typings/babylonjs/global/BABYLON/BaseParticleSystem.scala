package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseParticleSystem")
@js.native
class BaseParticleSystem protected ()
  extends typings.babylonjs.BABYLON.BaseParticleSystem {
  /**
    * Instantiates a particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    */
  def this(name: String) = this()
}
/* static members */
@JSGlobal("BABYLON.BaseParticleSystem")
@js.native
object BaseParticleSystem extends js.Object {
  
  /**
    * Add current color and particle color multiplied by particle’s alpha
    */
  var BLENDMODE_ADD: Double = js.native
  
  /**
    * Multiply current color with particle color
    */
  var BLENDMODE_MULTIPLY: Double = js.native
  
  /**
    * Multiply current color with particle color then add current color and particle color multiplied by particle’s alpha
    */
  var BLENDMODE_MULTIPLYADD: Double = js.native
  
  /**
    * Source color is added to the destination color without alpha affecting the result
    */
  var BLENDMODE_ONEONE: Double = js.native
  
  /**
    * Blend current color and particle color using particle’s alpha
    */
  var BLENDMODE_STANDARD: Double = js.native
}
