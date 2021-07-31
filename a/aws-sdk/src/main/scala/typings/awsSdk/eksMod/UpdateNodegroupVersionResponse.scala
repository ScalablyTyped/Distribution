package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNodegroupVersionResponse extends StObject {
  
  var update: js.UndefOr[Update] = js.undefined
}
object UpdateNodegroupVersionResponse {
  
  @scala.inline
  def apply(): UpdateNodegroupVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNodegroupVersionResponse]
  }
  
  @scala.inline
  implicit class UpdateNodegroupVersionResponseMutableBuilder[Self <: UpdateNodegroupVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
