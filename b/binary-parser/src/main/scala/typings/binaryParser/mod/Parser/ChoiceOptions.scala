package typings.binaryParser.mod.Parser

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChoiceOptions extends Options {
  
  var choices: NumberDictionary[typings.binaryParser.mod.Parser[_] | String] = js.native
  
  var defaultChoice: js.UndefOr[typings.binaryParser.mod.Parser[_] | String] = js.native
  
  var tag: String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double]) = js.native
}
object ChoiceOptions {
  
  @scala.inline
  def apply(
    choices: NumberDictionary[typings.binaryParser.mod.Parser[_] | String],
    tag: String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double])
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceOptions]
  }
  
  @scala.inline
  implicit class ChoiceOptionsOps[Self <: ChoiceOptions] (val x: Self) extends AnyVal {
    
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
    def setChoices(value: NumberDictionary[typings.binaryParser.mod.Parser[_] | String]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double])): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultChoice(value: typings.binaryParser.mod.Parser[_] | String): Self = this.set("defaultChoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChoice: Self = this.set("defaultChoice", js.undefined)
  }
}
