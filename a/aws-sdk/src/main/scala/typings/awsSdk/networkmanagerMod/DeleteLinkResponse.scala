package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLinkResponse extends StObject {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.networkmanagerMod.Link] = js.undefined
}
object DeleteLinkResponse {
  
  inline def apply(): DeleteLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLinkResponse]
  }
  
  extension [Self <: DeleteLinkResponse](x: Self) {
    
    inline def setLink(value: Link): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
