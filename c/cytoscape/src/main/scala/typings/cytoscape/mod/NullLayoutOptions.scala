package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.`null`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/null
  */
@js.native
trait NullLayoutOptions extends LayoutOptions {
  
  var name: `null` = js.native
}
object NullLayoutOptions {
  
  @scala.inline
  def apply(name: `null`): NullLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLayoutOptions]
  }
  
  @scala.inline
  implicit class NullLayoutOptionsOps[Self <: NullLayoutOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: `null`): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
