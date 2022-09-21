package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneDepthBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _getTexture: Any = js.native
  
  /* private */ var _injectVertexCode: Any = js.native
  
  /* private */ var _mainUVName: Any = js.native
  
  /* private */ var _samplerName: Any = js.native
  
  /* private */ var _tempTextureRead: Any = js.native
  
  /* private */ var _writeOutput: Any = js.native
  
  /* private */ var _writeTextureRead: Any = js.native
  
  /**
    * Gets the depth output component
    */
  def depth: NodeMaterialConnectionPoint = js.native
  
  /**
    * Defines if the depth renderer should be setup in full 32 bits float mode
    */
  var force32itsFloat: Boolean = js.native
  
  /**
    * Defines if the depth renderer should be setup in non linear mode
    */
  var useNonLinearDepth: Boolean = js.native
  
  /**
    * Gets the uv input component
    */
  def uv: NodeMaterialConnectionPoint = js.native
}
