package typings.babylonjs.engineAlphaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  @js.native
  trait ThinEngine extends js.Object {
    /**
      * Gets the current alpha equation.
      * @returns the current alpha equation
      */
    def getAlphaEquation(): Double = js.native
    /**
      * Gets the current alpha mode
      * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
      * @returns the current alpha mode
      */
    def getAlphaMode(): Double = js.native
    /**
      * Sets alpha constants used by some alpha blending modes
      * @param r defines the red component
      * @param g defines the green component
      * @param b defines the blue component
      * @param a defines the alpha component
      */
    def setAlphaConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    /**
      * Sets the current alpha equation
      * @param equation defines the equation to use (one of the Engine.ALPHA_EQUATION_XXX)
      */
    def setAlphaEquation(equation: Double): Unit = js.native
    /**
      * Sets the current alpha mode
      * @param mode defines the mode to use (one of the Engine.ALPHA_XXX)
      * @param noDepthWriteChange defines if depth writing state should remains unchanged (false by default)
      * @see http://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered
      */
    def setAlphaMode(mode: Double): Unit = js.native
    def setAlphaMode(mode: Double, noDepthWriteChange: Boolean): Unit = js.native
  }
  
}

