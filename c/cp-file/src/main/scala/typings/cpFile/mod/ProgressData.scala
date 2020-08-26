package typings.cpFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressData extends js.Object {
  /**
  		Absolute path to destination.
  		*/
  var destinationPath: String = js.native
  /**
  		Copied percentage, a value between `0` and `1`.
  		*/
  var percent: Double = js.native
  /**
  		File size in bytes.
  		*/
  var size: Double = js.native
  /**
  		Absolute path to source.
  		*/
  var sourcePath: String = js.native
  /**
  		Copied size in bytes.
  		*/
  var writtenBytes: Double = js.native
}

object ProgressData {
  @scala.inline
  def apply(destinationPath: String, percent: Double, size: Double, sourcePath: String, writtenBytes: Double): ProgressData = {
    val __obj = js.Dynamic.literal(destinationPath = destinationPath.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], writtenBytes = writtenBytes.asInstanceOf[js.Any])
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
    def setDestinationPath(value: String): Self = this.set("destinationPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcePath(value: String): Self = this.set("sourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrittenBytes(value: Double): Self = this.set("writtenBytes", value.asInstanceOf[js.Any])
  }
  
}

