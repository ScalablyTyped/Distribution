package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`10`
import typings.cadesplugin.cadespluginNumbers.`11`
import typings.cadesplugin.cadespluginNumbers.`12`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import typings.cadesplugin.cadespluginNumbers.`5`
import typings.cadesplugin.cadespluginNumbers.`6`
import typings.cadesplugin.cadespluginNumbers.`7`
import typings.cadesplugin.cadespluginNumbers.`8`
import typings.cadesplugin.cadespluginNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_CERTIFICATE_FIND_TYPE extends js.Object {
  
  val CAPICOM_CERTIFICATE_FIND_APPLICATION_POLICY: `7` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_CERTIFICATE_POLICY: `8` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_EXTENDED_PROPERTY: `6` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_EXTENSION: `5` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_ISSUER_NAME: `2` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_KEY_USAGE: `12` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_ROOT_NAME: `3` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_SHA1_HASH: `0` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_SUBJECT_NAME: `1` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_TEMPLATE_NAME: `4` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_TIME_EXPIRED: `11` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_TIME_NOT_YET_VALID: `10` = js.native
  
  val CAPICOM_CERTIFICATE_FIND_TIME_VALID: `9` = js.native
}
object CAPICOM_CERTIFICATE_FIND_TYPE {
  
  @scala.inline
  def apply(
    CAPICOM_CERTIFICATE_FIND_APPLICATION_POLICY: `7`,
    CAPICOM_CERTIFICATE_FIND_CERTIFICATE_POLICY: `8`,
    CAPICOM_CERTIFICATE_FIND_EXTENDED_PROPERTY: `6`,
    CAPICOM_CERTIFICATE_FIND_EXTENSION: `5`,
    CAPICOM_CERTIFICATE_FIND_ISSUER_NAME: `2`,
    CAPICOM_CERTIFICATE_FIND_KEY_USAGE: `12`,
    CAPICOM_CERTIFICATE_FIND_ROOT_NAME: `3`,
    CAPICOM_CERTIFICATE_FIND_SHA1_HASH: `0`,
    CAPICOM_CERTIFICATE_FIND_SUBJECT_NAME: `1`,
    CAPICOM_CERTIFICATE_FIND_TEMPLATE_NAME: `4`,
    CAPICOM_CERTIFICATE_FIND_TIME_EXPIRED: `11`,
    CAPICOM_CERTIFICATE_FIND_TIME_NOT_YET_VALID: `10`,
    CAPICOM_CERTIFICATE_FIND_TIME_VALID: `9`
  ): CAPICOM_CERTIFICATE_FIND_TYPE = {
    val __obj = js.Dynamic.literal(CAPICOM_CERTIFICATE_FIND_APPLICATION_POLICY = CAPICOM_CERTIFICATE_FIND_APPLICATION_POLICY.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_CERTIFICATE_POLICY = CAPICOM_CERTIFICATE_FIND_CERTIFICATE_POLICY.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_EXTENDED_PROPERTY = CAPICOM_CERTIFICATE_FIND_EXTENDED_PROPERTY.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_EXTENSION = CAPICOM_CERTIFICATE_FIND_EXTENSION.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_ISSUER_NAME = CAPICOM_CERTIFICATE_FIND_ISSUER_NAME.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_KEY_USAGE = CAPICOM_CERTIFICATE_FIND_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_ROOT_NAME = CAPICOM_CERTIFICATE_FIND_ROOT_NAME.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_SHA1_HASH = CAPICOM_CERTIFICATE_FIND_SHA1_HASH.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_SUBJECT_NAME = CAPICOM_CERTIFICATE_FIND_SUBJECT_NAME.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_TEMPLATE_NAME = CAPICOM_CERTIFICATE_FIND_TEMPLATE_NAME.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_TIME_EXPIRED = CAPICOM_CERTIFICATE_FIND_TIME_EXPIRED.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_TIME_NOT_YET_VALID = CAPICOM_CERTIFICATE_FIND_TIME_NOT_YET_VALID.asInstanceOf[js.Any], CAPICOM_CERTIFICATE_FIND_TIME_VALID = CAPICOM_CERTIFICATE_FIND_TIME_VALID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_CERTIFICATE_FIND_TYPE]
  }
  
  @scala.inline
  implicit class CAPICOM_CERTIFICATE_FIND_TYPEOps[Self <: CAPICOM_CERTIFICATE_FIND_TYPE] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_CERTIFICATE_FIND_APPLICATION_POLICY(value: `7`): Self = this.set("CAPICOM_CERTIFICATE_FIND_APPLICATION_POLICY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_CERTIFICATE_POLICY(value: `8`): Self = this.set("CAPICOM_CERTIFICATE_FIND_CERTIFICATE_POLICY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_EXTENDED_PROPERTY(value: `6`): Self = this.set("CAPICOM_CERTIFICATE_FIND_EXTENDED_PROPERTY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_EXTENSION(value: `5`): Self = this.set("CAPICOM_CERTIFICATE_FIND_EXTENSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_ISSUER_NAME(value: `2`): Self = this.set("CAPICOM_CERTIFICATE_FIND_ISSUER_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_KEY_USAGE(value: `12`): Self = this.set("CAPICOM_CERTIFICATE_FIND_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_ROOT_NAME(value: `3`): Self = this.set("CAPICOM_CERTIFICATE_FIND_ROOT_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_SHA1_HASH(value: `0`): Self = this.set("CAPICOM_CERTIFICATE_FIND_SHA1_HASH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_SUBJECT_NAME(value: `1`): Self = this.set("CAPICOM_CERTIFICATE_FIND_SUBJECT_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_TEMPLATE_NAME(value: `4`): Self = this.set("CAPICOM_CERTIFICATE_FIND_TEMPLATE_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_TIME_EXPIRED(value: `11`): Self = this.set("CAPICOM_CERTIFICATE_FIND_TIME_EXPIRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_TIME_NOT_YET_VALID(value: `10`): Self = this.set("CAPICOM_CERTIFICATE_FIND_TIME_NOT_YET_VALID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CERTIFICATE_FIND_TIME_VALID(value: `9`): Self = this.set("CAPICOM_CERTIFICATE_FIND_TIME_VALID", value.asInstanceOf[js.Any])
  }
}
