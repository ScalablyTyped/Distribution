package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`25`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOM_ENCRYPTION_ALGORITHM extends StObject {
  
  val CADESCOM_ENCRYPTION_ALGORITHM_3DES: `3`
  
  val CADESCOM_ENCRYPTION_ALGORITHM_AES: `4`
  
  val CADESCOM_ENCRYPTION_ALGORITHM_DES: `2`
  
  val CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89: `25`
  
  val CADESCOM_ENCRYPTION_ALGORITHM_RC2: `0`
  
  val CADESCOM_ENCRYPTION_ALGORITHM_RC4: `1`
}
object CADESCOM_ENCRYPTION_ALGORITHM {
  
  @scala.inline
  def apply(): CADESCOM_ENCRYPTION_ALGORITHM = {
    val __obj = js.Dynamic.literal(CADESCOM_ENCRYPTION_ALGORITHM_3DES = 3, CADESCOM_ENCRYPTION_ALGORITHM_AES = 4, CADESCOM_ENCRYPTION_ALGORITHM_DES = 2, CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89 = 25, CADESCOM_ENCRYPTION_ALGORITHM_RC2 = 0, CADESCOM_ENCRYPTION_ALGORITHM_RC4 = 1)
    __obj.asInstanceOf[CADESCOM_ENCRYPTION_ALGORITHM]
  }
  
  @scala.inline
  implicit class CADESCOM_ENCRYPTION_ALGORITHMMutableBuilder[Self <: CADESCOM_ENCRYPTION_ALGORITHM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_3DES(value: `3`): Self = StObject.set(x, "CADESCOM_ENCRYPTION_ALGORITHM_3DES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_AES(value: `4`): Self = StObject.set(x, "CADESCOM_ENCRYPTION_ALGORITHM_AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_DES(value: `2`): Self = StObject.set(x, "CADESCOM_ENCRYPTION_ALGORITHM_DES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89(value: `25`): Self = StObject.set(x, "CADESCOM_ENCRYPTION_ALGORITHM_GOST_28147_89", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_RC2(value: `0`): Self = StObject.set(x, "CADESCOM_ENCRYPTION_ALGORITHM_RC2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_ENCRYPTION_ALGORITHM_RC4(value: `1`): Self = StObject.set(x, "CADESCOM_ENCRYPTION_ALGORITHM_RC4", value.asInstanceOf[js.Any])
  }
}
