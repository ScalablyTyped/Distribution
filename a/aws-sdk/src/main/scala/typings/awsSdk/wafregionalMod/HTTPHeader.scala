package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPHeader extends StObject {
  
  /**
    * The name of one of the headers in the sampled web request.
    */
  var Name: js.UndefOr[HeaderName] = js.undefined
  
  /**
    * The value of one of the headers in the sampled web request.
    */
  var Value: js.UndefOr[HeaderValue] = js.undefined
}
object HTTPHeader {
  
  @scala.inline
  def apply(): HTTPHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPHeader]
  }
  
  @scala.inline
  implicit class HTTPHeaderMutableBuilder[Self <: HTTPHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: HeaderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: HeaderValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
