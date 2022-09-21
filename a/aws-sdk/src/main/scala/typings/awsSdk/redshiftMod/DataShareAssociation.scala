package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataShareAssociation extends StObject {
  
  /**
    * The name of the consumer accounts that have an association with a producer datashare.
    */
  var ConsumerIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region of the consumer accounts that have an association with a producer datashare.
    */
  var ConsumerRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The creation date of the datashare that is associated.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the datashare that is associated.
    */
  var Status: js.UndefOr[DataShareStatus] = js.undefined
  
  /**
    * The status change data of the datashare that is associated.
    */
  var StatusChangeDate: js.UndefOr[js.Date] = js.undefined
}
object DataShareAssociation {
  
  inline def apply(): DataShareAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataShareAssociation]
  }
  
  extension [Self <: DataShareAssociation](x: Self) {
    
    inline def setConsumerIdentifier(value: String): Self = StObject.set(x, "ConsumerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setConsumerIdentifierUndefined: Self = StObject.set(x, "ConsumerIdentifier", js.undefined)
    
    inline def setConsumerRegion(value: String): Self = StObject.set(x, "ConsumerRegion", value.asInstanceOf[js.Any])
    
    inline def setConsumerRegionUndefined: Self = StObject.set(x, "ConsumerRegion", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setStatus(value: DataShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusChangeDate(value: js.Date): Self = StObject.set(x, "StatusChangeDate", value.asInstanceOf[js.Any])
    
    inline def setStatusChangeDateUndefined: Self = StObject.set(x, "StatusChangeDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
