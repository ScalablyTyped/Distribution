package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Qualification extends StObject {
  
  /**
    *  The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the AcceptQualificationRequest operation.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The value (score) of the Qualification, if the Qualification has an integer value.
    */
  var IntegerValue: js.UndefOr[Integer] = js.undefined
  
  var LocaleValue: js.UndefOr[Locale] = js.undefined
  
  /**
    *  The ID of the Qualification type for the Qualification.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  The status of the Qualification. Valid values are Granted | Revoked.
    */
  var Status: js.UndefOr[QualificationStatus] = js.undefined
  
  /**
    *  The ID of the Worker who possesses the Qualification. 
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object Qualification {
  
  @scala.inline
  def apply(): Qualification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Qualification]
  }
  
  @scala.inline
  implicit class QualificationMutableBuilder[Self <: Qualification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrantTime(value: Timestamp): Self = StObject.set(x, "GrantTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantTimeUndefined: Self = StObject.set(x, "GrantTime", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: Integer): Self = StObject.set(x, "IntegerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "IntegerValue", js.undefined)
    
    @scala.inline
    def setLocaleValue(value: Locale): Self = StObject.set(x, "LocaleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleValueUndefined: Self = StObject.set(x, "LocaleValue", js.undefined)
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeIdUndefined: Self = StObject.set(x, "QualificationTypeId", js.undefined)
    
    @scala.inline
    def setStatus(value: QualificationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
