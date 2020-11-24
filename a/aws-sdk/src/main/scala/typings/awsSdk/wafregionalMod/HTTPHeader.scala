package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPHeader extends js.Object {
  
  /**
    * The name of one of the headers in the sampled web request.
    */
  var Name: js.UndefOr[HeaderName] = js.native
  
  /**
    * The value of one of the headers in the sampled web request.
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
  implicit class HTTPHeaderOps[Self <: HTTPHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: HeaderName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValue(value: HeaderValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
