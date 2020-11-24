package typings.cryptoJs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class CipherOptionOps[Self <: CipherOption] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: Format_): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIv(value: WordArray): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
  }
}
