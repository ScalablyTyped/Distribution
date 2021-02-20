package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectionResponse extends StObject {
  
  /**
    * The connection that is being deleted.
    */
  var Connection: js.UndefOr[typings.awsSdk.dmsMod.Connection] = js.native
}
object DeleteConnectionResponse {
  
  @scala.inline
  def apply(): DeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConnectionResponse]
  }
  
  @scala.inline
  implicit class DeleteConnectionResponseMutableBuilder[Self <: DeleteConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
