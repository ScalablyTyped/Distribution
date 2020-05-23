package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ColorGradient")
@js.native
class ColorGradient ()
  extends typings.babylonjs.BABYLON.ColorGradient {
  /**
    * Gets or sets first associated color
    */
  /* CompleteClass */
  override var color1: typings.babylonjs.BABYLON.Color4 = js.native
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  /* CompleteClass */
  override var gradient: Double = js.native
  /**
    * Will get a color picked randomly between color1 and color2.
    * If color2 is undefined then color1 will be used
    * @param result defines the target Color4 to store the result in
    */
  /* CompleteClass */
  override def getColorToRef(result: typings.babylonjs.BABYLON.Color4): Unit = js.native
}

