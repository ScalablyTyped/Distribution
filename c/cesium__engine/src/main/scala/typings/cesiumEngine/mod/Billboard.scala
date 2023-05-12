package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.Billboard.CreateImageCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Billboard")
@js.native
open class Billboard () extends StObject {
  
  /**
    * Gets or sets the aligned axis in world space. The aligned axis is the unit vector that the billboard up vector points towards.
    * The default is the zero vector, which means the billboard is aligned to the screen up vector.
    * @example
    * // Example 1.
    * // Have the billboard up vector point north
    * billboard.alignedAxis = Cesium.Cartesian3.UNIT_Z;
    * @example
    * // Example 2.
    * // Have the billboard point east.
    * billboard.alignedAxis = Cesium.Cartesian3.UNIT_Z;
    * billboard.rotation = -Cesium.Math.PI_OVER_TWO;
    * @example
    * // Example 3.
    * // Reset the aligned axis
    * billboard.alignedAxis = Cesium.Cartesian3.ZERO;
    */
  var alignedAxis: Cartesian3 = js.native
  
  /**
    * Gets or sets the color that is multiplied with the billboard's texture.  This has two common use cases.  First,
    * the same white texture may be used by many different billboards, each with a different color, to create
    * colored billboards.  Second, the color's alpha component can be used to make the billboard translucent as shown below.
    * An alpha of <code>0.0</code> makes the billboard transparent, and <code>1.0</code> makes the billboard opaque.
    * <br /><br />
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>default</code><br/><img src='Images/Billboard.setColor.Alpha255.png' width='250' height='188' /></td>
    * <td align='center'><code>alpha : 0.5</code><br/><img src='Images/Billboard.setColor.Alpha127.png' width='250' height='188' /></td>
    * </tr></table>
    * </div>
    * <br />
    * The red, green, blue, and alpha values are indicated by <code>value</code>'s <code>red</code>, <code>green</code>,
    * <code>blue</code>, and <code>alpha</code> properties as shown in Example 1.  These components range from <code>0.0</code>
    * (no intensity) to <code>1.0</code> (full intensity).
    * @example
    * // Example 1. Assign yellow.
    * b.color = Cesium.Color.YELLOW;
    * @example
    * // Example 2. Make a billboard 50% translucent.
    * b.color = new Cesium.Color(1.0, 1.0, 1.0, 0.5);
    */
  var color: Color = js.native
  
  /**
    * Computes the screen-space position of the billboard's origin, taking into account eye and pixel offsets.
    * The screen space origin is the top, left corner of the canvas; <code>x</code> increases from
    * left to right, and <code>y</code> increases from top to bottom.
    * @example
    * console.log(b.computeScreenSpacePosition(scene).toString());
    * @param scene - The scene.
    * @param [result] - The object onto which to store the result.
    * @returns The screen-space position of the billboard.
    */
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  
  /**
    * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
    * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
    */
  var disableDepthTestDistance: Double = js.native
  
  /**
    * Gets or sets the condition specifying at what distance from the camera that this billboard will be displayed.
    */
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  /**
    * Determines if this billboard equals another billboard.  Billboards are equal if all their properties
    * are equal.  Billboards in different collections can be equal.
    * @param other - The billboard to compare for equality.
    * @returns <code>true</code> if the billboards are equal; otherwise, <code>false</code>.
    */
  def equals(other: Billboard): Boolean = js.native
  
  /**
    * Gets or sets the 3D Cartesian offset applied to this billboard in eye coordinates.  Eye coordinates is a left-handed
    * coordinate system, where <code>x</code> points towards the viewer's right, <code>y</code> points up, and
    * <code>z</code> points into the screen.  Eye coordinates use the same scale as world and model coordinates,
    * which is typically meters.
    * <br /><br />
    * An eye offset is commonly used to arrange multiple billboards or objects at the same position, e.g., to
    * arrange a billboard above its corresponding 3D model.
    * <br /><br />
    * Below, the billboard is positioned at the center of the Earth but an eye offset makes it always
    * appear on top of the Earth regardless of the viewer's or Earth's orientation.
    * <br /><br />
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.one.png' width='250' height='188' /></td>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.two.png' width='250' height='188' /></td>
    * </tr></table>
    * <code>b.eyeOffset = new Cartesian3(0.0, 8000000.0, 0.0);</code><br /><br />
    * </div>
    */
  var eyeOffset: Cartesian3 = js.native
  
