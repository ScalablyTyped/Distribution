package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Label")
@js.native
open class Label () extends StObject {
  
  /**
    * Gets or sets the background color of this label.
    */
  var backgroundColor: Color = js.native
  
  /**
    * Gets or sets the background padding, in pixels, of this label.  The <code>x</code> value
    * controls horizontal padding, and the <code>y</code> value controls vertical padding.
    */
  var backgroundPadding: Cartesian2 = js.native
  
  /**
    * Computes the screen-space position of the label's origin, taking into account eye and pixel offsets.
    * The screen space origin is the top, left corner of the canvas; <code>x</code> increases from
    * left to right, and <code>y</code> increases from top to bottom.
    * @example
    * console.log(l.computeScreenSpacePosition(scene).toString());
    * @param scene - The scene the label is in.
    * @param [result] - The object onto which to store the result.
    * @returns The screen-space position of the label.
    */
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
    * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
    */
  var disableDepthTestDistance: Double = js.native
  
  /**
    * Gets or sets the condition specifying at what distance from the camera that this label will be displayed.
    */
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  /**
    * Determines if this label equals another label.  Labels are equal if all their properties
    * are equal.  Labels in different collections can be equal.
    * @param other - The label to compare for equality.
    * @returns <code>true</code> if the labels are equal; otherwise, <code>false</code>.
    */
  def equals(other: Label): Boolean = js.native
  
  /**
    * Gets and sets the 3D Cartesian offset applied to this label in eye coordinates.  Eye coordinates is a left-handed
    * coordinate system, where <code>x</code> points towards the viewer's right, <code>y</code> points up, and
    * <code>z</code> points into the screen.  Eye coordinates use the same scale as world and model coordinates,
    * which is typically meters.
    * <br /><br />
    * An eye offset is commonly used to arrange multiple label or objects at the same position, e.g., to
    * arrange a label above its corresponding 3D model.
    * <br /><br />
    * Below, the label is positioned at the center of the Earth but an eye offset makes it always
    * appear on top of the Earth regardless of the viewer's or Earth's orientation.
    * <br /><br />
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.one.png' width='250' height='188' /></td>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.two.png' width='250' height='188' /></td>
    * </tr></table>
    * <code>l.eyeOffset = new Cartesian3(0.0, 8000000.0, 0.0);</code><br /><br />
    * </div>
    */
  var eyeOffset: Cartesian3 = js.native
  
  /**
    * Gets or sets the fill color of this label.
    */
  var fillColor: Color = js.native
  
  /**
    * Gets or sets the font used to draw this label. Fonts are specified using the same syntax as the CSS 'font' property.
    */
  var font: String = js.native
  
  /**
    * Gets or sets the height reference of this billboard.
    */
  var heightReference: HeightReference = js.native
  
  /**
    * Gets or sets the horizontal origin of this label, which determines if the label is drawn
    * to the left, center, or right of its anchor position.
    * <br /><br />
    * <div align='center'>
    * <img src='Images/Billboard.setHorizontalOrigin.png' width='648' height='196' /><br />
    * </div>
    * @example
    * // Use a top, right origin
    * l.horizontalOrigin = Cesium.HorizontalOrigin.RIGHT;
    * l.verticalOrigin = Cesium.VerticalOrigin.TOP;
    */
  var horizontalOrigin: HorizontalOrigin = js.native
  
  /**
    * Gets or sets the user-defined value returned when the label is picked.
    */
  var id: Any = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets the outline color of this label.
    */
  var outlineColor: Color = js.native
  
  /**
    * Gets or sets the outline width of this label.
    */
  var outlineWidth: Double = js.native
  
  /**
    * Gets or sets the pixel offset in screen space from the origin of this label.  This is commonly used
    * to align multiple labels and billboards at the same position, e.g., an image and text.  The
    * screen space origin is the top, left corner of the canvas; <code>x</code> increases from
    * left to right, and <code>y</code> increases from top to bottom.
    * <br /><br />
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>default</code><br/><img src='Images/Label.setPixelOffset.default.png' width='250' height='188' /></td>
    * <td align='center'><code>l.pixeloffset = new Cartesian2(25, 75);</code><br/><img src='Images/Label.setPixelOffset.x50y-25.png' width='250' height='188' /></td>
    * </tr></table>
    * The label's origin is indicated by the yellow point.
    * </div>
    */
  var pixelOffset: Cartesian2 = js.native
  
  /**
    * Gets or sets near and far pixel offset scaling properties of a Label based on the Label's distance from the camera.
    * A label's pixel offset will be scaled between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the label's pixel offset scaling remains clamped to the nearest bound.  If undefined,
    * pixelOffsetScaleByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a label's pixel offset scale to 0.0 when the
    * // camera is 1500 meters from the label and scale pixel offset to 10.0 pixels
    * // in the y direction the camera distance approaches 8.0e6 meters.
    * text.pixelOffset = new Cesium.Cartesian2(0.0, 1.0);
    * text.pixelOffsetScaleByDistance = new Cesium.NearFarScalar(1.5e2, 0.0, 8.0e6, 10.0);
    * @example
    * // Example 2.
    * // disable pixel offset by distance
    * text.pixelOffsetScaleByDistance = undefined;
    */
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  
  /**
    * Gets or sets the Cartesian position of this label.
    */
  var position: Cartesian3 = js.native
  
