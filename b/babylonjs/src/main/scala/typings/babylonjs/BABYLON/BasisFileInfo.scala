package typings.babylonjs.BABYLON

import typings.babylonjs.AnonLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info about the .basis files
  */
@JSGlobal("BABYLON.BasisFileInfo")
@js.native
class BasisFileInfo () extends js.Object {
  /**
    * If the file has alpha
    */
  var hasAlpha: Boolean = js.native
  /**
    * Info about each image of the basis file
    */
  var images: js.Array[AnonLevels] = js.native
}

