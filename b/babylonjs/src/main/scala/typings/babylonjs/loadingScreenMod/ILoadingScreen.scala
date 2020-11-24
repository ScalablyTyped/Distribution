package typings.babylonjs.loadingScreenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadingScreen extends js.Object {
  
  /**
    * Function called to display the loading screen
    */
  def displayLoadingUI(): Unit = js.native
  
  /**
    * Function called to hide the loading screen
    */
  def hideLoadingUI(): Unit = js.native
  
  /**
    * Gets or sets the color to use for the background
    */
  var loadingUIBackgroundColor: String = js.native
  
  /**
    * Gets or sets the text to display while loading
    */
  var loadingUIText: String = js.native
}
object ILoadingScreen {
  
  @scala.inline
  def apply(
    displayLoadingUI: () => Unit,
    hideLoadingUI: () => Unit,
    loadingUIBackgroundColor: String,
    loadingUIText: String
  ): ILoadingScreen = {
    val __obj = js.Dynamic.literal(displayLoadingUI = js.Any.fromFunction0(displayLoadingUI), hideLoadingUI = js.Any.fromFunction0(hideLoadingUI), loadingUIBackgroundColor = loadingUIBackgroundColor.asInstanceOf[js.Any], loadingUIText = loadingUIText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingScreen]
  }
  
  @scala.inline
  implicit class ILoadingScreenOps[Self <: ILoadingScreen] (val x: Self) extends AnyVal {
    
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
    def setDisplayLoadingUI(value: () => Unit): Self = this.set("displayLoadingUI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLoadingUI(value: () => Unit): Self = this.set("hideLoadingUI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadingUIBackgroundColor(value: String): Self = this.set("loadingUIBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUIText(value: String): Self = this.set("loadingUIText", value.asInstanceOf[js.Any])
  }
}
