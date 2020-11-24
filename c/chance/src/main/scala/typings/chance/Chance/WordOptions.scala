package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordOptions extends js.Object {
  
  var capitalize: Boolean = js.native
  
  var length: Double = js.native
  
  var syllables: Double = js.native
}
object WordOptions {
  
  @scala.inline
  def apply(capitalize: Boolean, length: Double, syllables: Double): WordOptions = {
    val __obj = js.Dynamic.literal(capitalize = capitalize.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], syllables = syllables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordOptions]
  }
  
  @scala.inline
  implicit class WordOptionsOps[Self <: WordOptions] (val x: Self) extends AnyVal {
    
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
    def setCapitalize(value: Boolean): Self = this.set("capitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyllables(value: Double): Self = this.set("syllables", value.asInstanceOf[js.Any])
  }
}
