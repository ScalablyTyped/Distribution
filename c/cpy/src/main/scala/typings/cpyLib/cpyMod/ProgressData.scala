package typings
package cpyLib.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  /**
  		Copied file count.
  		*/
  var completedFiles: scala.Double
  /**
  		Completed size in bytes.
  		*/
  var completedSize: scala.Double
  /**
  		Completed percentage. A value between `0` and `1`.
  		*/
  var percent: scala.Double
  /**
  		Overall file count.
  		*/
  var totalFiles: scala.Double
}

object ProgressData {
  @scala.inline
  def apply(
    completedFiles: scala.Double,
    completedSize: scala.Double,
    percent: scala.Double,
    totalFiles: scala.Double
  ): ProgressData = {
    val __obj = js.Dynamic.literal(completedFiles = completedFiles, completedSize = completedSize, percent = percent, totalFiles = totalFiles)
  
    __obj.asInstanceOf[ProgressData]
  }
}

