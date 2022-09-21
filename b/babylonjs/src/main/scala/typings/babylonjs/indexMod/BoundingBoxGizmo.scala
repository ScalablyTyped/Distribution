package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BoundingBoxGizmo")
@js.native
/**
  * Creates an BoundingBoxGizmo
  * @param color The color of the gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
open class BoundingBoxGizmo ()
  extends typings.babylonjs.gizmosIndexMod.BoundingBoxGizmo {
  def this(color: typings.babylonjs.mathColorMod.Color3) = this()
  def this(color: Unit, gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
  def this(
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
}
/* static members */
object BoundingBoxGizmo {
  
  @JSImport("babylonjs/index", "BoundingBoxGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
    * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
    * @returns the bounding box mesh with the passed in mesh as a child
    */
  inline def MakeNotPickableAndWrapInBoundingBox(mesh: typings.babylonjs.meshMod.Mesh): typings.babylonjs.meshMod.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeNotPickableAndWrapInBoundingBox")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.meshMod.Mesh]
}
