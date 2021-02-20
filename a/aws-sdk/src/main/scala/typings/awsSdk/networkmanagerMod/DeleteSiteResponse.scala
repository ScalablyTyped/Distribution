package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSiteResponse extends StObject {
  
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typings.awsSdk.networkmanagerMod.Site] = js.native
}
object DeleteSiteResponse {
  
  @scala.inline
  def apply(): DeleteSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSiteResponse]
  }
  
  @scala.inline
  implicit class DeleteSiteResponseMutableBuilder[Self <: DeleteSiteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSite(value: Site): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
  }
}
