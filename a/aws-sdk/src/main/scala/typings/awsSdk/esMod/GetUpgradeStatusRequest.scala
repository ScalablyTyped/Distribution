package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUpgradeStatusRequest extends StObject {
  
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
}
object GetUpgradeStatusRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): GetUpgradeStatusRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeStatusRequest]
  }
  
  @scala.inline
  implicit class GetUpgradeStatusRequestMutableBuilder[Self <: GetUpgradeStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
