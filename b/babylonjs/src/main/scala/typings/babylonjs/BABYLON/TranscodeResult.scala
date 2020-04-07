package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of transcoding a basis file
  */
@JSGlobal("BABYLON.TranscodeResult")
@js.native
class TranscodeResult () extends js.Object {
  /**
    * Info about the .basis file
    */
  var fileInfo: BasisFileInfo = js.native
  /**
    * Format to use when loading the file
    */
  var format: Double = js.native
}

