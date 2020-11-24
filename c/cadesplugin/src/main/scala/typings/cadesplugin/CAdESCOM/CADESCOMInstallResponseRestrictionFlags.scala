package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`0x10000000`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOMInstallResponseRestrictionFlags extends js.Object {
  
  val CADESCOM_AllowNoOutstandingRequest: `1` = js.native
  
  val CADESCOM_AllowNone: `0` = js.native
  
  val CADESCOM_AllowUntrustedCertificate: `2` = js.native
  
  val CADESCOM_AllowUntrustedRoot: `4` = js.native
  
  val CADESCOM_SkipInstallToStore: `0x10000000` = js.native
}
object CADESCOMInstallResponseRestrictionFlags {
  
  @scala.inline
  def apply(
    CADESCOM_AllowNoOutstandingRequest: `1`,
    CADESCOM_AllowNone: `0`,
    CADESCOM_AllowUntrustedCertificate: `2`,
    CADESCOM_AllowUntrustedRoot: `4`,
    CADESCOM_SkipInstallToStore: `0x10000000`
  ): CADESCOMInstallResponseRestrictionFlags = {
    val __obj = js.Dynamic.literal(CADESCOM_AllowNoOutstandingRequest = CADESCOM_AllowNoOutstandingRequest.asInstanceOf[js.Any], CADESCOM_AllowNone = CADESCOM_AllowNone.asInstanceOf[js.Any], CADESCOM_AllowUntrustedCertificate = CADESCOM_AllowUntrustedCertificate.asInstanceOf[js.Any], CADESCOM_AllowUntrustedRoot = CADESCOM_AllowUntrustedRoot.asInstanceOf[js.Any], CADESCOM_SkipInstallToStore = CADESCOM_SkipInstallToStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOMInstallResponseRestrictionFlags]
  }
  
  @scala.inline
  implicit class CADESCOMInstallResponseRestrictionFlagsOps[Self <: CADESCOMInstallResponseRestrictionFlags] (val x: Self) extends AnyVal {
    
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
    def setCADESCOM_AllowNoOutstandingRequest(value: `1`): Self = this.set("CADESCOM_AllowNoOutstandingRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AllowNone(value: `0`): Self = this.set("CADESCOM_AllowNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AllowUntrustedCertificate(value: `2`): Self = this.set("CADESCOM_AllowUntrustedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_AllowUntrustedRoot(value: `4`): Self = this.set("CADESCOM_AllowUntrustedRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_SkipInstallToStore(value: `0x10000000`): Self = this.set("CADESCOM_SkipInstallToStore", value.asInstanceOf[js.Any])
  }
}
