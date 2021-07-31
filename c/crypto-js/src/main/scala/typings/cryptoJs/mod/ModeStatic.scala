package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeStatic extends StObject {
  
  /**
    * Initializes a newly created mode.
    *
    * @param cipher A block cipher instance.
    * @param iv The IV words.
    *
    * @example
    *
    *     var mode = CryptoJS.mode.CBC.Encryptor.create(cipher, iv.words);
    */
  def create(cipher: Cipher, iv: js.Array[Double]): Mode_
}
object ModeStatic {
  
  @scala.inline
  def apply(create: (Cipher, js.Array[Double]) => Mode_): ModeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[ModeStatic]
  }
  
  @scala.inline
  implicit class ModeStaticMutableBuilder[Self <: ModeStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (Cipher, js.Array[Double]) => Mode_): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
