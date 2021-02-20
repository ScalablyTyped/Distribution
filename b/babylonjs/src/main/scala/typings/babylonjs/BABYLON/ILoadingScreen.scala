package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadingScreen extends StObject {
  
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
  implicit class ILoadingScreenMutableBuilder[Self <: ILoadingScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayLoadingUI(value: () => Unit): Self = StObject.set(x, "displayLoadingUI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLoadingUI(value: () => Unit): Self = StObject.set(x, "hideLoadingUI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadingUIBackgroundColor(value: String): Self = StObject.set(x, "loadingUIBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUIText(value: String): Self = StObject.set(x, "loadingUIText", value.asInstanceOf[js.Any])
  }
}
