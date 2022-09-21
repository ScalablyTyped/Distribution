package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ColorGradient")
@js.native
open class ColorGradient protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ColorGradient {
  /**
    * Creates a new color4 gradient
    * @param gradient gets or sets the gradient value (between 0 and 1)
    * @param color1 gets or sets first associated color
    * @param color2 gets or sets first second color
    */
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets first associated color
    */
  color1: typings.babylonjs.BABYLON.Color4
  ) = this()
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets first associated color
    */
  color1: typings.babylonjs.BABYLON.Color4,
    /**
    * Gets or sets second associated color
    */
  color2: typings.babylonjs.BABYLON.Color4
  ) = this()
  
  /**
    * Gets or sets first associated color
    */
  /* CompleteClass */
  var color1: typings.babylonjs.BABYLON.Color4 = js.native
  
  /**
    * Will get a color picked randomly between color1 and color2.
    * If color2 is undefined then color1 will be used
    * @param result defines the target Color4 to store the result in
    */
  /* CompleteClass */
  override def getColorToRef(result: typings.babylonjs.BABYLON.Color4): Unit = js.native
  
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  /* CompleteClass */
  var gradient: Double = js.native
}
