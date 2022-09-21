package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ENVTextureLoader
  extends StObject
     with IInternalTextureLoader {
  
  /**
    * Uploads the 2D texture data to the WebGL texture. It has already been bound once in the callback.
    */
  def loadData(): Unit = js.native
}
