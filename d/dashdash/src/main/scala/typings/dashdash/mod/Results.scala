package typings.dashdash.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results
  extends /* key */ StringDictionary[js.Any] {
  
  var _args: js.Array[String] = js.native
  
  var _order: js.Array[Arg] = js.native
}
object Results {
  
  @scala.inline
  def apply(_args: js.Array[String], _order: js.Array[Arg]): Results = {
    val __obj = js.Dynamic.literal(_args = _args.asInstanceOf[js.Any], _order = _order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    
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
    def set_argsVarargs(value: String*): Self = this.set("_args", js.Array(value :_*))
    
    @scala.inline
    def set_args(value: js.Array[String]): Self = this.set("_args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_orderVarargs(value: Arg*): Self = this.set("_order", js.Array(value :_*))
    
    @scala.inline
    def set_order(value: js.Array[Arg]): Self = this.set("_order", value.asInstanceOf[js.Any])
  }
}
