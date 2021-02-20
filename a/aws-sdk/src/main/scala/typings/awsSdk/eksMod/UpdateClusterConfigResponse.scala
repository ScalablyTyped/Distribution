package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterConfigResponse extends StObject {
  
  var update: js.UndefOr[Update] = js.native
}
object UpdateClusterConfigResponse {
  
  @scala.inline
  def apply(): UpdateClusterConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterConfigResponse]
  }
  
  @scala.inline
  implicit class UpdateClusterConfigResponseMutableBuilder[Self <: UpdateClusterConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
