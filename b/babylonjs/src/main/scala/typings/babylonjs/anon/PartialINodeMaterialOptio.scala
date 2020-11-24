package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.INodeMaterialOptions> */
@js.native
trait PartialINodeMaterialOptio extends js.Object {
  
  var emitComments: js.UndefOr[Boolean] = js.native
}
object PartialINodeMaterialOptio {
  
  @scala.inline
  def apply(): PartialINodeMaterialOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINodeMaterialOptio]
  }
  
  @scala.inline
  implicit class PartialINodeMaterialOptioOps[Self <: PartialINodeMaterialOptio] (val x: Self) extends AnyVal {
    
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
    def setEmitComments(value: Boolean): Self = this.set("emitComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitComments: Self = this.set("emitComments", js.undefined)
  }
}
