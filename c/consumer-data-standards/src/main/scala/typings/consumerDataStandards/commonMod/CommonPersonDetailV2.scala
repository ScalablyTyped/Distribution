package typings.consumerDataStandards.commonMod

import typings.consumerDataStandards.anon.AreaCode
import typings.consumerDataStandards.anon.IsPreferred
import typings.consumerDataStandards.anon.Paf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPersonDetailV2
  extends StObject
     with CommonPerson {
  
  /**
    * May be empty
    */
  var emailAddresses: js.Array[IsPreferred]
  
  /**
    * Array is mandatory but may be empty if no phone numbers are held
    */
  var phoneNumbers: js.Array[AreaCode]
  
  /**
    * Array is mandatory but may be empty if no valid addresses are held. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
    */
  var physicalAddresses: js.Array[Paf]
}
object CommonPersonDetailV2 {
  
  inline def apply(
    emailAddresses: js.Array[IsPreferred],
    lastName: String,
    middleNames: js.Array[String],
    phoneNumbers: js.Array[AreaCode],
    physicalAddresses: js.Array[Paf]
  ): CommonPersonDetailV2 = {
    val __obj = js.Dynamic.literal(emailAddresses = emailAddresses.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], middleNames = middleNames.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], physicalAddresses = physicalAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonPersonDetailV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonPersonDetailV2] (val x: Self) extends AnyVal {
    
    inline def setEmailAddresses(value: js.Array[IsPreferred]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesVarargs(value: IsPreferred*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[AreaCode]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersVarargs(value: AreaCode*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhysicalAddresses(value: js.Array[Paf]): Self = StObject.set(x, "physicalAddresses", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAddressesVarargs(value: Paf*): Self = StObject.set(x, "physicalAddresses", js.Array(value*))
  }
}