  /**
    * Gets or sets a height for the billboard. If undefined, the image height will be used.
    */
  var height: Double = js.native
  
  /**
    * Gets or sets the height reference of this billboard.
    */
  var heightReference: HeightReference = js.native
  
  /**
    * Gets or sets the horizontal origin of this billboard, which determines if the billboard is
    * to the left, center, or right of its anchor position.
    * <br /><br />
    * <div align='center'>
    * <img src='Images/Billboard.setHorizontalOrigin.png' width='648' height='196' /><br />
    * </div>
    * @example
    * // Use a bottom, left origin
    * b.horizontalOrigin = Cesium.HorizontalOrigin.LEFT;
    * b.verticalOrigin = Cesium.VerticalOrigin.BOTTOM;
    */
  var horizontalOrigin: HorizontalOrigin = js.native
  
  /**
    * Gets or sets the user-defined object returned when the billboard is picked.
    */
  var id: Any = js.native
  
  /**
    * <p>
    * Gets or sets the image to be used for this billboard.  If a texture has already been created for the
    * given image, the existing texture is used.
    * </p>
    * <p>
    * This property can be set to a loaded Image, a URL which will be loaded as an Image automatically,
    * a canvas, or another billboard's image property (from the same billboard collection).
    * </p>
    * @example
    * // load an image from a URL
    * b.image = 'some/image/url.png';
    *
    * // assuming b1 and b2 are billboards in the same billboard collection,
    * // use the same image for both billboards.
    * b2.image = b1.image;
    */
  var image: String = js.native
  
  /**
    * Gets or sets the pixel offset in screen space from the origin of this billboard.  This is commonly used
    * to align multiple billboards and labels at the same position, e.g., an image and text.  The
    * screen space origin is the top, left corner of the canvas; <code>x</code> increases from
    * left to right, and <code>y</code> increases from top to bottom.
    * <br /><br />
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>default</code><br/><img src='Images/Billboard.setPixelOffset.default.png' width='250' height='188' /></td>
    * <td align='center'><code>b.pixeloffset = new Cartesian2(50, 25);</code><br/><img src='Images/Billboard.setPixelOffset.x50y-25.png' width='250' height='188' /></td>
    * </tr></table>
    * The billboard's origin is indicated by the yellow point.
    * </div>
    */
  var pixelOffset: Cartesian2 = js.native
  
  /**
    * Gets or sets near and far pixel offset scaling properties of a Billboard based on the billboard's distance from the camera.
    * A billboard's pixel offset will be scaled between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the billboard's pixel offset scale remains clamped to the nearest bound.  If undefined,
    * pixelOffsetScaleByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a billboard's pixel offset scale to 0.0 when the
    * // camera is 1500 meters from the billboard and scale pixel offset to 10.0 pixels
    * // in the y direction the camera distance approaches 8.0e6 meters.
    * b.pixelOffset = new Cesium.Cartesian2(0.0, 1.0);
    * b.pixelOffsetScaleByDistance = new Cesium.NearFarScalar(1.5e2, 0.0, 8.0e6, 10.0);
    * @example
    * // Example 2.
    * // disable pixel offset by distance
    * b.pixelOffsetScaleByDistance = undefined;
    */
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  
  /**
    * Gets or sets the Cartesian position of this billboard.
    */
  var position: Cartesian3 = js.native
  
  /**
    * When <code>true</code>, this billboard is ready to render, i.e., the image
    * has been downloaded and the WebGL resources are created.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets or sets the rotation angle in radians.
    */
  var rotation: Double = js.native
  
  /**
    * Gets or sets the uniform scale that is multiplied with the billboard's image size in pixels.
    * A scale of <code>1.0</code> does not change the size of the billboard; a scale greater than
    * <code>1.0</code> enlarges the billboard; a positive scale less than <code>1.0</code> shrinks
    * the billboard.
    * <br /><br />
    * <div align='center'>
    * <img src='Images/Billboard.setScale.png' width='400' height='300' /><br/>
    * From left to right in the above image, the scales are <code>0.5</code>, <code>1.0</code>,
    * and <code>2.0</code>.
    * </div>
    */
  var scale: Double = js.native
  
