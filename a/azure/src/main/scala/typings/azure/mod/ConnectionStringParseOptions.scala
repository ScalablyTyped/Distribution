package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStringParseOptions extends js.Object {
  
  var skipLowerCase: Boolean = js.native
}
object ConnectionStringParseOptions {
  
  @scala.inline
  def apply(skipLowerCase: Boolean): ConnectionStringParseOptions = {
    val __obj = js.Dynamic.literal(skipLowerCase = skipLowerCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStringParseOptions]
  }
  
  @scala.inline
  implicit class ConnectionStringParseOptionsOps[Self <: ConnectionStringParseOptions] (val x: Self) extends AnyVal {
    
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
    def setSkipLowerCase(value: Boolean): Self = this.set("skipLowerCase", value.asInstanceOf[js.Any])
  }
}
