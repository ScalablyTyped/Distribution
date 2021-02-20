package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalResource extends StObject {
  
  /**
    * The ID of the portal.
    */
  var id: ID = js.native
}
object PortalResource {
  
  @scala.inline
  def apply(id: ID): PortalResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalResource]
  }
  
  @scala.inline
  implicit class PortalResourceMutableBuilder[Self <: PortalResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
