package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialBlockConnectionPointTypesMod {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointTypes extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointTypes", "NodeMaterialBlockConnectionPointTypes")
  @js.native
  object NodeMaterialBlockConnectionPointTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointTypes with Double] = js.native
    
    /** Detect type based on connection */
    @js.native
    sealed trait AutoDetect extends NodeMaterialBlockConnectionPointTypes
    /* 1024 */ val AutoDetect: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.AutoDetect with Double = js.native
    
    /** Output type that will be defined by input type */
    @js.native
    sealed trait BasedOnInput extends NodeMaterialBlockConnectionPointTypes
    /* 2048 */ val BasedOnInput: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.BasedOnInput with Double = js.native
    
    /** Color3 */
    @js.native
    sealed trait Color3 extends NodeMaterialBlockConnectionPointTypes
    /* 32 */ val Color3: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Color3 with Double = js.native
    
    /** Color4 */
    @js.native
    sealed trait Color4 extends NodeMaterialBlockConnectionPointTypes
    /* 64 */ val Color4: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Color4 with Double = js.native
    
    /** Float */
    @js.native
    sealed trait Float extends NodeMaterialBlockConnectionPointTypes
    /* 1 */ val Float: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Float with Double = js.native
    
    /** Int */
    @js.native
    sealed trait Int extends NodeMaterialBlockConnectionPointTypes
    /* 2 */ val Int: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Int with Double = js.native
    
    /** Matrix */
    @js.native
    sealed trait Matrix extends NodeMaterialBlockConnectionPointTypes
    /* 128 */ val Matrix: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Matrix with Double = js.native
    
    /** Custom object */
    @js.native
    sealed trait Object extends NodeMaterialBlockConnectionPointTypes
    /* 256 */ val Object: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Object with Double = js.native
    
    /** Vector2 */
    @js.native
    sealed trait Vector2 extends NodeMaterialBlockConnectionPointTypes
    /* 4 */ val Vector2: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Vector2 with Double = js.native
    
    /** Vector3 */
    @js.native
    sealed trait Vector3 extends NodeMaterialBlockConnectionPointTypes
    /* 8 */ val Vector3: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Vector3 with Double = js.native
    
    /** Vector4 */
    @js.native
    sealed trait Vector4 extends NodeMaterialBlockConnectionPointTypes
    /* 16 */ val Vector4: typings.babylonjs.nodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Vector4 with Double = js.native
  }
}
