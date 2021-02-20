package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAttributesResponse extends StObject {
  
  /**
    * The attributes applied to your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.native
}
object PutAttributesResponse {
  
  @scala.inline
  def apply(): PutAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAttributesResponse]
  }
  
  @scala.inline
  implicit class PutAttributesResponseMutableBuilder[Self <: PutAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
  }
}
