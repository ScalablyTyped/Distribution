package typings.dagre.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compound extends js.Object {
  
  var compound: js.UndefOr[Boolean] = js.native
  
  var directed: js.UndefOr[Boolean] = js.native
  
  var multigraph: js.UndefOr[Boolean] = js.native
}
object Compound {
  
  @scala.inline
  def apply(): Compound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compound]
  }
  
  @scala.inline
  implicit class CompoundOps[Self <: Compound] (val x: Self) extends AnyVal {
    
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
    def setCompound(value: Boolean): Self = this.set("compound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompound: Self = this.set("compound", js.undefined)
    
    @scala.inline
    def setDirected(value: Boolean): Self = this.set("directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirected: Self = this.set("directed", js.undefined)
    
    @scala.inline
    def setMultigraph(value: Boolean): Self = this.set("multigraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultigraph: Self = this.set("multigraph", js.undefined)
  }
}
