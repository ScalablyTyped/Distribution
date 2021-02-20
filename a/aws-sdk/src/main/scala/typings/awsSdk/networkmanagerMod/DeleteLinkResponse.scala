package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLinkResponse extends StObject {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.networkmanagerMod.Link] = js.native
}
object DeleteLinkResponse {
  
  @scala.inline
  def apply(): DeleteLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLinkResponse]
  }
  
  @scala.inline
  implicit class DeleteLinkResponseMutableBuilder[Self <: DeleteLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
