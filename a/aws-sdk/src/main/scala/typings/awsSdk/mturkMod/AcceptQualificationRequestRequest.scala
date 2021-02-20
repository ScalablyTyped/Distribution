package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptQualificationRequestRequest extends StObject {
  
  /**
    *  The value of the Qualification. You can omit this value if you are using the presence or absence of the Qualification as the basis for a HIT requirement. 
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the Qualification request, as returned by the GetQualificationRequests operation.
    */
  var QualificationRequestId: String = js.native
}
object AcceptQualificationRequestRequest {
  
  @scala.inline
  def apply(QualificationRequestId: String): AcceptQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptQualificationRequestRequest]
  }
  
  @scala.inline
  implicit class AcceptQualificationRequestRequestMutableBuilder[Self <: AcceptQualificationRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntegerValue(value: Integer): Self = StObject.set(x, "IntegerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "IntegerValue", js.undefined)
    
    @scala.inline
    def setQualificationRequestId(value: String): Self = StObject.set(x, "QualificationRequestId", value.asInstanceOf[js.Any])
  }
}
