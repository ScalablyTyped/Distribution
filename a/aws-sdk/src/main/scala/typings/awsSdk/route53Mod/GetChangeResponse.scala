package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChangeResponse extends StObject {
  
  /**
    * A complex type that contains information about the specified change batch.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo = js.native
}
object GetChangeResponse {
  
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): GetChangeResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeResponse]
  }
  
  @scala.inline
  implicit class GetChangeResponseMutableBuilder[Self <: GetChangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
