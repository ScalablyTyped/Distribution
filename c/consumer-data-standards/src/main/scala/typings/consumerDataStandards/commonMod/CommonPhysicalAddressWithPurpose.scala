package typings.consumerDataStandards.commonMod

import typings.consumerDataStandards.consumerDataStandardsStrings.MAIL
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PHYSICAL
import typings.consumerDataStandards.consumerDataStandardsStrings.REGISTERED
import typings.consumerDataStandards.consumerDataStandardsStrings.WORK
import typings.consumerDataStandards.consumerDataStandardsStrings.paf
import typings.consumerDataStandards.consumerDataStandardsStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPhysicalAddressWithPurpose
  extends StObject
     with CommonPhysicalAddress {
  
  /**
    * Enumeration of values indicating the purpose of the physical address
    */
  var purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK
}
object CommonPhysicalAddressWithPurpose {
  
  inline def apply(addressUType: paf | simple, purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): CommonPhysicalAddressWithPurpose = {
    val __obj = js.Dynamic.literal(addressUType = addressUType.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPhysicalAddressWithPurpose]
  }
  
  extension [Self <: CommonPhysicalAddressWithPurpose](x: Self) {
    
    inline def setPurpose(value: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
  }
}
