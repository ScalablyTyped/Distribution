package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Enums/nodeMaterialSystemValues", JSImport.Namespace)
@js.native
object nodeMaterialSystemValuesMod extends js.Object {
  
  @js.native
  sealed trait NodeMaterialSystemValues extends js.Object
  @js.native
  object NodeMaterialSystemValues extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialSystemValues with Double] = js.native
    
    /** CameraPosition */
    @js.native
    sealed trait CameraPosition extends NodeMaterialSystemValues
    /* 7 */ @js.native
    object CameraPosition extends TopLevel[CameraPosition with Double]
    
    /** Delta time */
    @js.native
    sealed trait DeltaTime extends NodeMaterialSystemValues
    /* 9 */ @js.native
    object DeltaTime extends TopLevel[DeltaTime with Double]
    
    /** Fog Color */
    @js.native
    sealed trait FogColor extends NodeMaterialSystemValues
    /* 8 */ @js.native
    object FogColor extends TopLevel[FogColor with Double]
    
    /** Projection */
    @js.native
    sealed trait Projection extends NodeMaterialSystemValues
    /* 3 */ @js.native
    object Projection extends TopLevel[Projection with Double]
    
    /** View */
    @js.native
    sealed trait View extends NodeMaterialSystemValues
    /* 2 */ @js.native
    object View extends TopLevel[View with Double]
    
    /** ViewProjection */
    @js.native
    sealed trait ViewProjection extends NodeMaterialSystemValues
    /* 4 */ @js.native
    object ViewProjection extends TopLevel[ViewProjection with Double]
    
    /** World */
    @js.native
    sealed trait World extends NodeMaterialSystemValues
    /* 1 */ @js.native
    object World extends TopLevel[World with Double]
    
    /** WorldView */
    @js.native
    sealed trait WorldView extends NodeMaterialSystemValues
    /* 5 */ @js.native
    object WorldView extends TopLevel[WorldView with Double]
    
    /** WorldViewProjection */
    @js.native
    sealed trait WorldViewProjection extends NodeMaterialSystemValues
    /* 6 */ @js.native
    object WorldViewProjection extends TopLevel[WorldViewProjection with Double]
  }
}
