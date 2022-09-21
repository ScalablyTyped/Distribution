package typings.cesium.mod

import typings.cesium.mod.LabelGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "LabelGraphics")
@js.native
open class LabelGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the Property specifying the background {@link Color}.
    */
  var backgroundColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian2} Property specifying the label's horizontal and vertical
    * background padding in pixels.
    */
  var backgroundPadding: js.UndefOr[Property] = js.native
  
  def clone(result: LabelGraphics): LabelGraphics = js.native
  
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
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this label will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian3} Property specifying the label's offset in eye coordinates.
    * Eye coordinates is a left-handed coordinate system, where <code>x</code> points towards the viewer's
    * right, <code>y</code> points up, and <code>z</code> points into the screen.
    * <p>
    * An eye offset is commonly used to arrange multiple labels or objects at the same position, e.g., to
    * arrange a label above its corresponding 3D model.
    * </p>
    * Below, the label is positioned at the center of the Earth but an eye offset makes it always
    * appear on top of the Earth regardless of the viewer's or Earth's orientation.
    * <p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.one.png' width='250' height='188' /></td>
    * <td align='center'><img src='Images/Billboard.setEyeOffset.two.png' width='250' height='188' /></td>
    * </tr></table>
    * <code>l.eyeOffset = new Cartesian3(0.0, 8000000.0, 0.0);</code><br /><br />
    * </div>
    * </p>
    */
  var eyeOffset: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the fill {@link Color}.
    */
  var fillColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the string Property specifying the font in CSS syntax.
    */
  var font: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HorizontalOrigin}.
    */
  var horizontalOrigin: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: LabelGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying the outline {@link Color}.
    */
  var outlineColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the outline width.
    */
  var outlineWidth: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link Cartesian2} Property specifying the label's pixel offset in screen space
    * from the origin of this label.  This is commonly used to align multiple labels and labels at
    * the same position, e.g., an image and text.  The screen space origin is the top, left corner of the
    * canvas; <code>x</code> increases from left to right, and <code>y</code> increases from top to bottom.
    * <p>
    * <div align='center'>
    * <table border='0' cellpadding='5'><tr>
    * <td align='center'><code>default</code><br/><img src='Images/Label.setPixelOffset.default.png' width='250' height='188' /></td>
    * <td align='center'><code>l.pixeloffset = new Cartesian2(25, 75);</code><br/><img src='Images/Label.setPixelOffset.x50y-25.png' width='250' height='188' /></td>
    * </tr></table>
    * The label's origin is indicated by the yellow point.
    * </div>
    * </p>
    */
  var pixelOffset: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets {@link NearFarScalar} Property specifying the pixel offset of the label based on the distance from the camera.
    * A label's pixel offset will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the label's pixel offset remains clamped to the nearest bound.
    */
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the uniform scale to apply to the image.
    * A scale greater than <code>1.0</code> enlarges the label while a scale less than <code>1.0</code> shrinks it.
    * <p>
    * <div align='center'>
    * <img src='Images/Label.setScale.png' width='400' height='300' /><br/>
    * From left to right in the above image, the scales are <code>0.5</code>, <code>1.0</code>,
    * and <code>2.0</code>.
    * </div>
    * </p>
    */
  var scale: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets near and far scaling properties of a Label based on the label's distance from the camera.
    * A label's scale will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the label's scale remains clamped to the nearest bound.  If undefined,
    * scaleByDistance will be disabled.
    */
  var scaleByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the label.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the background behind the label.
    */
  var showBackground: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link LabelStyle}.
    */
  var style: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the string Property specifying the text of the label.
    * Explicit newlines '\n' are supported.
    */
  var text: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets {@link NearFarScalar} Property specifying the translucency of the label based on the distance from the camera.
    * A label's translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the label's translucency remains clamped to the nearest bound.
    */
  var translucencyByDistance: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link VerticalOrigin}.
    */
  var verticalOrigin: js.UndefOr[Property] = js.native
}
object LabelGraphics {
  
