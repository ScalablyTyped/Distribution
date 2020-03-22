package typings.cpFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  /**
  		Absolute path to destination.
  		*/
  var destinationPath: String
  /**
  		Copied percentage, a value between `0` and `1`.
  		*/
  var percent: Double
  /**
  		File size in bytes.
  		*/
  var size: Double
  /**
  		Absolute path to source.
  		*/
  var sourcePath: String
  /**
  		Copied size in bytes.
  		*/
  var writtenBytes: Double
}

object ProgressData {
  @scala.inline
  def apply(destinationPath: String, percent: Double, size: Double, sourcePath: String, writtenBytes: Double): ProgressData = {
    val __obj = js.Dynamic.literal(destinationPath = destinationPath.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], writtenBytes = writtenBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressData]
  }
}

