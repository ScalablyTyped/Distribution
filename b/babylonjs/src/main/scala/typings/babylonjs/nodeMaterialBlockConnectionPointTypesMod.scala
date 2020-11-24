package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointTypes", JSImport.Namespace)
@js.native
object nodeMaterialBlockConnectionPointTypesMod extends js.Object {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointTypes extends js.Object
  @js.native
  object NodeMaterialBlockConnectionPointTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointTypes with Double] = js.native
    
    /** Detect type based on connection */
    @js.native
    sealed trait AutoDetect extends NodeMaterialBlockConnectionPointTypes
    /* 1024 */ @js.native
    object AutoDetect extends TopLevel[AutoDetect with Double]
    
    /** Output type that will be defined by input type */
    @js.native
    sealed trait BasedOnInput extends NodeMaterialBlockConnectionPointTypes
    /* 2048 */ @js.native
    object BasedOnInput extends TopLevel[BasedOnInput with Double]
    
    /** Color3 */
    @js.native
    sealed trait Color3 extends NodeMaterialBlockConnectionPointTypes
    /* 32 */ @js.native
    object Color3 extends TopLevel[Color3 with Double]
    
    /** Color4 */
    @js.native
    sealed trait Color4 extends NodeMaterialBlockConnectionPointTypes
    /* 64 */ @js.native
    object Color4 extends TopLevel[Color4 with Double]
    
    /** Float */
    @js.native
    sealed trait Float extends NodeMaterialBlockConnectionPointTypes
    /* 1 */ @js.native
    object Float extends TopLevel[Float with Double]
    
    /** Int */
    @js.native
    sealed trait Int extends NodeMaterialBlockConnectionPointTypes
    /* 2 */ @js.native
    object Int extends TopLevel[Int with Double]
    
    /** Matrix */
    @js.native
    sealed trait Matrix extends NodeMaterialBlockConnectionPointTypes
    /* 128 */ @js.native
    object Matrix extends TopLevel[Matrix with Double]
    
    /** Custom object */
    @js.native
    sealed trait Object extends NodeMaterialBlockConnectionPointTypes
    /* 256 */ @js.native
    object Object extends TopLevel[Object with Double]
    
    /** Vector2 */
    @js.native
    sealed trait Vector2 extends NodeMaterialBlockConnectionPointTypes
    /* 4 */ @js.native
    object Vector2 extends TopLevel[Vector2 with Double]
    
    /** Vector3 */
    @js.native
    sealed trait Vector3 extends NodeMaterialBlockConnectionPointTypes
    /* 8 */ @js.native
    object Vector3 extends TopLevel[Vector3 with Double]
    
    /** Vector4 */
    @js.native
    sealed trait Vector4 extends NodeMaterialBlockConnectionPointTypes
    /* 16 */ @js.native
    object Vector4 extends TopLevel[Vector4 with Double]
  }
}
