package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterVersionResponse extends StObject {
  
  /**
    * The full description of the specified update
    */
  var update: js.UndefOr[Update] = js.native
}
object UpdateClusterVersionResponse {
  
  @scala.inline
  def apply(): UpdateClusterVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterVersionResponse]
  }
  
  @scala.inline
  implicit class UpdateClusterVersionResponseMutableBuilder[Self <: UpdateClusterVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
