package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalTexture extends StObject {
  
  /* private */ var _video: Any = js.native
  
  /**
    * Dispose the texture and release its associated resources.
    */
  def dispose(): Unit = js.native
  
  /**
    * Get the class name of the texture.
    * @returns "ExternalTexture"
    */
  def getClassName(): String = js.native
  
  /**
    * Get if the texture is ready to be used (downloaded, converted, mip mapped...).
    * @returns true if fully ready
    */
  def isReady(): Boolean = js.native
  
  /**
    * The type of the underlying texture is implementation dependent, so return "UNDEFINED" for the type
    */
  val `type`: /* 16 */ Double = js.native
  
  /**
    * Gets the underlying texture object
    */
  def underlyingResource: Any = js.native
  
  /**
    * Gets the unique id of this texture
    */
  val uniqueId: Double = js.native
  
  /**
    * Gets a boolean indicating if the texture uses mipmaps
    */
  var useMipMaps: Boolean = js.native
}
