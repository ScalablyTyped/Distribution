package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSiteInput extends StObject {
  
  var SiteId: typings.awsSdk.outpostsMod.SiteId = js.native
}
object DeleteSiteInput {
  
  @scala.inline
  def apply(SiteId: SiteId): DeleteSiteInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSiteInput]
  }
  
  @scala.inline
  implicit class DeleteSiteInputMutableBuilder[Self <: DeleteSiteInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