  /**
    * Gets or sets the uniform scale that is multiplied with the label's size in pixels.
    * A scale of <code>1.0</code> does not change the size of the label; a scale greater than
    * <code>1.0</code> enlarges the label; a positive scale less than <code>1.0</code> shrinks
    * the label.
    * <br /><br />
    * Applying a large scale value may pixelate the label.  To make text larger without pixelation,
    * use a larger font size when calling {@link Label#font} instead.
    * <br /><br />
    * <div align='center'>
    * <img src='Images/Label.setScale.png' width='400' height='300' /><br/>
    * From left to right in the above image, the scales are <code>0.5</code>, <code>1.0</code>,
    * and <code>2.0</code>.
    * </div>
    */
  var scale: Double = js.native
  
  /**
    * Gets or sets near and far scaling properties of a Label based on the label's distance from the camera.
    * A label's scale will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the label's scale remains clamped to the nearest bound.  If undefined,
    * scaleByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a label's scaleByDistance to scale by 1.5 when the
    * // camera is 1500 meters from the label and disappear as
    * // the camera distance approaches 8.0e6 meters.
    * label.scaleByDistance = new Cesium.NearFarScalar(1.5e2, 1.5, 8.0e6, 0.0);
    * @example
    * // Example 2.
    * // disable scaling by distance
    * label.scaleByDistance = undefined;
    */
  var scaleByDistance: NearFarScalar = js.native
  
  /**
    * Determines if this label will be shown.  Use this to hide or show a label, instead
    * of removing it and re-adding it to the collection.
    */
  var show: Boolean = js.native
  
  /**
    * Determines if a background behind this label will be shown.
    */
  var showBackground: Boolean = js.native
  
  /**
    * Gets or sets the style of this label.
    */
  var style: LabelStyle = js.native
  
  /**
    * Gets or sets the text of this label.
    */
  var text: String = js.native
  
  /**
    * Gets the total scale of the label, which is the label's scale multiplied by the computed relative size
    * of the desired font compared to the generated glyph size.
    */
  var totalScale: Double = js.native
  
  /**
    * Gets or sets near and far translucency properties of a Label based on the Label's distance from the camera.
    * A label's translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the label's translucency remains clamped to the nearest bound.  If undefined,
    * translucencyByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a label's translucencyByDistance to 1.0 when the
    * // camera is 1500 meters from the label and disappear as
    * // the camera distance approaches 8.0e6 meters.
    * text.translucencyByDistance = new Cesium.NearFarScalar(1.5e2, 1.0, 8.0e6, 0.0);
    * @example
    * // Example 2.
    * // disable translucency by distance
    * text.translucencyByDistance = undefined;
    */
  var translucencyByDistance: NearFarScalar = js.native
  
  /**
    * Gets or sets the vertical origin of this label, which determines if the label is
    * to the above, below, or at the center of its anchor position.
    * <br /><br />
    * <div align='center'>
    * <img src='Images/Billboard.setVerticalOrigin.png' width='695' height='175' /><br />
    * </div>
    * @example
    * // Use a top, right origin
    * l.horizontalOrigin = Cesium.HorizontalOrigin.RIGHT;
    * l.verticalOrigin = Cesium.VerticalOrigin.TOP;
    */
  var verticalOrigin: VerticalOrigin = js.native
}
/* static members */
object Label {
  
  @JSImport("cesium", "Label")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determines whether or not run the algorithm, that match the text of the label to right-to-left languages
    * @example
    * // Example 1.
    * // Set a label's rightToLeft before init
    * Cesium.Label.enableRightToLeftDetection = true;
    * const myLabelEntity = viewer.entities.add({
    *   label: {
    *     id: 'my label',
    *     text: 'זה טקסט בעברית \n ועכשיו יורדים שורה',
    *   }
    * });
    * @example
    * // Example 2.
    * const myLabelEntity = viewer.entities.add({
    *   label: {
    *     id: 'my label',
    *     text: 'English text'
    *   }
    * });
    * // Set a label's rightToLeft after init
    * Cesium.Label.enableRightToLeftDetection = true;
    * myLabelEntity.text = 'טקסט חדש';
    */
  @JSImport("cesium", "Label.enableRightToLeftDetection")
  @js.native
  def enableRightToLeftDetection: Boolean = js.native
  inline def enableRightToLeftDetection_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableRightToLeftDetection")(x.asInstanceOf[js.Any])
}
