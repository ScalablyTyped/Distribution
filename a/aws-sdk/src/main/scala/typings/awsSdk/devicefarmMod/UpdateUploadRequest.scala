package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUploadRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the uploaded test spec.
    */
  var arn: AmazonResourceName = js.native
  
  /**
    * The upload's content type (for example, application/x-yaml).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  
  /**
    * Set to true if the YAML file has changed and must be updated. Otherwise, set to false.
    */
  var editContent: js.UndefOr[Boolean] = js.native
  
  /**
    * The upload's test spec file name. The name must not contain any forward slashes (/). The test spec file name must end with the .yaml or .yml file extension.
    */
  var name: js.UndefOr[Name] = js.native
}
object UpdateUploadRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUploadRequest]
  }
  
  @scala.inline
  implicit class UpdateUploadRequestMutableBuilder[Self <: UpdateUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setEditContent(value: Boolean): Self = StObject.set(x, "editContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditContentUndefined: Self = StObject.set(x, "editContent", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
