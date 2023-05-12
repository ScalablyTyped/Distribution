package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "LabelCollection")
@js.native
open class LabelCollection () extends StObject {
  def this(options: typings.cesiumEngine.anon.BlendOption) = this()
  
  /**
    * Creates and adds a label with the specified initial properties to the collection.
    * The added label is returned so it can be modified or removed from the collection later.
    * @example
    * // Example 1:  Add a label, specifying all the default values.
    * const l = labels.add({
    *   show : true,
    *   position : Cesium.Cartesian3.ZERO,
    *   text : '',
    *   font : '30px sans-serif',
    *   fillColor : Cesium.Color.WHITE,
    *   outlineColor : Cesium.Color.BLACK,
    *   outlineWidth : 1.0,
    *   showBackground : false,
    *   backgroundColor : new Cesium.Color(0.165, 0.165, 0.165, 0.8),
    *   backgroundPadding : new Cesium.Cartesian2(7, 5),
    *   style : Cesium.LabelStyle.FILL,
    *   pixelOffset : Cesium.Cartesian2.ZERO,
    *   eyeOffset : Cesium.Cartesian3.ZERO,
    *   horizontalOrigin : Cesium.HorizontalOrigin.LEFT,
    *   verticalOrigin : Cesium.VerticalOrigin.BASELINE,
    *   scale : 1.0,
    *   translucencyByDistance : undefined,
    *   pixelOffsetScaleByDistance : undefined,
    *   heightReference : HeightReference.NONE,
    *   distanceDisplayCondition : undefined
    * });
    * @example
    * // Example 2:  Specify only the label's cartographic position,
    * // text, and font.
    * const l = labels.add({
    *   position : Cesium.Cartesian3.fromRadians(longitude, latitude, height),
    *   text : 'Hello World',
    *   font : '24px Helvetica',
    * });
    * @param [options] - A template describing the label's properties as shown in Example 1.
    * @returns The label that was added to the collection.
    */
  def add(): Label = js.native
  def add(options: Any): Label = js.native
  
  /**
    * The label blending option. The default is used for rendering both opaque and translucent labels.
    * However, if either all of the labels are completely opaque or all are completely translucent,
    * setting the technique to BlendOption.OPAQUE or BlendOption.TRANSLUCENT can improve
    * performance by up to 2x.
    */
  var blendOption: BlendOption = js.native
  
  /**
    * Check whether this collection contains a given label.
    * @param label - The label to check for.
    * @returns true if this collection contains the label, false otherwise.
    */
  def contains(label: Label): Boolean = js.native
  
  /**
    * This property is for debugging only; it is not for production use nor is it optimized.
    * <p>
    * Draws the bounding sphere for each draw command in the primitive.
    * </p>
    */
  var debugShowBoundingVolume: Boolean = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * labels = labels && labels.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the label in the collection at the specified index.  Indices are zero-based
    * and increase as labels are added.  Removing a label shifts all labels after
    * it to the left, changing their indices.  This function is commonly used with
    * {@link LabelCollection#length} to iterate over all the labels
    * in the collection.
    * @example
    * // Toggle the show property of every label in the collection
    * const len = labels.length;
    * for (let i = 0; i < len; ++i) {
    *   const l = billboards.get(i);
    *   l.show = !l.show;
    * }
    * @param index - The zero-based index of the billboard.
    * @returns The label at the specified index.
    */
  def get(index: Double): Label = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Returns the number of labels in this collection.  This is commonly used with
    * {@link LabelCollection#get} to iterate over all the labels
    * in the collection.
    */
  var length: Double = js.native
  
  /**
    * The 4x4 transformation matrix that transforms each label in this collection from model to world coordinates.
    * When this is the identity matrix, the labels are drawn in world coordinates, i.e., Earth's WGS84 coordinates.
    * Local reference frames can be used by providing a different transformation matrix, like that returned
    * by {@link Transforms.eastNorthUpToFixedFrame}.
    * @example
    * const center = Cesium.Cartesian3.fromDegrees(-75.59777, 40.03883);
    * labels.modelMatrix = Cesium.Transforms.eastNorthUpToFixedFrame(center);
    * labels.add({
    *   position : new Cesium.Cartesian3(0.0, 0.0, 0.0),
    *   text     : 'Center'
    * });
    * labels.add({
    *   position : new Cesium.Cartesian3(1000000.0, 0.0, 0.0),
    *   text     : 'East'
    * });
    * labels.add({
    *   position : new Cesium.Cartesian3(0.0, 1000000.0, 0.0),
    *   text     : 'North'
    * });
    * labels.add({
    *   position : new Cesium.Cartesian3(0.0, 0.0, 1000000.0),
    *   text     : 'Up'
    * });
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Removes a label from the collection.  Once removed, a label is no longer usable.
    * @example
    * const l = labels.add(...);
    * labels.remove(l);  // Returns true
    * @param label - The label to remove.
    * @returns <code>true</code> if the label was removed; <code>false</code> if the label was not found in the collection.
    */
  def remove(label: Label): Boolean = js.native
  
  /**
    * Removes all labels from the collection.
    * @example
    * labels.add(...);
    * labels.add(...);
    * labels.removeAll();
    */
  def removeAll(): Unit = js.native
  
  /**
    * Determines if labels in this collection will be shown.
    */
  var show: Boolean = js.native
}
