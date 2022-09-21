package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SimplificationSettings")
@js.native
open class SimplificationSettings protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SimplificationSettings {
  /**
    * Creates a SimplificationSettings
    * @param quality expected quality
    * @param distance distance when this optimized version should be used
    * @param optimizeMesh already optimized mesh
    */
  def this(
    /** expected quality */
  quality: Double,
    /** distance when this optimized version should be used */
  distance: Double
  ) = this()
  def this(
    /** expected quality */
  quality: Double,
    /** distance when this optimized version should be used */
  distance: Double,
    /** already optimized mesh  */
  optimizeMesh: Boolean
  ) = this()
  
  /**
    * Gets or sets the distance when this optimized version should be used
    */
  /* CompleteClass */
  var distance: Double = js.native
  
  /**
    * Gets or sets the expected quality
    */
  /* CompleteClass */
  var quality: Double = js.native
}
