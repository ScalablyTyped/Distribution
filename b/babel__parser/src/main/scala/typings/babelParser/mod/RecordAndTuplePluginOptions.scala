package typings.babelParser.mod

import typings.babelParser.babelParserStrings.bar
import typings.babelParser.babelParserStrings.hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordAndTuplePluginOptions extends js.Object {
  
  var syntaxType: bar | hash = js.native
}
object RecordAndTuplePluginOptions {
  
  @scala.inline
  def apply(syntaxType: bar | hash): RecordAndTuplePluginOptions = {
    val __obj = js.Dynamic.literal(syntaxType = syntaxType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordAndTuplePluginOptions]
  }
  
  @scala.inline
  implicit class RecordAndTuplePluginOptionsOps[Self <: RecordAndTuplePluginOptions] (val x: Self) extends AnyVal {
    
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
    def setSyntaxType(value: bar | hash): Self = this.set("syntaxType", value.asInstanceOf[js.Any])
  }
}
