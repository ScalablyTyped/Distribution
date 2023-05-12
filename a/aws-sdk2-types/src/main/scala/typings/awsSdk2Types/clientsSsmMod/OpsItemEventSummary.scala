package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemEventSummary extends StObject {
  
  /**
    * Information about the user or resource that created the OpsItem event.
    */
  var CreatedBy: js.UndefOr[OpsItemIdentity] = js.undefined
  
  /**
    * The date and time the OpsItem event was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specific information about the OpsItem event.
    */
  var Detail: js.UndefOr[String] = js.undefined
  
  /**
    * The type of information provided as a detail.
    */
  var DetailType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the OpsItem event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[String] = js.undefined
  
  /**
    * The source of the OpsItem event.
    */
  var Source: js.UndefOr[String] = js.undefined
}
object OpsItemEventSummary {
  
  inline def apply(): OpsItemEventSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemEventSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsItemEventSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: OpsItemIdentity): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    inline def setDetailType(value: String): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    inline def setDetailUndefined: Self = StObject.set(x, "Detail", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
