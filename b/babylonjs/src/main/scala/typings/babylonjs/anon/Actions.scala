package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
  var actions: Nullable[_] = js.native
  
  var freezeWorldMatrix: Nullable[Boolean] = js.native
  
  var lods: Nullable[_] = js.native
}
object Actions {
  
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
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
    def setActions(value: Nullable[_]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsNull: Self = this.set("actions", null)
    
    @scala.inline
    def setFreezeWorldMatrix(value: Nullable[Boolean]): Self = this.set("freezeWorldMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreezeWorldMatrixNull: Self = this.set("freezeWorldMatrix", null)
    
    @scala.inline
    def setLods(value: Nullable[_]): Self = this.set("lods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLodsNull: Self = this.set("lods", null)
  }
}
