package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VoxelShapeType extends StObject
@JSImport("cesium", "VoxelShapeType")
@js.native
object VoxelShapeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VoxelShapeType & String] = js.native
  
  /**
    * A box shape.
    */
  @js.native
  sealed trait BOX
    extends StObject
       with VoxelShapeType
  /* "BOX" */ val BOX: typings.cesium.mod.VoxelShapeType.BOX & String = js.native
  
  /**
    * A cylinder shape.
    */
  @js.native
  sealed trait CYLINDER
    extends StObject
       with VoxelShapeType
  /* "CYLINDER" */ val CYLINDER: typings.cesium.mod.VoxelShapeType.CYLINDER & String = js.native
  
  /**
    * An ellipsoid shape.
    */
  @js.native
  sealed trait ELLIPSOID
    extends StObject
       with VoxelShapeType
  /* "ELLIPSOID" */ val ELLIPSOID: typings.cesium.mod.VoxelShapeType.ELLIPSOID & String = js.native
}
