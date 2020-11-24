package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertIntoTypePlugin extends js.Object {
  
  val CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME: `1` = js.native
  
  val CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME: `0` = js.native
}
object CertIntoTypePlugin {
  
  @scala.inline
  def apply(CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME: `1`, CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME: `0`): CertIntoTypePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME = CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME.asInstanceOf[js.Any], CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME = CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertIntoTypePlugin]
  }
  
  @scala.inline
  implicit class CertIntoTypePluginOps[Self <: CertIntoTypePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME(value: `1`): Self = this.set("CAPICOM_CERT_INFO_ISSUER_SIMPLE_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME(value: `0`): Self = this.set("CAPICOM_CERT_INFO_SUBJECT_SIMPLE_NAME", value.asInstanceOf[js.Any])
  }
}
