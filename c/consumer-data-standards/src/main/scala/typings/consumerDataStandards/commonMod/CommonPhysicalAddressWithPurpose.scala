package typings.consumerDataStandards.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AddressLine1
import typings.consumerDataStandards.anon.BuildingName1
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
     with /* k */ StringDictionary[Any] {
  
  /**
    * The type of address object present
    */
  var addressUType: paf | simple
  
  /**
    * Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf)
    */
  var paf: js.UndefOr[BuildingName1] = js.undefined
  
  /**
    * Enumeration of values indicating the purpose of the physical address
    */
  var purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK
  
  var simple: js.UndefOr[AddressLine1] = js.undefined
}
object CommonPhysicalAddressWithPurpose {
  
  inline def apply(addressUType: paf | simple, purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): CommonPhysicalAddressWithPurpose = {
    val __obj = js.Dynamic.literal(addressUType = addressUType.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPhysicalAddressWithPurpose]
  }
  
  extension [Self <: CommonPhysicalAddressWithPurpose](x: Self) {
    
    inline def setAddressUType(value: paf | simple): Self = StObject.set(x, "addressUType", value.asInstanceOf[js.Any])
    
    inline def setPaf(value: BuildingName1): Self = StObject.set(x, "paf", value.asInstanceOf[js.Any])
    
    inline def setPafUndefined: Self = StObject.set(x, "paf", js.undefined)
    
    inline def setPurpose(value: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setSimple(value: AddressLine1): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
