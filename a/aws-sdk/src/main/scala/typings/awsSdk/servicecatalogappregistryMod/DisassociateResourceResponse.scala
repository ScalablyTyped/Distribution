package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateResourceResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.native
  
  /**
    * The Amazon resource name (ARN) that specifies the resource.
    */
  var resourceArn: js.UndefOr[Arn] = js.native
}
object DisassociateResourceResponse {
  
  @scala.inline
  def apply(): DisassociateResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResourceResponse]
  }
  
  @scala.inline
  implicit class DisassociateResourceResponseMutableBuilder[Self <: DisassociateResourceResponse] (val x: Self) extends AnyVal {
    
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
