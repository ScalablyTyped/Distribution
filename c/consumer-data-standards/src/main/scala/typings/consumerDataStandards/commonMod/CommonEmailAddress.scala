package typings.consumerDataStandards.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.HOME
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.UNSPECIFIED
import typings.consumerDataStandards.consumerDataStandardsStrings.WORK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonEmailAddress
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A correctly formatted email address, as defined by the addr-spec format in **[[RFC5322]](#nref-RFC5322)**
    */
  var address: String
  
  /**
    * May be true for one and only one email record in the collection. Denotes the default email address
    */
  var isPreferred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The purpose for the email, as specified by the customer (Enumeration)
    */
  var purpose: HOME | OTHER | UNSPECIFIED | WORK
}
object CommonEmailAddress {
  
  inline def apply(address: String, purpose: HOME | OTHER | UNSPECIFIED | WORK): CommonEmailAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonEmailAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonEmailAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredNull: Self = StObject.set(x, "isPreferred", null)
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setPurpose(value: HOME | OTHER | UNSPECIFIED | WORK): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
  }
}
