package typings.cpy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressData extends js.Object {
  
  /**
  		Copied file count.
  		*/
  var completedFiles: Double = js.native
  
  /**
  		Completed size in bytes.
  		*/
  var completedSize: Double = js.native
  
  /**
  		Completed percentage. A value between `0` and `1`.
  		*/
  var percent: Double = js.native
  
  /**
  		Overall file count.
  		*/
  var totalFiles: Double = js.native
}
object ProgressData {
  
  @scala.inline
  def apply(completedFiles: Double, completedSize: Double, percent: Double, totalFiles: Double): ProgressData = {
    val __obj = js.Dynamic.literal(completedFiles = completedFiles.asInstanceOf[js.Any], completedSize = completedSize.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalFiles = totalFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressData]
  }
  
  @scala.inline
  implicit class ProgressDataOps[Self <: ProgressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletedFiles(value: Double): Self = this.set("completedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedSize(value: Double): Self = this.set("completedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFiles(value: Double): Self = this.set("totalFiles", value.asInstanceOf[js.Any])
  }
}
