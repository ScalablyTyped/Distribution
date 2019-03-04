package typings
package cpyLib.cpyMod.cpyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressData extends js.Object {
  var completedFiles: scala.Double
  var completedSize: scala.Double
  var totalFiles: scala.Double
}

object ProgressData {
  @scala.inline
  def apply(completedFiles: scala.Double, completedSize: scala.Double, totalFiles: scala.Double): ProgressData = {
    val __obj = js.Dynamic.literal(completedFiles = completedFiles, completedSize = completedSize, totalFiles = totalFiles)
  
    __obj.asInstanceOf[ProgressData]
  }
}

