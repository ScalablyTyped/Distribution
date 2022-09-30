package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`2`
import typings.cadesplugin.cadespluginInts.`3`
import typings.cadesplugin.cadespluginInts.`4`
import typings.cadesplugin.cadespluginInts.`5`
import typings.cadesplugin.cadespluginInts.`6`
import typings.cadesplugin.cadespluginInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_CERT_INFO_TYPE
  extends StObject
     with CertIntoTypePlugin {
  
  val CAPICOM_CERT_INFO_ISSUER_DNS_NAME: `7`
  
  val CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME: `3`
  
  val CAPICOM_CERT_INFO_ISSUER_UPN: `5`
  
  val CAPICOM_CERT_INFO_SUBJECT_DNS_NAME: `6`
  
  val CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME: `2`
  
  val CAPICOM_CERT_INFO_SUBJECT_UPN: `4`
}
object CAPICOM_CERT_INFO_TYPE {
  
  inline def apply(): CAPICOM_CERT_INFO_TYPE = {
    val __obj = js.Dynamic.literal(CAPICOM_CERT_INFO_ISSUER_DNS_NAME = 7, CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME = 3, CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME = 1, CAPICOM_CERT_INFO_ISSUER_UPN = 5, CAPICOM_CERT_INFO_SUBJECT_DNS_NAME = 6, CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME = 2, CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME = 0, CAPICOM_CERT_INFO_SUBJECT_UPN = 4)
    __obj.asInstanceOf[CAPICOM_CERT_INFO_TYPE]
  }
  
  extension [Self <: CAPICOM_CERT_INFO_TYPE](x: Self) {
    
    inline def setCAPICOM_CERT_INFO_ISSUER_DNS_NAME(value: `7`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_DNS_NAME", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERT_INFO_ISSUER_EMAIL_NAME(value: `3`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_EMAIL_NAME", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERT_INFO_ISSUER_UPN(value: `5`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_UPN", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERT_INFO_SUBJECT_DNS_NAME(value: `6`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_DNS_NAME", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME(value: `2`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_EMAIL_NAME", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CERT_INFO_SUBJECT_UPN(value: `4`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_UPN", value.asInstanceOf[js.Any])
  }
}
