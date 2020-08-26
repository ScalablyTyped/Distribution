package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTargetPathRequestedEventOptions extends RequestedEventOptions {
  /** The source path for the operation. */
  var sourcePath: String = js.native
  /** The destination path for the operation. */
  var targetPath: String = js.native
}

object SourceTargetPathRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, requestId: Double, sourcePath: String, targetPath: String): SourceTargetPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTargetPathRequestedEventOptions]
  }
  @scala.inline
  implicit class SourceTargetPathRequestedEventOptionsOps[Self <: SourceTargetPathRequestedEventOptions] (val x: Self) extends AnyVal {
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
    def setSourcePath(value: String): Self = this.set("sourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
  }
  
}

