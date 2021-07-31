package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateAliasResponse extends StObject {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The template alias.
    */
  var TemplateAlias: js.UndefOr[typings.awsSdk.quicksightMod.TemplateAlias] = js.undefined
}
object UpdateTemplateAliasResponse {
  
  @scala.inline
  def apply(): UpdateTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTemplateAliasResponse]
  }
  
  @scala.inline
  implicit class UpdateTemplateAliasResponseMutableBuilder[Self <: UpdateTemplateAliasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTemplateAlias(value: TemplateAlias): Self = StObject.set(x, "TemplateAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateAliasUndefined: Self = StObject.set(x, "TemplateAlias", js.undefined)
  }
}
