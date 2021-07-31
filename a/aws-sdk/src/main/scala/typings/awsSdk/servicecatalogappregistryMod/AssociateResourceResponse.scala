package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the application that was augmented with attributes.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The Amazon resource name (ARN) that specifies the resource.
    */
  var resourceArn: js.UndefOr[Arn] = js.undefined
}
object AssociateResourceResponse {
  
  @scala.inline
  def apply(): AssociateResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceResponse]
  }
  
  @scala.inline
  implicit class AssociateResourceResponseMutableBuilder[Self <: AssociateResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationArnUndefined: Self = StObject.set(x, "applicationArn", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
  }
}
