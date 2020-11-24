package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`25`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_ENCRYPTION_ALGORITHM extends js.Object {
  
  val CADESCOM_ENCRYPTION_ALGORITHM_3DES: `3` = js.native
  
  val CADESCOM_ENCRYPTION_ALGORITHM_AES: `4` = js.native
  
  val CADESCOM_ENCRYPTION_ALGORITHM_DES: `2` = js.native
  
  val CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89: `25` = js.native
  
  val CADESCOM_ENCRYPTION_ALGORITHM_RC2: `0` = js.native
  
  val CADESCOM_ENCRYPTION_ALGORITHM_RC4: `1` = js.native
}
object CADESCOM_ENCRYPTION_ALGORITHM {
  
  @scala.inline
  def apply(
    CADESCOM_ENCRYPTION_ALGORITHM_3DES: `3`,
    CADESCOM_ENCRYPTION_ALGORITHM_AES: `4`,
    CADESCOM_ENCRYPTION_ALGORITHM_DES: `2`,
    CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89: `25`,
    CADESCOM_ENCRYPTION_ALGORITHM_RC2: `0`,
    CADESCOM_ENCRYPTION_ALGORITHM_RC4: `1`
  ): CADESCOM_ENCRYPTION_ALGORITHM = {
    val __obj = js.Dynamic.literal(CADESCOM_ENCRYPTION_ALGORITHM_3DES = CADESCOM_ENCRYPTION_ALGORITHM_3DES.asInstanceOf[js.Any], CADESCOM_ENCRYPTION_ALGORITHM_AES = CADESCOM_ENCRYPTION_ALGORITHM_AES.asInstanceOf[js.Any], CADESCOM_ENCRYPTION_ALGORITHM_DES = CADESCOM_ENCRYPTION_ALGORITHM_DES.asInstanceOf[js.Any], CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89 = CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89.asInstanceOf[js.Any], CADESCOM_ENCRYPTION_ALGORITHM_RC2 = CADESCOM_ENCRYPTION_ALGORITHM_RC2.asInstanceOf[js.Any], CADESCOM_ENCRYPTION_ALGORITHM_RC4 = CADESCOM_ENCRYPTION_ALGORITHM_RC4.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_ENCRYPTION_ALGORITHM]
  }
  
  @scala.inline
  implicit class CADESCOM_ENCRYPTION_ALGORITHMOps[Self <: CADESCOM_ENCRYPTION_ALGORITHM] (val x: Self) extends AnyVal {
    
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
    def setCADESCOM_ENCRYPTION_ALGORITHM_3DES(value: `3`): Self = this.set("CADESCOM_ENCRYPTION_ALGORITHM_3DES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_AES(value: `4`): Self = this.set("CADESCOM_ENCRYPTION_ALGORITHM_AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_DES(value: `2`): Self = this.set("CADESCOM_ENCRYPTION_ALGORITHM_DES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89(value: `25`): Self = this.set("CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_RC2(value: `0`): Self = this.set("CADESCOM_ENCRYPTION_ALGORITHM_RC2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_RC4(value: `1`): Self = this.set("CADESCOM_ENCRYPTION_ALGORITHM_RC4", value.asInstanceOf[js.Any])
  }
}
