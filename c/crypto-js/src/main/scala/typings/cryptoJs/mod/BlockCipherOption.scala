package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options.
  */
@js.native
trait BlockCipherOption extends js.Object {
  
  /**
    * The block mode to use. Default: CBC
    */
  var mode: Mode_ = js.native
  
  /**
    * The padding strategy to use. Default: Pkcs7
    */
  var padding: Padding = js.native
}
object BlockCipherOption {
  
  @scala.inline
  def apply(mode: Mode_, padding: Padding): BlockCipherOption = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCipherOption]
  }
  
  @scala.inline
  implicit class BlockCipherOptionOps[Self <: BlockCipherOption] (val x: Self) extends AnyVal {
    
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
    def setMode(value: Mode_): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
  }
}
