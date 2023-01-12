package typings.cesium.mod

import typings.cesium.mod.CylinderGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CylinderGraphics")
@js.native
open class CylinderGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the numeric Property specifying the radius of the bottom of the cylinder.
    */
  var bottomRadius: js.UndefOr[Property] = js.native
  
  def clone(result: CylinderGraphics): CylinderGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this cylinder will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the cylinder is filled with the provided material.
    */
  var fill: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the length of the cylinder.
    */
  var length: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the material used to fill the cylinder.
    */
  var material: js.UndefOr[MaterialProperty] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: CylinderGraphics): Unit = js.native
  
  /**
    * Gets or sets the Property specifying the number of vertical lines to draw along the perimeter for the outline.
    */
  var numberOfVerticalLines: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying whether the cylinder is outlined.
    */
  var outline: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} of the outline.
    */
  var outlineColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the width of the outline.
    * <p>
    * Note: This property will be ignored on all major browsers on Windows platforms. For details, see (@link https://github.com/CesiumGS/cesium/issues/40}.
    * </p>
    */
  var outlineWidth: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the cylinder
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the cylinder.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the number of edges around the perimeter of the cylinder.
    */
  var slices: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the radius of the top of the cylinder.
    */
  var topRadius: js.UndefOr[Property] = js.native
}
object CylinderGraphics {
  
  /**
    * Initialization options for the CylinderGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the cylinder.
    * @property [length] - A numeric Property specifying the length of the cylinder.
    * @property [topRadius] - A numeric Property specifying the radius of the top of the cylinder.
    * @property [bottomRadius] - A numeric Property specifying the radius of the bottom of the cylinder.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height from the entity position is relative to.
    * @property [fill = true] - A boolean Property specifying whether the cylinder is filled with the provided material.
    * @property [material = Color.WHITE] - A Property specifying the material used to fill the cylinder.
    * @property [outline = false] - A boolean Property specifying whether the cylinder is outlined.
    * @property [outlineColor = Color.BLACK] - A Property specifying the {@link Color} of the outline.
    * @property [outlineWidth = 1.0] - A numeric Property specifying the width of the outline.
    * @property [numberOfVerticalLines = 16] - A numeric Property specifying the number of vertical lines to draw along the perimeter for the outline.
    * @property [slices = 128] - The number of edges around the perimeter of the cylinder.
    * @property [shadows = ShadowMode.DISABLED] - An enum Property specifying whether the cylinder casts or receives shadows from light sources.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this cylinder will be displayed.
    */
  trait ConstructorOptions extends StObject {
    
    var bottomRadius: js.UndefOr[Property | Double] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var fill: js.UndefOr[Property | Boolean] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var length: js.UndefOr[Property | Double] = js.undefined
    
    var material: js.UndefOr[MaterialProperty | Color] = js.undefined
    
    var numberOfVerticalLines: js.UndefOr[Property | Double] = js.undefined
    
    var outline: js.UndefOr[Property | Boolean] = js.undefined
    
    var outlineColor: js.UndefOr[Property | Color] = js.undefined
    
    var outlineWidth: js.UndefOr[Property | Double] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var slices: js.UndefOr[Property | Double] = js.undefined
    
    var topRadius: js.UndefOr[Property | Double] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setBottomRadius(value: Property | Double): Self = StObject.set(x, "bottomRadius", value.asInstanceOf[js.Any])
      
      inline def setBottomRadiusUndefined: Self = StObject.set(x, "bottomRadius", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setFill(value: Property | Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setLength(value: Property | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaterial(value: MaterialProperty | Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setNumberOfVerticalLines(value: Property | Double): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
      
      inline def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
      
      inline def setOutline(value: Property | Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: Property | Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: Property | Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSlices(value: Property | Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
      
      inline def setTopRadius(value: Property | Double): Self = StObject.set(x, "topRadius", value.asInstanceOf[js.Any])
      
      inline def setTopRadiusUndefined: Self = StObject.set(x, "topRadius", js.undefined)
    }
  }
}
