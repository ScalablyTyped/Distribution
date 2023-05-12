package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.BillboardGraphics.ConstructorOptions
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "BillboardGraphics")
@js.native
open class BillboardGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the {@link Cartesian3} Property specifying the unit vector axis of rotation
    * in the fixed frame. When set to Cartesian3.ZERO the rotation is from the top of the screen.
    */
  var alignedAxis: js.UndefOr[Property] = js.native
  
  def clone(result: BillboardGraphics): BillboardGraphics = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} that is multiplied with the <code>image</code>.
    * This has two common use cases.  First, the same white texture may be used by many different billboards,
    * each with a different color, to create colored billboards. Second, the color's alpha component can be
    * used to make the billboard translucent as shown below. An alpha of <code>0.0</code> makes the billboard
    * transparent, and <code>1.0</code> makes the billboard opaque.
    * <p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>default</code><br/><img src='Images/Billboard.setColor.Alpha255.png' width='250' height='188' /></td>
    * <td align='center'><code>alpha : 0.5</code><br/><img src='Images/Billboard.setColor.Alpha127.png' width='250' height='188' /></td>
    * </tr></table>
    * </div>
    * </p>
    */
  var color: js.UndefOr[Property] = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the distance from the camera at which to disable the depth test to, for example, prevent clipping against terrain.
    * When set to zero, the depth test is always applied. When set to Number.POSITIVE_INFINITY, the depth test is never applied.
    */
  var disableDepthTestDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this billboard will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian3} Property specifying the billboard's offset in eye coordinates.
    * Eye coordinates is a left-handed coordinate system, where <code>x</code> points towards the viewer's
    * right, <code>y</code> points up, and <code>z</code> points into the screen.
    * <p>
    * An eye offset is commonly used to arrange multiple billboards or objects at the same position, e.g., to
    * arrange a billboard above its corresponding 3D model.
    * </p>
    * Below, the billboard is positioned at the center of the Earth but an eye offset makes it always
    * appear on top of the Earth regardless of the viewer's or Earth's orientation.
    * <p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.one.png' width='250' height='188' /></td>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.two.png' width='250' height='188' /></td>
    * </tr></table>
    * <code>b.eyeOffset = new Cartesian3(0.0, 8000000.0, 0.0);</code>
    * </div>
    * </p>
    */
  var eyeOffset: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the height of the billboard in pixels.
    * When undefined, the native height is used.
    */
  var height: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HorizontalOrigin}.
    */
  var horizontalOrigin: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the Image, URI, or Canvas to use for the billboard.
    */
  var image: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying a {@link BoundingRectangle} that defines a
    * sub-region of the <code>image</code> to use for the billboard, rather than the entire image,
    * measured in pixels from the bottom-left.
    */
  var imageSubRegion: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: BillboardGraphics): Unit = js.native
  
  /**
    * Gets or sets the {@link Cartesian2} Property specifying the billboard's pixel offset in screen space
    * from the origin of this billboard.  This is commonly used to align multiple billboards and labels at
    * the same position, e.g., an image and text.  The screen space origin is the top, left corner of the
    * canvas; <code>x</code> increases from left to right, and <code>y</code> increases from top to bottom.
    * <p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>default</code><br/><img src='Images/Billboard.setPixelOffset.default.png' width='250' height='188' /></td>
    * <td align='center'><code>b.pixeloffset = new Cartesian2(50, 25);</code><br/><img src='Images/Billboard.setPixelOffset.x50y-25.png' width='250' height='188' /></td>
    * </tr></table>
    * The billboard's origin is indicated by the yellow point.
    * </div>
    * </p>
    */
  var pixelOffset: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets {@link NearFarScalar} Property specifying the pixel offset of the billboard based on the distance from the camera.
    * A billboard's pixel offset will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the billboard's pixel offset remains clamped to the nearest bound.
    */
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the rotation of the image
    * counter clockwise from the <code>alignedAxis</code>.
    */
  var rotation: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the uniform scale to apply to the image.
    * A scale greater than <code>1.0</code> enlarges the billboard while a scale less than <code>1.0</code> shrinks it.
    * <p>
    * <div align='center'>
    * <img src='Images/Billboard.setScale.png' width='400' height='300' /><br/>
    * From left to right in the above image, the scales are <code>0.5</code>, <code>1.0</code>, and <code>2.0</code>.
    * </div>
    * </p>
    */
  var scale: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets {@link NearFarScalar} Property specifying the scale of the billboard based on the distance from the camera.
    * A billboard's scale will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the billboard's scale remains clamped to the nearest bound.
    */
  var scaleByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the billboard.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying if this billboard's size will be measured in meters.
    */
  var sizeInMeters: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets {@link NearFarScalar} Property specifying the translucency of the billboard based on the distance from the camera.
    * A billboard's translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the billboard's translucency remains clamped to the nearest bound.
    */
  var translucencyByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link VerticalOrigin}.
    */
  var verticalOrigin: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the width of the billboard in pixels.
    * When undefined, the native width is used.
    */
  var width: js.UndefOr[Property] = js.native
}
object BillboardGraphics {
  
