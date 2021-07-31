package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNodegroupConfigResponse extends StObject {
  
  var update: js.UndefOr[Update] = js.undefined
}
object UpdateNodegroupConfigResponse {
  
  @scala.inline
  def apply(): UpdateNodegroupConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNodegroupConfigResponse]
  }
  
  @scala.inline
  implicit class UpdateNodegroupConfigResponseMutableBuilder[Self <: UpdateNodegroupConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
