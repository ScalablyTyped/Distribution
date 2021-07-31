package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddHeaderAction extends StObject {
  
  /**
    * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
    */
  var HeaderName: typings.awsSdk.sesMod.HeaderName
  
  /**
    * Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
    */
  var HeaderValue: typings.awsSdk.sesMod.HeaderValue
}
object AddHeaderAction {
  
  @scala.inline
  def apply(HeaderName: HeaderName, HeaderValue: HeaderValue): AddHeaderAction = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName.asInstanceOf[js.Any], HeaderValue = HeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeaderAction]
  }
  
  @scala.inline
  implicit class AddHeaderActionMutableBuilder[Self <: AddHeaderAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderName(value: HeaderName): Self = StObject.set(x, "HeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValue(value: HeaderValue): Self = StObject.set(x, "HeaderValue", value.asInstanceOf[js.Any])
  }
}
