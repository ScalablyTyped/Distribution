package typings.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAttributesRequest extends js.Object {
  
  /**
    * The GLOB wildcard for removing the attributes in the application
    */
  var Blacklist: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
}
object UpdateAttributesRequest {
  
  @scala.inline
  def apply(): UpdateAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributesRequest]
  }
  
  @scala.inline
  implicit class UpdateAttributesRequestOps[Self <: UpdateAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setBlacklistVarargs(value: String*): Self = this.set("Blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklist(value: js.Array[String] | Iterable[String]): Self = this.set("Blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("Blacklist", js.undefined)
  }
}
