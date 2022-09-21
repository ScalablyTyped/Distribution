package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REMOVED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHolderStatus
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Unique id of the Data Holder Legal Entity issued by the CDR Register.
    */
  var legalEntityId: String
  
  /**
    * Data Holder status in the CDR Register
    */
  var status: ACTIVE | REMOVED
}
object DataHolderStatus {
  
  inline def apply(legalEntityId: String, status: ACTIVE | REMOVED): DataHolderStatus = {
    val __obj = js.Dynamic.literal(legalEntityId = legalEntityId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHolderStatus]
  }
  
  extension [Self <: DataHolderStatus](x: Self) {
    
    inline def setLegalEntityId(value: String): Self = StObject.set(x, "legalEntityId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | REMOVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
