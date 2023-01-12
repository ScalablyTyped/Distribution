package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.paf
import typings.consumerDataStandards.consumerDataStandardsStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressUType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The type of address object present
    */
  var addressUType: paf | simple
  
  /**
    * Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf). Required if addressUType is set to paf
    */
  var paf: js.UndefOr[BuildingName1] = js.undefined
  
  /**
    * Required if addressUType is set to simple
    */
  var simple: js.UndefOr[AddressLine1] = js.undefined
}
object AddressUType {
  
  inline def apply(addressUType: paf | simple): AddressUType = {
    val __obj = js.Dynamic.literal(addressUType = addressUType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressUType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressUType] (val x: Self) extends AnyVal {
    
    inline def setAddressUType(value: paf | simple): Self = StObject.set(x, "addressUType", value.asInstanceOf[js.Any])
    
    inline def setPaf(value: BuildingName1): Self = StObject.set(x, "paf", value.asInstanceOf[js.Any])
    
    inline def setPafUndefined: Self = StObject.set(x, "paf", js.undefined)
    
    inline def setSimple(value: AddressLine1): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
