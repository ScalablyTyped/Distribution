package typings.bricksJs.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var container: Node | String = js.native
  
  var packed: String = js.native
  
  var position: js.UndefOr[Boolean] = js.native
  
  var sizes: js.Array[SizeDetail] = js.native
}
object Options {
  
  @scala.inline
  def apply(container: Node | String, packed: String, sizes: js.Array[SizeDetail]): Options = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
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
    def setContainer(value: Node | String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacked(value: String): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesVarargs(value: SizeDetail*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[SizeDetail]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
