package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomProceduralTexture
  extends StObject
     with ProceduralTexture {
  
  /* private */ var _animate: js.Any = js.native
  
  /* private */ var _config: js.Any = js.native
  
  /* private */ var _loadJson: js.Any = js.native
  
  /* private */ var _texturePath: js.Any = js.native
  
  /* private */ var _time: js.Any = js.native
  
  /**
    * Define if the texture animates or not.
    */
  def animate: Boolean = js.native
  def animate_=(value: Boolean): Unit = js.native
  
  /**
    * Update the uniform values of the procedural texture in the shader.
    */
  def updateShaderUniforms(): Unit = js.native
  
  /**
    * Update the list of dependant textures samplers in the shader.
    */
  def updateTextures(): Unit = js.native
}
