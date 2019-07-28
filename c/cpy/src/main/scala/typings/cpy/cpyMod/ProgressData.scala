package typings.cpy.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  /**
  		Copied file count.
  		*/
  var completedFiles: Double
  /**
  		Completed size in bytes.
  		*/
  var completedSize: Double
  /**
  		Completed percentage. A value between `0` and `1`.
  		*/
  var percent: Double
  /**
  		Overall file count.
  		*/
  var totalFiles: Double
}

object ProgressData {
  @scala.inline
  def apply(completedFiles: Double, completedSize: Double, percent: Double, totalFiles: Double): ProgressData = {
    val __obj = js.Dynamic.literal(completedFiles = completedFiles, completedSize = completedSize, percent = percent, totalFiles = totalFiles)
  
    __obj.asInstanceOf[ProgressData]
  }
}

