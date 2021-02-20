package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMasterAccountResponse extends StObject {
  
  /**
    * The master account details.
    */
  var Master: typings.awsSdk.guarddutyMod.Master = js.native
}
object GetMasterAccountResponse {
  
  @scala.inline
  def apply(Master: Master): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal(Master = Master.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
  
  @scala.inline
  implicit class GetMasterAccountResponseMutableBuilder[Self <: GetMasterAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: Master): Self = StObject.set(x, "Master", value.asInstanceOf[js.Any])
  }
}
