package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingScreenMod {
  
  @JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen")
  @js.native
  open class DefaultLoadingScreen protected ()
    extends StObject
       with ILoadingScreen {
    /**
      * Creates a new default loading screen
      * @param _renderingCanvas defines the canvas used to render the scene
      * @param _loadingText defines the default text to display
      * @param _loadingDivBackgroundColor defines the default background color
      */
    def this(_renderingCanvas: HTMLCanvasElement) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: Unit, _loadingDivBackgroundColor: String) = this()
    
    /* private */ var _loadingDiv: Any = js.native
    
    /* private */ var _loadingDivBackgroundColor: Any = js.native
    
    /* private */ var _loadingText: Any = js.native
    
    /* private */ var _loadingTextDiv: Any = js.native
    
    /* private */ var _renderingCanvas: Any = js.native
    
    /* private */ var _resizeLoadingUI: Any = js.native
    
    /* private */ var _style: Any = js.native
    
    /**
      * Function called to display the loading screen
      */
    /* CompleteClass */
    override def displayLoadingUI(): Unit = js.native
    
    /**
      * Function called to hide the loading screen
      */
    /* CompleteClass */
    override def hideLoadingUI(): Unit = js.native
    
    /**
      * Gets or sets the color to use for the background
      */
    /* CompleteClass */
    var loadingUIBackgroundColor: String = js.native
    /**
      * Gets or sets the color to use for the background
      */
    @JSName("loadingUIBackgroundColor")
    def loadingUIBackgroundColor_MDefaultLoadingScreen: String = js.native
    
    /**
      * Gets or sets the text to display while loading
      */
    /* CompleteClass */
    var loadingUIText: String = js.native
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
    inline def DefaultLogoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultLogoUrl")(x.asInstanceOf[js.Any])
    
    /** Gets or sets the spinner url to use for the default loading screen */
    @JSImport("babylonjs/Loading/loadingScreen", "DefaultLoadingScreen.DefaultSpinnerUrl")
    @js.native
    def DefaultSpinnerUrl: String = js.native
    inline def DefaultSpinnerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultSpinnerUrl")(x.asInstanceOf[js.Any])
  }
  
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
}
