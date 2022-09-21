package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSourceBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _samplerName: Any = js.native
  
  /* protected */ var _texture: Nullable[Texture] = js.native
  
  def bind(effect: Effect): Unit = js.native
  
  def isReady(): Boolean = js.native
  
  /**
    * Gets the sampler name associated with this image source
    */
  def samplerName: String = js.native
  
  /**
    * Gets the output component
    */
  def source: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the texture associated with the node
    */
  def texture: Nullable[Texture] = js.native
  def texture_=(texture: Nullable[Texture]): Unit = js.native
}
