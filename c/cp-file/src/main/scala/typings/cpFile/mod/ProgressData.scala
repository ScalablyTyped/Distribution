package typings.cpFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  /**
  		Absolute path to destination.
  		*/
  var dest: String
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
  var src: String
  /**
  		Copied size in bytes.
  		*/
  var written: Double
}

object ProgressData {
  @scala.inline
  def apply(dest: String, percent: Double, size: Double, src: String, written: Double): ProgressData = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressData]
  }
}