  /**
    * Gets or sets near and far scaling properties of a Billboard based on the billboard's distance from the camera.
    * A billboard's scale will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the billboard's scale remains clamped to the nearest bound.  If undefined,
    * scaleByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a billboard's scaleByDistance to scale by 1.5 when the
    * // camera is 1500 meters from the billboard and disappear as
    * // the camera distance approaches 8.0e6 meters.
    * b.scaleByDistance = new Cesium.NearFarScalar(1.5e2, 1.5, 8.0e6, 0.0);
    * @example
    * // Example 2.
    * // disable scaling by distance
    * b.scaleByDistance = undefined;
    */
  var scaleByDistance: NearFarScalar = js.native
  
  def setImage(id: String, image: String): Unit = js.native
  def setImage(id: String, image: CreateImageCallback): Unit = js.native
  def setImage(id: String, image: Resource): Unit = js.native
  def setImage(id: String, image: HTMLCanvasElement): Unit = js.native
  /**
    * <p>
    * Sets the image to be used for this billboard.  If a texture has already been created for the
    * given id, the existing texture is used.
    * </p>
    * <p>
    * This function is useful for dynamically creating textures that are shared across many billboards.
    * Only the first billboard will actually call the function and create the texture, while subsequent
    * billboards created with the same id will simply re-use the existing texture.
    * </p>
    * <p>
    * To load an image from a URL, setting the {@link Billboard#image} property is more convenient.
    * </p>
    * @example
    * // create a billboard image dynamically
    * function drawImage(id) {
    *   // create and draw an image using a canvas
    *   const canvas = document.createElement('canvas');
    *   const context2D = canvas.getContext('2d');
    *   // ... draw image
    *   return canvas;
    * }
    * // drawImage will be called to create the texture
    * b.setImage('myImage', drawImage);
    *
    * // subsequent billboards created in the same collection using the same id will use the existing
    * // texture, without the need to create the canvas or draw the image
    * b2.setImage('myImage', drawImage);
    * @param id - The id of the image.  This can be any string that uniquely identifies the image.
    * @param image - The image to load.  This parameter
    *        can either be a loaded Image or Canvas, a URL which will be loaded as an Image automatically,
    *        or a function which will be called to create the image if it hasn't been loaded already.
    */
  def setImage(id: String, image: HTMLImageElement): Unit = js.native
  
  /**
    * Uses a sub-region of the image with the given id as the image for this billboard,
    * measured in pixels from the bottom-left.
    * @param id - The id of the image to use.
    * @param subRegion - The sub-region of the image.
    */
  def setImageSubRegion(id: String, subRegion: BoundingRectangle): Unit = js.native
  
  /**
    * Determines if this billboard will be shown.  Use this to hide or show a billboard, instead
    * of removing it and re-adding it to the collection.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets if the billboard size is in meters or pixels. <code>true</code> to size the billboard in meters;
    * otherwise, the size is in pixels.
    */
  var sizeInMeters: Boolean = js.native
  
  /**
    * Gets or sets near and far translucency properties of a Billboard based on the billboard's distance from the camera.
    * A billboard's translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the billboard's translucency remains clamped to the nearest bound.  If undefined,
    * translucencyByDistance will be disabled.
    * @example
    * // Example 1.
    * // Set a billboard's translucency to 1.0 when the
    * // camera is 1500 meters from the billboard and disappear as
    * // the camera distance approaches 8.0e6 meters.
    * b.translucencyByDistance = new Cesium.NearFarScalar(1.5e2, 1.0, 8.0e6, 0.0);
    * @example
    * // Example 2.
    * // disable translucency by distance
    * b.translucencyByDistance = undefined;
    */
  var translucencyByDistance: NearFarScalar = js.native
  
  /**
    * Gets or sets the vertical origin of this billboard, which determines if the billboard is
    * to the above, below, or at the center of its anchor position.
    * <br /><br />
    * <div align='center'>
    * <img src='Images/Billboard.setVerticalOrigin.png' width='695' height='175' /><br />
    * </div>
    * @example
    * // Use a bottom, left origin
    * b.horizontalOrigin = Cesium.HorizontalOrigin.LEFT;
    * b.verticalOrigin = Cesium.VerticalOrigin.BOTTOM;
    */
  var verticalOrigin: VerticalOrigin = js.native
  
  /**
    * Gets or sets a width for the billboard. If undefined, the image width will be used.
    */
  var width: Double = js.native
}
object Billboard {
  
  /**
    * A function that creates an image.
    * @param id - The identifier of the image to load.
    */
  type CreateImageCallback = js.Function1[
    /* id */ String, 
    HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
  ]
}
