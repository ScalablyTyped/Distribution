package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointTypes", JSImport.Namespace)
@js.native
object nodeMaterialBlockConnectionPointTypesMod extends js.Object {
  @js.native
  sealed trait NodeMaterialBlockConnectionPointTypes extends js.Object
  
  @js.native
  object NodeMaterialBlockConnectionPointTypes extends js.Object {
    /** Detect type based on connection */
    @js.native
    sealed trait AutoDetect extends NodeMaterialBlockConnectionPointTypes
    
    /** Output type that will be defined by input type */
    @js.native
    sealed trait BasedOnInput extends NodeMaterialBlockConnectionPointTypes
    
    /** Color3 */
    @js.native
    sealed trait Color3 extends NodeMaterialBlockConnectionPointTypes
    
    /** Color4 */
    @js.native
    sealed trait Color4 extends NodeMaterialBlockConnectionPointTypes
    
    /** Float */
    @js.native
    sealed trait Float extends NodeMaterialBlockConnectionPointTypes
    
    /** Int */
    @js.native
    sealed trait Int extends NodeMaterialBlockConnectionPointTypes
    
    /** Matrix */
    @js.native
    sealed trait Matrix extends NodeMaterialBlockConnectionPointTypes
    
    /** Vector2 */
    @js.native
    sealed trait Vector2 extends NodeMaterialBlockConnectionPointTypes
    
    /** Vector3 */
    @js.native
    sealed trait Vector3 extends NodeMaterialBlockConnectionPointTypes
    
    /** Vector4 */
    @js.native
    sealed trait Vector4 extends NodeMaterialBlockConnectionPointTypes
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointTypes with Double] = js.native
    /* 1024 */ @js.native
    object AutoDetect extends TopLevel[AutoDetect with Double]
    
    /* 2048 */ @js.native
    object BasedOnInput extends TopLevel[BasedOnInput with Double]
    
    /* 32 */ @js.native
    object Color3 extends TopLevel[Color3 with Double]
    
    /* 64 */ @js.native
    object Color4 extends TopLevel[Color4 with Double]
    
    /* 1 */ @js.native
    object Float extends TopLevel[Float with Double]
    
    /* 2 */ @js.native
    object Int extends TopLevel[Int with Double]
    
    /* 128 */ @js.native
    object Matrix extends TopLevel[Matrix with Double]
    
    /* 4 */ @js.native
    object Vector2 extends TopLevel[Vector2 with Double]
    
    /* 8 */ @js.native
    object Vector3 extends TopLevel[Vector3 with Double]
    
    /* 16 */ @js.native
    object Vector4 extends TopLevel[Vector4 with Double]
    
  }
  
}

