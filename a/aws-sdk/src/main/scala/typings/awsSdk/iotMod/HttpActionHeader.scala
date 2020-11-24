package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpActionHeader extends js.Object {
  
  /**
    * The HTTP header key.
    */
  var key: HeaderKey = js.native
  
  /**
    * The HTTP header value. Substitution templates are supported.
    */
  var value: HeaderValue = js.native
}
object HttpActionHeader {
  
  @scala.inline
  def apply(key: HeaderKey, value: HeaderValue): HttpActionHeader = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpActionHeader]
  }
  
  @scala.inline
  implicit class HttpActionHeaderOps[Self <: HttpActionHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: HeaderKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: HeaderValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
