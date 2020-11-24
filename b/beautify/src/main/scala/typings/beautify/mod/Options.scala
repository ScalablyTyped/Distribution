package typings.beautify.mod

import typings.beautify.beautifyStrings.css
import typings.beautify.beautifyStrings.html
import typings.beautify.beautifyStrings.js_
import typings.beautify.beautifyStrings.json
import typings.beautify.beautifyStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var format: css | json | js_ | html | xml = js.native
}
object Options {
  
  @scala.inline
  def apply(format: css | json | js_ | html | xml): Options = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: css | json | js_ | html | xml): Self = this.set("format", value.asInstanceOf[js.Any])
  }
}
