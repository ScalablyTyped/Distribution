package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GardenTool extends js.Object {
  
  /**
    * An HTML string which describes the tool
    */
  var desc: String = js.native
  
  /**
    * A function which generates the description for the tool
    */
  var descFunc: js.UndefOr[js.Function0[String]] = js.native
  
  /**
    * Function which is called on usage of the tool
    */
  def func(): Unit = js.native
  
  /**
    * The icon column of the tool in the plant icon sheet
    */
  var icon: Double = js.native
  
  var id: Double = js.native
  
  /**
    * Determines if the tool should be displayed
    */
  var isDisplayed: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * Determines if the tool should be displayed as currently in use
    */
  var isOn: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * The internal name of the tool
    */
  var key: String = js.native
  
  /**
    * The displayed name of the tool
    */
  var name: String = js.native
}
object GardenTool {
  
  @scala.inline
  def apply(desc: String, func: () => Unit, icon: Double, id: Double, key: String, name: String): GardenTool = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], func = js.Any.fromFunction0(func), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GardenTool]
  }
  
  @scala.inline
  implicit class GardenToolOps[Self <: GardenTool] (val x: Self) extends AnyVal {
    
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: () => Unit): Self = this.set("func", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIcon(value: Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescFunc(value: () => String): Self = this.set("descFunc", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDescFunc: Self = this.set("descFunc", js.undefined)
    
    @scala.inline
    def setIsDisplayed(value: () => Boolean): Self = this.set("isDisplayed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsDisplayed: Self = this.set("isDisplayed", js.undefined)
    
    @scala.inline
    def setIsOn(value: () => Boolean): Self = this.set("isOn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsOn: Self = this.set("isOn", js.undefined)
  }
}
