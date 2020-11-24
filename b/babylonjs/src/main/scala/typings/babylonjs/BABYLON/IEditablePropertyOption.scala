package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Rebuild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditablePropertyOption extends js.Object {
  
  /** max value */
  var max: js.UndefOr[Double] = js.native
  
  /** min value */
  var min: js.UndefOr[Double] = js.native
  
  /** notifiers: indicates which actions to take when the property is changed */
  var notifiers: js.UndefOr[Rebuild] = js.native
  
  /** list of the options for a variable of type list */
  var options: js.UndefOr[js.Array[IEditablePropertyListOption]] = js.native
}
object IEditablePropertyOption {
  
  @scala.inline
  def apply(): IEditablePropertyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditablePropertyOption]
  }
  
  @scala.inline
  implicit class IEditablePropertyOptionOps[Self <: IEditablePropertyOption] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNotifiers(value: Rebuild): Self = this.set("notifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifiers: Self = this.set("notifiers", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: IEditablePropertyListOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[IEditablePropertyListOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
