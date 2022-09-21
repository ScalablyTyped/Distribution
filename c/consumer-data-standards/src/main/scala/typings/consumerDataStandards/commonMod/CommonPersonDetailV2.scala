package typings.consumerDataStandards.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AreaCode
import typings.consumerDataStandards.anon.IsPreferred
import typings.consumerDataStandards.anon.Paf
import typings.consumerDataStandards.consumerDataStandardsStrings.ANZSCO_1220Dot0_2006_V1Dot0
import typings.consumerDataStandards.consumerDataStandardsStrings.ANZSCO_1220Dot0_2006_V1Dot1
import typings.consumerDataStandards.consumerDataStandardsStrings.ANZSCO_1220Dot0_2013_V1Dot2
import typings.consumerDataStandards.consumerDataStandardsStrings.ANZSCO_1220Dot0_2013_V1Dot3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPersonDetailV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * May be empty
    */
  var emailAddresses: js.Array[IsPreferred]
  
  /**
    * For people with single names this field need not be present. The single name should be in the lastName field. Where a data holder cannot determine first and middle names from a collection of given names, a single string representing all given names MAY be provided.
    */
  var firstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For people with single names the single name should be in this field
    */
  var lastName: String
  
  /**
    * The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Field is mandatory but array may be empty
    */
  var middleNames: js.Array[String]
  
  /**
    * Value is a valid **[[ANZSCO]](#iref-ANZSCO)** Standard Occupation classification code. If the occupation code held by the data holder is not one of the supported **[[ANZSCO]](#iref-ANZSCO)** versions, then it must not be supplied.
    */
  var occupationCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The applicable **[[ANZSCO]](#iref-ANZSCO)** release version of the occupation code provided. Mandatory if an ``occupationCode`` is supplied. If ``occupationCode`` is supplied but ``occupationCodeVersion`` is absent, default is ``ANZSCO_1220.0_2013_V1.2``
    */
  var occupationCodeVersion: js.UndefOr[
    ANZSCO_1220Dot0_2006_V1Dot0 | ANZSCO_1220Dot0_2006_V1Dot1 | ANZSCO_1220Dot0_2013_V1Dot2 | ANZSCO_1220Dot0_2013_V1Dot3 | Null
  ] = js.undefined
  
  /**
    * Array is mandatory but may be empty if no phone numbers are held
    */
  var phoneNumbers: js.Array[AreaCode]
  
  /**
    * Array is mandatory but may be empty if no valid addresses are held. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
    */
  var physicalAddresses: js.Array[Paf]
  
  /**
    * Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
    */
  var prefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for a trailing suffix to the name (e.g. Jr)
    */
  var suffix: js.UndefOr[String | Null] = js.undefined
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
  
  extension [Self <: CommonPersonDetailV2](x: Self) {
    
    inline def setEmailAddresses(value: js.Array[IsPreferred]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesVarargs(value: IsPreferred*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setMiddleNames(value: js.Array[String]): Self = StObject.set(x, "middleNames", value.asInstanceOf[js.Any])
    
    inline def setMiddleNamesVarargs(value: String*): Self = StObject.set(x, "middleNames", js.Array(value*))
    
    inline def setOccupationCode(value: String): Self = StObject.set(x, "occupationCode", value.asInstanceOf[js.Any])
    
    inline def setOccupationCodeNull: Self = StObject.set(x, "occupationCode", null)
    
    inline def setOccupationCodeUndefined: Self = StObject.set(x, "occupationCode", js.undefined)
    
    inline def setOccupationCodeVersion(
      value: ANZSCO_1220Dot0_2006_V1Dot0 | ANZSCO_1220Dot0_2006_V1Dot1 | ANZSCO_1220Dot0_2013_V1Dot2 | ANZSCO_1220Dot0_2013_V1Dot3
    ): Self = StObject.set(x, "occupationCodeVersion", value.asInstanceOf[js.Any])
    
    inline def setOccupationCodeVersionNull: Self = StObject.set(x, "occupationCodeVersion", null)
    
    inline def setOccupationCodeVersionUndefined: Self = StObject.set(x, "occupationCodeVersion", js.undefined)
    
    inline def setPhoneNumbers(value: js.Array[AreaCode]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersVarargs(value: AreaCode*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhysicalAddresses(value: js.Array[Paf]): Self = StObject.set(x, "physicalAddresses", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAddressesVarargs(value: Paf*): Self = StObject.set(x, "physicalAddresses", js.Array(value*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
