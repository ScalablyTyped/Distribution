package typings.credential.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait defaultOptions extends js.Object {
  
  var hashMethod: String = js.native
  
  var keyLength: Double = js.native
  
  var work: Double = js.native
}
object defaultOptions {
  
  @scala.inline
  def apply(hashMethod: String, keyLength: Double, work: Double): defaultOptions = {
    val __obj = js.Dynamic.literal(hashMethod = hashMethod.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOptions]
  }
  
  @scala.inline
  implicit class defaultOptionsOps[Self <: defaultOptions] (val x: Self) extends AnyVal {
    
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
    def setHashMethod(value: String): Self = this.set("hashMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWork(value: Double): Self = this.set("work", value.asInstanceOf[js.Any])
  }
}
