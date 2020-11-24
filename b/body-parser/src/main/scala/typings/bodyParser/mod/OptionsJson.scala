package typings.bodyParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsJson extends Options {
  
  /**
    *
    * The reviver option is passed directly to JSON.parse as the second argument.
    */
  var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  
  /**
    * When set to `true`, will only accept arrays and objects;
    * when `false` will accept anything JSON.parse accepts. Defaults to `true`.
    */
  var strict: js.UndefOr[Boolean] = js.native
}
object OptionsJson {
  
  @scala.inline
  def apply(): OptionsJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsJson]
  }
  
  @scala.inline
  implicit class OptionsJsonOps[Self <: OptionsJson] (val x: Self) extends AnyVal {
    
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
    def setReviver(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("reviver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
