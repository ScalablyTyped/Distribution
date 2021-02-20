package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTrailResponse extends StObject {
  
  var Trail: js.UndefOr[typings.awsSdk.cloudtrailMod.Trail] = js.native
}
object GetTrailResponse {
  
  @scala.inline
  def apply(): GetTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailResponse]
  }
  
  @scala.inline
  implicit class GetTrailResponseMutableBuilder[Self <: GetTrailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrail(value: Trail): Self = StObject.set(x, "Trail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailUndefined: Self = StObject.set(x, "Trail", js.undefined)
  }
}
