package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadingScreen extends StObject {
  
  /**
    * Function called to display the loading screen
    */
  def displayLoadingUI(): Unit
  
  /**
    * Function called to hide the loading screen
    */
  def hideLoadingUI(): Unit
  
  /**
    * Gets or sets the color to use for the background
    */
  var loadingUIBackgroundColor: String
  
  /**
    * Gets or sets the text to display while loading
    */
  var loadingUIText: String
}
object ILoadingScreen {
  
  inline def apply(
    displayLoadingUI: () => Unit,
    hideLoadingUI: () => Unit,
    loadingUIBackgroundColor: String,
    loadingUIText: String
  ): ILoadingScreen = {
    val __obj = js.Dynamic.literal(displayLoadingUI = js.Any.fromFunction0(displayLoadingUI), hideLoadingUI = js.Any.fromFunction0(hideLoadingUI), loadingUIBackgroundColor = loadingUIBackgroundColor.asInstanceOf[js.Any], loadingUIText = loadingUIText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingScreen]
  }
  
  extension [Self <: ILoadingScreen](x: Self) {
    
    inline def setDisplayLoadingUI(value: () => Unit): Self = StObject.set(x, "displayLoadingUI", js.Any.fromFunction0(value))
    
    inline def setHideLoadingUI(value: () => Unit): Self = StObject.set(x, "hideLoadingUI", js.Any.fromFunction0(value))
    
    inline def setLoadingUIBackgroundColor(value: String): Self = StObject.set(x, "loadingUIBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingUIText(value: String): Self = StObject.set(x, "loadingUIText", value.asInstanceOf[js.Any])
  }
}
