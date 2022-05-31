package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialSystemValuesMod {
  
  @js.native
  sealed trait NodeMaterialSystemValues extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialSystemValues", "NodeMaterialSystemValues")
  @js.native
  object NodeMaterialSystemValues extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialSystemValues & Double] = js.native
    
    /** CameraPosition */
    @js.native
    sealed trait CameraPosition
      extends StObject
         with NodeMaterialSystemValues
    /* 7 */ val CameraPosition: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.CameraPosition & Double = js.native
    
    /** Delta time */
    @js.native
    sealed trait DeltaTime
      extends StObject
         with NodeMaterialSystemValues
    /* 9 */ val DeltaTime: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.DeltaTime & Double = js.native
    
    /** Fog Color */
    @js.native
    sealed trait FogColor
      extends StObject
         with NodeMaterialSystemValues
    /* 8 */ val FogColor: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.FogColor & Double = js.native
    
    /** Projection */
    @js.native
    sealed trait Projection
      extends StObject
         with NodeMaterialSystemValues
    /* 3 */ val Projection: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.Projection & Double = js.native
    
    /** View */
    @js.native
    sealed trait View
      extends StObject
         with NodeMaterialSystemValues
    /* 2 */ val View: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.View & Double = js.native
    
    /** ViewProjection */
    @js.native
    sealed trait ViewProjection
      extends StObject
         with NodeMaterialSystemValues
    /* 4 */ val ViewProjection: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.ViewProjection & Double = js.native
    
    /** World */
    @js.native
    sealed trait World
      extends StObject
         with NodeMaterialSystemValues
    /* 1 */ val World: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.World & Double = js.native
    
    /** WorldView */
    @js.native
    sealed trait WorldView
      extends StObject
         with NodeMaterialSystemValues
    /* 5 */ val WorldView: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.WorldView & Double = js.native
    
    /** WorldViewProjection */
    @js.native
    sealed trait WorldViewProjection
      extends StObject
         with NodeMaterialSystemValues
    /* 6 */ val WorldViewProjection: typings.babylonjs.nodeMaterialSystemValuesMod.NodeMaterialSystemValues.WorldViewProjection & Double = js.native
  }
}
