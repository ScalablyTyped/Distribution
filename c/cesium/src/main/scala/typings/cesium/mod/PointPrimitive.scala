package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PointPrimitive")
@js.native
open class PointPrimitive () extends StObject {
  
  /**
    * Gets or sets the inner color of the point.
    * The red, green, blue, and alpha values are indicated by <code>value</code>'s <code>red</code>, <code>green</code>,
    * <code>blue</code>, and <code>alpha</code> properties as shown in Example 1.  These components range from <code>0.0</code>
    * (no intensity) to <code>1.0</code> (full intensity).
    * @example
    * // Example 1. Assign yellow.
    * p.color = Cesium.Color.YELLOW;
    * @example
    * // Example 2. Make a pointPrimitive 50% translucent.
    * p.color = new Cesium.Color(1.0, 1.0, 1.0, 0.5);
    */
  var color: Color = js.native
  
  /**
    * Computes the screen-space position of the point's origin.
    * The screen space origin is the top, left corner of the canvas; <code>x</code> increases from
    * left to right, and <code>y</code> increases from top to bottom.
    * @example
    * console.log(p.computeScreenSpacePosition(scene).toString());
    * @param scene - The scene.
    * @param [result] - The object onto which to store the result.
    * @returns The screen-space position of the point.
    */
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
    * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
    */
  var disableDepthTestDistance: Double = js.native
  
  /**
    * Gets or sets the condition specifying at what distance from the camera that this point will be displayed.
    */
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  /**
    * Determines if this point equals another point.  Points are equal if all their properties
    * are equal.  Points in different collections can be equal.
    * @param other - The point to compare for equality.
    * @returns <code>true</code> if the points are equal; otherwise, <code>false</code>.
    */
  def equals(other: PointPrimitive): Boolean = js.native
  
  /**
    * Gets or sets the user-defined value returned when the point is picked.
    */
  var id: Any = js.native
  
  /**
    * Gets or sets the outline color of the point.
    */
  var outlineColor: Color = js.native
  
  /**
    * Gets or sets the outline width in pixels.  This width adds to pixelSize,
    * increasing the total size of the point.
    */
  var outlineWidth: Double = js.native
  
  /**
    * Gets or sets the inner size of the point in pixels.
    */
  var pixelSize: Double = js.native
  
  /**
    * Gets or sets the Cartesian position of this point.
    */
  var position: Cartesian3 = js.native
  
  /**
    * Gets or sets near and far scaling properties of a point based on the point's distance from the camera.
    * A point's scale will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the point's scale remains clamped to the nearest bound.  This scale
    * multiplies the pixelSize and outlineWidth to affect the total size of the point.  If undefined,
    * scaleByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a pointPrimitive's scaleByDistance to scale to 15 when the
    * // camera is 1500 meters from the pointPrimitive and disappear as
    * // the camera distance approaches 8.0e6 meters.
    * p.scaleByDistance = new Cesium.NearFarScalar(1.5e2, 15, 8.0e6, 0.0);
    * @example
    * // Example 2.
    * // disable scaling by distance
    * p.scaleByDistance = undefined;
    */
  var scaleByDistance: NearFarScalar = js.native
  
  /**
    * Determines if this point will be shown.  Use this to hide or show a point, instead
    * of removing it and re-adding it to the collection.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets near and far translucency properties of a point based on the point's distance from the camera.
    * A point's translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the point's translucency remains clamped to the nearest bound.  If undefined,
    * translucencyByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a point's translucency to 1.0 when the
    * // camera is 1500 meters from the point and disappear as
    * // the camera distance approaches 8.0e6 meters.
    * p.translucencyByDistance = new Cesium.NearFarScalar(1.5e2, 1.0, 8.0e6, 0.0);
    * @example
    * // Example 2.
    * // disable translucency by distance
    * p.translucencyByDistance = undefined;
    */
  var translucencyByDistance: NearFarScalar = js.native
}
