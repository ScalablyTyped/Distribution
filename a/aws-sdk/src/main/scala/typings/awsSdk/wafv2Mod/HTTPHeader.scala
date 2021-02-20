package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPHeader extends StObject {
  
  /**
    * The name of the HTTP header.
    */
  var Name: js.UndefOr[HeaderName] = js.native
  
  /**
    * The value of the HTTP header.
    */
  var Value: js.UndefOr[HeaderValue] = js.native
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
