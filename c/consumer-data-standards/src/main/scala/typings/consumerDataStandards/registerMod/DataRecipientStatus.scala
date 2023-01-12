package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REVOKED
import typings.consumerDataStandards.consumerDataStandardsStrings.SURRENDERED
import typings.consumerDataStandards.consumerDataStandardsStrings.SUSPENDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRecipientStatus
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Unique id of the Data Recipient Legal Entity issued by the CDR Register
    */
  var legalEntityId: String
  
  /**
    * Data Recipient status in the CDR Register
    */
  var status: ACTIVE | SUSPENDED | REVOKED | SURRENDERED
}
object DataRecipientStatus {
  
  inline def apply(legalEntityId: String, status: ACTIVE | SUSPENDED | REVOKED | SURRENDERED): DataRecipientStatus = {
    val __obj = js.Dynamic.literal(legalEntityId = legalEntityId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecipientStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRecipientStatus] (val x: Self) extends AnyVal {
    
    inline def setLegalEntityId(value: String): Self = StObject.set(x, "legalEntityId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | SUSPENDED | REVOKED | SURRENDERED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
