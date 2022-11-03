package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnisotropyBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the TBN input component
    */
  def TBN: NodeMaterialConnectionPoint = js.native
  
  /* private */ var _generateTBNSpace: Any = js.native
  
  /* private */ var _tangentCorrectionFactorName: Any = js.native
  
  /**
    * Gets the anisotropy object output component
    */
  def anisotropy: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the direction input component
    */
  def direction: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the main code of the block (fragment side)
    * @param state current state of the node material building
    * @param generateTBNSpace if true, the code needed to create the TBN coordinate space is generated
    * @returns the shader code
    */
  def getCode(state: NodeMaterialBuildState): String = js.native
  def getCode(state: NodeMaterialBuildState, generateTBNSpace: Boolean): String = js.native
  
  /**
    * Gets the intensity input component
    */
  def intensity: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the uv input component
    */
  def uv: NodeMaterialConnectionPoint = js.native
  
  /** @internal */
  var worldNormalConnectionPoint: NodeMaterialConnectionPoint = js.native
  
  /**
    * The two properties below are set by the main PBR block prior to calling methods of this class.
    * This is to avoid having to add them as inputs here whereas they are already inputs of the main block, so already known.
    * It's less burden on the user side in the editor part.
    */
  /** @internal */
  var worldPositionConnectionPoint: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the worldTangent input component
    */
  def worldTangent: NodeMaterialConnectionPoint = js.native
}
