package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CullingVolume")
@js.native
open class CullingVolume () extends StObject {
  def this(planes: js.Array[Cartesian4]) = this()
  
  /**
    * Determines whether a bounding volume intersects the culling volume.
    * @param boundingVolume - The bounding volume whose intersection with the culling volume is to be tested.
    * @returns Intersect.OUTSIDE, Intersect.INTERSECTING, or Intersect.INSIDE.
    */
  def computeVisibility(boundingVolume: Any): Intersect = js.native
  
  /**
    * Each plane is represented by a Cartesian4 object, where the x, y, and z components
    * define the unit vector normal to the plane, and the w component is the distance of the
    * plane from the origin.
    */
  var planes: js.Array[Cartesian4] = js.native
}
/* static members */
object CullingVolume {
  
  @JSImport("cesium", "CullingVolume")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a culling volume from a bounding sphere. Creates six planes that create a box containing the sphere.
    * The planes are aligned to the x, y, and z axes in world coordinates.
    * @param boundingSphere - The bounding sphere used to create the culling volume.
    * @param [result] - The object onto which to store the result.
    * @returns The culling volume created from the bounding sphere.
    */
  inline def fromBoundingSphere(boundingSphere: BoundingSphere): CullingVolume = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(boundingSphere.asInstanceOf[js.Any]).asInstanceOf[CullingVolume]
  inline def fromBoundingSphere(boundingSphere: BoundingSphere, result: CullingVolume): CullingVolume = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(boundingSphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CullingVolume]
}