  /**
    * Initialization options for the BillboardGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the billboard.
    * @property [image] - A Property specifying the Image, URI, or Canvas to use for the billboard.
    * @property [scale = 1.0] - A numeric Property specifying the scale to apply to the image size.
    * @property [pixelOffset = Cartesian2.ZERO] - A {@link Cartesian2} Property specifying the pixel offset.
    * @property [eyeOffset = Cartesian3.ZERO] - A {@link Cartesian3} Property specifying the eye offset.
    * @property [horizontalOrigin = HorizontalOrigin.CENTER] - A Property specifying the {@link HorizontalOrigin}.
    * @property [verticalOrigin = VerticalOrigin.CENTER] - A Property specifying the {@link VerticalOrigin}.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height is relative to.
    * @property [color = Color.WHITE] - A Property specifying the tint {@link Color} of the image.
    * @property [rotation = 0] - A numeric Property specifying the rotation about the alignedAxis.
    * @property [alignedAxis = Cartesian3.ZERO] - A {@link Cartesian3} Property specifying the unit vector axis of rotation.
    * @property [sizeInMeters] - A boolean Property specifying whether this billboard's size should be measured in meters.
    * @property [width] - A numeric Property specifying the width of the billboard in pixels, overriding the native size.
    * @property [height] - A numeric Property specifying the height of the billboard in pixels, overriding the native size.
    * @property [scaleByDistance] - A {@link NearFarScalar} Property used to scale the point based on distance from the camera.
    * @property [translucencyByDistance] - A {@link NearFarScalar} Property used to set translucency based on distance from the camera.
    * @property [pixelOffsetScaleByDistance] - A {@link NearFarScalar} Property used to set pixelOffset based on distance from the camera.
    * @property [imageSubRegion] - A Property specifying a {@link BoundingRectangle} that defines a sub-region of the image to use for the billboard, rather than the entire image, measured in pixels from the bottom-left.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this billboard will be displayed.
    * @property [disableDepthTestDistance] - A Property specifying the distance from the camera at which to disable the depth test to.
    */
  trait ConstructorOptions extends StObject {
    
    var alignedAxis: js.UndefOr[Property | Cartesian3] = js.undefined
    
    var color: js.UndefOr[Property | Color] = js.undefined
    
    var disableDepthTestDistance: js.UndefOr[Property | Double] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var eyeOffset: js.UndefOr[Property | Cartesian3] = js.undefined
    
    var height: js.UndefOr[Property | Double] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var horizontalOrigin: js.UndefOr[Property | HorizontalOrigin] = js.undefined
    
    var image: js.UndefOr[Property | String | HTMLCanvasElement] = js.undefined
    
    var imageSubRegion: js.UndefOr[Property | BoundingRectangle] = js.undefined
    
    var pixelOffset: js.UndefOr[Property | Cartesian2] = js.undefined
    
    var pixelOffsetScaleByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var rotation: js.UndefOr[Property | Double] = js.undefined
    
    var scale: js.UndefOr[Property | Double] = js.undefined
    
    var scaleByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var sizeInMeters: js.UndefOr[Property | Boolean] = js.undefined
    
    var translucencyByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var verticalOrigin: js.UndefOr[Property | VerticalOrigin] = js.undefined
    
    var width: js.UndefOr[Property | Double] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignedAxis(value: Property | Cartesian3): Self = StObject.set(x, "alignedAxis", value.asInstanceOf[js.Any])
      
      inline def setAlignedAxisUndefined: Self = StObject.set(x, "alignedAxis", js.undefined)
      
      inline def setColor(value: Property | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableDepthTestDistance(value: Property | Double): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
      
      inline def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setEyeOffset(value: Property | Cartesian3): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
      
      inline def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
      
      inline def setHeight(value: Property | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontalOrigin(value: Property | HorizontalOrigin): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
      
      inline def setImage(value: Property | String | HTMLCanvasElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageSubRegion(value: Property | BoundingRectangle): Self = StObject.set(x, "imageSubRegion", value.asInstanceOf[js.Any])
      
      inline def setImageSubRegionUndefined: Self = StObject.set(x, "imageSubRegion", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setPixelOffset(value: Property | Cartesian2): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
      
      inline def setPixelOffsetScaleByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
      
      inline def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
      
      inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
      
      inline def setRotation(value: Property | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Property | Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
      
      inline def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSizeInMeters(value: Property | Boolean): Self = StObject.set(x, "sizeInMeters", value.asInstanceOf[js.Any])
      
      inline def setSizeInMetersUndefined: Self = StObject.set(x, "sizeInMeters", js.undefined)
      
      inline def setTranslucencyByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
      
      inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
      
      inline def setVerticalOrigin(value: Property | VerticalOrigin): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
      
      inline def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
      
      inline def setWidth(value: Property | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
