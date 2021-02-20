package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GardenTool extends StObject {
  
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
  implicit class GardenToolMutableBuilder[Self <: GardenTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescFunc(value: () => String): Self = StObject.set(x, "descFunc", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescFuncUndefined: Self = StObject.set(x, "descFunc", js.undefined)
    
    @scala.inline
    def setFunc(value: () => Unit): Self = StObject.set(x, "func", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisplayed(value: () => Boolean): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisplayedUndefined: Self = StObject.set(x, "isDisplayed", js.undefined)
    
    @scala.inline
    def setIsOn(value: () => Boolean): Self = StObject.set(x, "isOn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOnUndefined: Self = StObject.set(x, "isOn", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
