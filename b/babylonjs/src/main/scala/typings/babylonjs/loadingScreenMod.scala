package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingScreenMod {
  
  @JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen")
  @js.native
  class DefaultLoadingScreen protected () extends ILoadingScreen {
    /**
      * Creates a new default loading screen
      * @param _renderingCanvas defines the canvas used to render the scene
      * @param _loadingText defines the default text to display
      * @param _loadingDivBackgroundColor defines the default background color
      */
    def this(_renderingCanvas: HTMLCanvasElement) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String) = this()
    def this(
      _renderingCanvas: HTMLCanvasElement,
      _loadingText: js.UndefOr[scala.Nothing],
      _loadingDivBackgroundColor: String
    ) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
    
    var _loadingDiv: js.Any = js.native
    
    var _loadingDivBackgroundColor: js.Any = js.native
    
    var _loadingText: js.Any = js.native
    
    var _loadingTextDiv: js.Any = js.native
    
    var _renderingCanvas: js.Any = js.native
    
    var _resizeLoadingUI: js.Any = js.native
    
    /**
      * Gets or sets the color to use for the background
      */
    @JSName("loadingUIBackgroundColor")
    def loadingUIBackgroundColor_MDefaultLoadingScreen: String = js.native
    
    @JSName("loadingUIText")
    def loadingUIText_MDefaultLoadingScreen: String = js.native
  }
  /* static members */
  object DefaultLoadingScreen {
    
    @JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets or sets the logo url to use for the default loading screen */
    @JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen.DefaultLogoUrl")
    @js.native
    def DefaultLogoUrl: String = js.native
    @scala.inline
    def DefaultLogoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultLogoUrl")(x.asInstanceOf[js.Any])
    
    /** Gets or sets the spinner url to use for the default loading screen */
    @JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen.DefaultSpinnerUrl")
    @js.native
    def DefaultSpinnerUrl: String = js.native
    @scala.inline
    def DefaultSpinnerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultSpinnerUrl")(x.asInstanceOf[js.Any])
  }
  
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
}
