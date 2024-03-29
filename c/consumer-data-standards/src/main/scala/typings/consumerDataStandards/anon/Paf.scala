package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
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

trait Paf
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
object Paf {
  
  inline def apply(addressUType: paf | simple, purpose: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): Paf = {
    val __obj = js.Dynamic.literal(addressUType = addressUType.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paf] (val x: Self) extends AnyVal {
    
    inline def setAddressUType(value: paf | simple): Self = StObject.set(x, "addressUType", value.asInstanceOf[js.Any])
    
    inline def setPaf(value: BuildingName1): Self = StObject.set(x, "paf", value.asInstanceOf[js.Any])
    
    inline def setPafUndefined: Self = StObject.set(x, "paf", js.undefined)
    
    inline def setPurpose(value: MAIL | OTHER | PHYSICAL | REGISTERED | WORK): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setSimple(value: AddressLine1): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
