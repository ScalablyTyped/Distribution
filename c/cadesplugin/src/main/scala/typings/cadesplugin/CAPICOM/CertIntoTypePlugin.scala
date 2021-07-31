package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertIntoTypePlugin extends StObject {
  
  val CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME: `1`
  
  val CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME: `0`
}
object CertIntoTypePlugin {
  
  @scala.inline
  def apply(): CertIntoTypePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME = 1, CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME = 0)
    __obj.asInstanceOf[CertIntoTypePlugin]
  }
  
  @scala.inline
  implicit class CertIntoTypePluginMutableBuilder[Self <: CertIntoTypePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME(value: `1`): Self = StObject.set(x, "CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME(value: `0`): Self = StObject.set(x, "CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME", value.asInstanceOf[js.Any])
  }
}
