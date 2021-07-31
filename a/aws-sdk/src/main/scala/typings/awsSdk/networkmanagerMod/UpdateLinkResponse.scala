package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLinkResponse extends StObject {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.networkmanagerMod.Link] = js.undefined
}
object UpdateLinkResponse {
  
  @scala.inline
  def apply(): UpdateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLinkResponse]
  }
  
  @scala.inline
  implicit class UpdateLinkResponseMutableBuilder[Self <: UpdateLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
