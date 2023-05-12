package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.EndColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Particle")
@js.native
open class Particle protected () extends StObject {
  def this(options: EndColor) = this()
  
  /**
    * Gets the age of the particle in seconds.
    */
  var age: Double = js.native
  
  /**
    * The color of the particle when it dies.
    */
  var endColor: Color = js.native
  
  /**
    * The scale of the particle when it dies.
    */
  var endScale: Double = js.native
  
  /**
    * The image to use for the particle.
    */
  var image: Any = js.native
  
  /**
    * The dimensions, width by height, to scale the particle image in pixels.
    */
  var imageSize: Cartesian2 = js.native
  
  /**
    * The life of the particle in seconds.
    */
  var life: Double = js.native
  
  /**
    * The mass of the particle in kilograms.
    */
  var mass: Double = js.native
  
  /**
    * Gets the age normalized to a value in the range [0.0, 1.0].
    */
  var normalizedAge: Double = js.native
  
  /**
    * The positon of the particle in world coordinates.
    */
  var position: Cartesian3 = js.native
  
  /**
    * The color of the particle when it is born.
    */
  var startColor: Color = js.native
  
  /**
    * the scale of the particle when it is born.
    */
  var startScale: Double = js.native
  
  /**
    * The velocity of the particle in world coordinates.
    */
  var velocity: Cartesian3 = js.native
}
