package typings.babylonjs.basisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of transcoding a basis file
  */
trait TranscodeResult extends js.Object {
  /**
    * Info about the .basis file
    */
  var fileInfo: BasisFileInfo
  /**
    * Format to use when loading the file
    */
  var format: Double
}

object TranscodeResult {
  @scala.inline
  def apply(fileInfo: BasisFileInfo, format: Double): TranscodeResult = {
    val __obj = js.Dynamic.literal(fileInfo = fileInfo.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TranscodeResult]
  }
}

