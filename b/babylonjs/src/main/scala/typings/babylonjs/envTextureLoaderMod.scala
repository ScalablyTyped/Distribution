package typings.babylonjs

import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envTextureLoaderMod {
  
  @JSImport("babylonjs/Materials/Textures/Loaders/envTextureLoader", "_ENVTextureLoader")
  @js.native
  open class ENVTextureLoader ()
    extends StObject
       with IInternalTextureLoader {
    
    /**
      * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
      */
    def loadData(): Unit = js.native
  }
}
