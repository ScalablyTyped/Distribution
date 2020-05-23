package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Levels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info about the .basis files
  */
@JSGlobal("BABYLON.BasisFileInfo")
@js.native
class BasisFileInfo ()
  extends typings.babylonjs.BABYLON.BasisFileInfo {
  /**
    * If the file has alpha
    */
  /* CompleteClass */
  override var hasAlpha: Boolean = js.native
  /**
    * Info about each image of the basis file
    */
  /* CompleteClass */
  override var images: js.Array[Levels] = js.native
}

