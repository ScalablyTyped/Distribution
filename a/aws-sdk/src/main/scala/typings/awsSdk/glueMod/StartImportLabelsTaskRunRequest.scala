package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportLabelsTaskRunRequest extends js.Object {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
    */
  var InputS3Path: UriString = js.native
  
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var ReplaceAllLabels: js.UndefOr[ReplaceBoolean] = js.native
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}
object StartImportLabelsTaskRunRequest {
  
  @scala.inline
  def apply(InputS3Path: UriString, TransformId: HashString): StartImportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(InputS3Path = InputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportLabelsTaskRunRequest]
  }
  
  @scala.inline
  implicit class StartImportLabelsTaskRunRequestOps[Self <: StartImportLabelsTaskRunRequest] (val x: Self) extends AnyVal {
    
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
    def setInputS3Path(value: UriString): Self = this.set("InputS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllLabels(value: ReplaceBoolean): Self = this.set("ReplaceAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllLabels: Self = this.set("ReplaceAllLabels", js.undefined)
  }
}