  /**
    * Initialization options for the LabelGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the label.
    * @property [text] - A Property specifying the text. Explicit newlines '\n' are supported.
    * @property [font = '30px sans-serif'] - A Property specifying the CSS font.
    * @property [style = LabelStyle.FILL] - A Property specifying the {@link LabelStyle}.
    * @property [scale = 1.0] - A numeric Property specifying the scale to apply to the text.
    * @property [showBackground = false] - A boolean Property specifying the visibility of the background behind the label.
    * @property [backgroundColor = new Color(0.165, 0.165, 0.165, 0.8)] - A Property specifying the background {@link Color}.
    * @property [backgroundPadding = new Cartesian2(7, 5)] - A {@link Cartesian2} Property specifying the horizontal and vertical background padding in pixels.
    * @property [pixelOffset = Cartesian2.ZERO] - A {@link Cartesian2} Property specifying the pixel offset.
    * @property [eyeOffset = Cartesian3.ZERO] - A {@link Cartesian3} Property specifying the eye offset.
    * @property [horizontalOrigin = HorizontalOrigin.CENTER] - A Property specifying the {@link HorizontalOrigin}.
    * @property [verticalOrigin = VerticalOrigin.CENTER] - A Property specifying the {@link VerticalOrigin}.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height is relative to.
    * @property [fillColor = Color.WHITE] - A Property specifying the fill {@link Color}.
    * @property [outlineColor = Color.BLACK] - A Property specifying the outline {@link Color}.
    * @property [outlineWidth = 1.0] - A numeric Property specifying the outline width.
    * @property [translucencyByDistance] - A {@link NearFarScalar} Property used to set translucency based on distance from the camera.
    * @property [pixelOffsetScaleByDistance] - A {@link NearFarScalar} Property used to set pixelOffset based on distance from the camera.
    * @property [scaleByDistance] - A {@link NearFarScalar} Property used to set scale based on distance from the camera.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this label will be displayed.
    * @property [disableDepthTestDistance] - A Property specifying the distance from the camera at which to disable the depth test to.
    */
  trait ConstructorOptions extends StObject {
    
    var backgroundColor: js.UndefOr[Property | Color] = js.undefined
    
    var backgroundPadding: js.UndefOr[Property | Cartesian2] = js.undefined
    
    var disableDepthTestDistance: js.UndefOr[Property | Double] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var eyeOffset: js.UndefOr[Property | Cartesian3] = js.undefined
    
    var fillColor: js.UndefOr[Property | Color] = js.undefined
    
    var font: js.UndefOr[Property | String] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var horizontalOrigin: js.UndefOr[Property | HorizontalOrigin] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var pixelOffset: js.UndefOr[Property | Cartesian2] = js.undefined
    
    var pixelOffsetScaleByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var scale: js.UndefOr[Property | Double] = js.undefined
    
    var scaleByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var showBackground: js.UndefOr[Property | Boolean] = js.undefined
    
    var style: js.UndefOr[Property | LabelStyle] = js.undefined
    
    var text: js.UndefOr[Property | String] = js.undefined
    
    var translucencyByDistance: js.UndefOr[Property | NearFarScalar] = js.undefined
    
    var verticalOrigin: js.UndefOr[Property | VerticalOrigin] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setBackgroundColor(value: Property | Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundPadding(value: Property | Cartesian2): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
      
      inline def setDisableDepthTestDistance(value: Property | Double): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
      
      inline def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setEyeOffset(value: Property | Cartesian3): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
      
      inline def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
      
      inline def setFillColor(value: Property | Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFont(value: Property | String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setHorizontalOrigin(value: Property | HorizontalOrigin): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setPixelOffset(value: Property | Cartesian2): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
      
      inline def setPixelOffsetScaleByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
      
      inline def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
      
      inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
      
      inline def setScale(value: Property | Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
      
      inline def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowBackground(value: Property | Boolean): Self = StObject.set(x, "showBackground", value.asInstanceOf[js.Any])
      
      inline def setShowBackgroundUndefined: Self = StObject.set(x, "showBackground", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStyle(value: Property | LabelStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: Property | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTranslucencyByDistance(value: Property | NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
      
      inline def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
      
      inline def setVerticalOrigin(value: Property | VerticalOrigin): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
      
      inline def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
    }
  }
}
