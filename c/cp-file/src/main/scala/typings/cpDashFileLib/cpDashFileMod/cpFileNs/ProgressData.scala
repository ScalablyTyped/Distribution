package typings
package cpDashFileLib.cpDashFileMod.cpFileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  /**
  		Absolute path to destination.
  		*/
  var dest: java.lang.String
  /**
  		Copied percentage, a value between `0` and `1`.
  		*/
  var percent: scala.Double
  /**
  		File size in bytes.
  		*/
  var size: scala.Double
  /**
  		Absolute path to source.
  		*/
  var src: java.lang.String
  /**
  		Copied size in bytes.
  		*/
  var written: scala.Double
}

object ProgressData {
  @scala.inline
  def apply(
    dest: java.lang.String,
    percent: scala.Double,
    size: scala.Double,
    src: java.lang.String,
    written: scala.Double
  ): ProgressData = {
    val __obj = js.Dynamic.literal(dest = dest, percent = percent, size = size, src = src, written = written)
  
    __obj.asInstanceOf[ProgressData]
  }
}

