package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorGradingTexture
  extends StObject
     with BaseTexture {
  
  /**
    * Occurs when the file being loaded is a .3dl LUT file.
    */
  /* private */ var _load3dlTexture: Any = js.native
  
  /**
    * Starts the loading process of the texture.
    */
  /* private */ var _loadTexture: Any = js.native
  
  /* private */ var _onLoad: Any = js.native
  
  /* private */ var _textureMatrix: Any = js.native
  
  /**
    * Fires the onload event from the constructor if requested.
    */
  /* private */ var _triggerOnLoad: Any = js.native
  
  /**
    * The texture URL.
    */
  var url: String = js.native
}
