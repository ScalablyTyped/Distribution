package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TensorBoardOutputConfig extends js.Object {
  
  /**
    * Path to local storage location for tensorBoard output. Defaults to /opt/ml/output/tensorboard.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  
  /**
    * Path to Amazon S3 storage location for TensorBoard output.
    */
  var S3OutputPath: S3Uri = js.native
}
object TensorBoardOutputConfig {
  
  @scala.inline
  def apply(S3OutputPath: S3Uri): TensorBoardOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorBoardOutputConfig]
  }
  
  @scala.inline
  implicit class TensorBoardOutputConfigOps[Self <: TensorBoardOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = this.set("S3OutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = this.set("LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPath: Self = this.set("LocalPath", js.undefined)
  }
}
