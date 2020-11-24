package typings.binaryParser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var assert: js.UndefOr[String | Double | (js.Function1[/* value */ Data, Boolean])] = js.native
  
  var formatter: js.UndefOr[js.Function1[/* value */ Data, _]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAssertFunction1(value: /* value */ Data => Boolean): Self = this.set("assert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssert(value: String | Double | (js.Function1[/* value */ Data, Boolean])): Self = this.set("assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* value */ Data => _): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
}
