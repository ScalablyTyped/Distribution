package typings.babylonjs.nodeMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeMaterialOptions extends js.Object {
  
  /**
    * Defines if blocks should emit comments
    */
  var emitComments: Boolean = js.native
}
object INodeMaterialOptions {
  
  @scala.inline
  def apply(emitComments: Boolean): INodeMaterialOptions = {
    val __obj = js.Dynamic.literal(emitComments = emitComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeMaterialOptions]
  }
  
  @scala.inline
  implicit class INodeMaterialOptionsOps[Self <: INodeMaterialOptions] (val x: Self) extends AnyVal {
    
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
  }
}
