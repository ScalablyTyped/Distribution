package typings.cryptoJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
@js.native
trait CipherOption
  extends /* key */ StringDictionary[js.Any] {
  
  var format: js.UndefOr[Format_] = js.native
  
  /**
    * The IV to use for this operation.
    */
  var iv: js.UndefOr[WordArray] = js.native
}
object CipherOption {
  
  @scala.inline
  def apply(): CipherOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CipherOption]
  }
  
  @scala.inline
  implicit class CipherOptionMutableBuilder[Self <: CipherOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: Format_): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIv(value: WordArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
