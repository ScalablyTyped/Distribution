package typings.babylonjs

import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathFrustumMod {
  
  @JSImport("babylonjs/Maths/math.frustum", "Frustum")
  @js.native
  class Frustum () extends StObject
  /* static members */
  object Frustum {
    
    /**
      * Gets the bottom frustum plane transformed by the transform matrix
      * @param transform transformation matrix to be applied to the resulting frustum plane
      * @param frustumPlane the resuling frustum plane
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetBottomPlaneToRef")
    @js.native
    def GetBottomPlaneToRef(transform: DeepImmutable[Matrix], frustumPlane: Plane): Unit = js.native
    
    /**
      * Gets the far frustum plane transformed by the transform matrix
      * @param transform transformation matrix to be applied to the resulting frustum plane
      * @param frustumPlane the resuling frustum plane
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetFarPlaneToRef")
    @js.native
    def GetFarPlaneToRef(transform: DeepImmutable[Matrix], frustumPlane: Plane): Unit = js.native
    
    /**
      * Gets the left frustum plane transformed by the transform matrix
      * @param transform transformation matrix to be applied to the resulting frustum plane
      * @param frustumPlane the resuling frustum plane
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetLeftPlaneToRef")
    @js.native
    def GetLeftPlaneToRef(transform: DeepImmutable[Matrix], frustumPlane: Plane): Unit = js.native
    
    /**
      * Gets the near frustum plane transformed by the transform matrix
      * @param transform transformation matrix to be applied to the resulting frustum plane
      * @param frustumPlane the resuling frustum plane
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetNearPlaneToRef")
    @js.native
    def GetNearPlaneToRef(transform: DeepImmutable[Matrix], frustumPlane: Plane): Unit = js.native
    
    /**
      * Gets the planes representing the frustum
      * @param transform matrix to be applied to the returned planes
      * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetPlanes")
    @js.native
    def GetPlanes(transform: DeepImmutable[Matrix]): js.Array[Plane] = js.native
    
    /**
      * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
      * @param transform transformation matrix to be applied to the resulting frustum planes
      * @param frustumPlanes the resuling frustum planes
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetPlanesToRef")
    @js.native
    def GetPlanesToRef(transform: DeepImmutable[Matrix], frustumPlanes: js.Array[Plane]): Unit = js.native
    
    /**
      * Gets the right frustum plane transformed by the transform matrix
      * @param transform transformation matrix to be applied to the resulting frustum plane
      * @param frustumPlane the resuling frustum plane
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetRightPlaneToRef")
    @js.native
    def GetRightPlaneToRef(transform: DeepImmutable[Matrix], frustumPlane: Plane): Unit = js.native
    
    /**
      * Gets the top frustum plane transformed by the transform matrix
      * @param transform transformation matrix to be applied to the resulting frustum plane
      * @param frustumPlane the resuling frustum plane
      */
    @JSImport("babylonjs/Maths/math.frustum", "Frustum.GetTopPlaneToRef")
    @js.native
    def GetTopPlaneToRef(transform: DeepImmutable[Matrix], frustumPlane: Plane): Unit = js.native
  }
}
