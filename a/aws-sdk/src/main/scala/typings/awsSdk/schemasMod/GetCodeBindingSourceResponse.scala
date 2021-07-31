package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCodeBindingSourceResponse extends StObject {
  
  var Body: js.UndefOr[typings.awsSdk.schemasMod.Body] = js.undefined
}
object GetCodeBindingSourceResponse {
  
  @scala.inline
  def apply(): GetCodeBindingSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCodeBindingSourceResponse]
  }
  
  @scala.inline
  implicit class GetCodeBindingSourceResponseMutableBuilder[Self <: GetCodeBindingSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
  }
}
