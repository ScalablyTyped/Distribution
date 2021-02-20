package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportLabelsTaskRunRequest extends StObject {
  
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
  implicit class StartImportLabelsTaskRunRequestMutableBuilder[Self <: StartImportLabelsTaskRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputS3Path(value: UriString): Self = StObject.set(x, "InputS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllLabels(value: ReplaceBoolean): Self = StObject.set(x, "ReplaceAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllLabelsUndefined: Self = StObject.set(x, "ReplaceAllLabels", js.undefined)
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
