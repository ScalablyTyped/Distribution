package typings.cesium.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cesium.mod.ModelGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ModelGraphics")
@js.native
open class ModelGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets the set of articulation values to apply to this model.  This is represented as an {@link PropertyBag}, where keys are
    * composed as the name of the articulation, a single space, and the name of the stage.
    */
  var articulations: PropertyBag = js.native
  
  /**
    * Gets or sets the boolean Property specifying if glTF animations should hold the last pose for time durations with no keyframes.
    */
  var clampAnimations: js.UndefOr[Property] = js.native
  
  /**
    * A property specifying the {@link ClippingPlaneCollection} used to selectively disable rendering the model.
    */
  var clippingPlanes: js.UndefOr[Property] = js.native
  
  def clone(result: ModelGraphics): ModelGraphics = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} that blends with the model's rendered color.
    */
  var color: js.UndefOr[Property] = js.native
  
  /**
    * A numeric Property specifying the color strength when the <code>colorBlendMode</code> is MIX.
    * A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with
    * any value in-between resulting in a mix of the two.
    */
  var colorBlendAmount: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the enum Property specifying how the color blends with the model.
    */
  var colorBlendMode: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the {@link CustomShader} to apply to this model. When <code>undefined</code>, no custom shader code is used.
    */
  var customShader: js.UndefOr[Property] = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this model will be displayed.
    */
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link HeightReference}.
    */
  var heightReference: js.UndefOr[Property] = js.native
  
  /**
    * A property specifying the {@link Cartesian2} used to scale the diffuse and specular image-based lighting contribution to the final color.
    */
  var imageBasedLightingFactor: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the boolean Property specifying whether textures
    * may continue to stream in after the model is loaded.
    */
  var incrementallyLoadTextures: js.UndefOr[Property] = js.native
  
  /**
    * A property specifying the {@link Cartesian3} light color when shading the model. When <code>undefined</code> the scene's light color is used instead.
    */
  var lightColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the maximum scale
    * size of a model. This property is used as an upper limit for
    * {@link ModelGraphics#minimumPixelSize}.
    */
  var maximumScale: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: ModelGraphics): Unit = js.native
  
  /**
    * Gets or sets the numeric Property specifying the approximate minimum
    * pixel size of the model regardless of zoom. This can be used to ensure that
    * a model is visible even when the viewer zooms out.  When <code>0.0</code>,
    * no minimum size is enforced.
    */
  var minimumPixelSize: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the set of node transformations to apply to this model.  This is represented as an {@link PropertyBag}, where keys are
    * names of nodes, and values are {@link TranslationRotationScale} Properties describing the transformation to apply to that node.
    * The transformation is applied after the node's existing transformation as specified in the glTF, and does not replace the node's existing transformation.
    */
  var nodeTransformations: PropertyBag = js.native
  
  /**
    * Gets or sets the boolean Property specifying if glTF animations should be run.
    */
  var runAnimations: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying a uniform linear scale
    * for this model. Values greater than 1.0 increase the size of the model while
    * values less than 1.0 decrease it.
    */
  var scale: js.UndefOr[Property] = js.native
  
  /**
    * Get or sets the enum Property specifying whether the model
    * casts or receives shadows from light sources.
    */
  var shadows: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the model.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the Property specifying the {@link Color} of the silhouette.
    */
  var silhouetteColor: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the numeric Property specifying the size of the silhouette in pixels.
    */
  var silhouetteSize: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the string Property specifying the URI of the glTF asset.
    */
  var uri: js.UndefOr[Property] = js.native
}
object ModelGraphics {
  
  /**
    * Initialization options for the ModelGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the model.
    * @property [uri] - A string or Resource Property specifying the URI of the glTF asset.
    * @property [scale = 1.0] - A numeric Property specifying a uniform linear scale.
    * @property [minimumPixelSize = 0.0] - A numeric Property specifying the approximate minimum pixel size of the model regardless of zoom.
    * @property [maximumScale] - The maximum scale size of a model. An upper limit for minimumPixelSize.
    * @property [incrementallyLoadTextures = true] - Determine if textures may continue to stream in after the model is loaded.
    * @property [runAnimations = true] - A boolean Property specifying if glTF animations specified in the model should be started.
    * @property [clampAnimations = true] - A boolean Property specifying if glTF animations should hold the last pose for time durations with no keyframes.
    * @property [shadows = ShadowMode.ENABLED] - An enum Property specifying whether the model casts or receives shadows from light sources.
    * @property [heightReference = HeightReference.NONE] - A Property specifying what the height is relative to.
    * @property [silhouetteColor = Color.RED] - A Property specifying the {@link Color} of the silhouette.
    * @property [silhouetteSize = 0.0] - A numeric Property specifying the size of the silhouette in pixels.
    * @property [color = Color.WHITE] - A Property specifying the {@link Color} that blends with the model's rendered color.
    * @property [colorBlendMode = ColorBlendMode.HIGHLIGHT] - An enum Property specifying how the color blends with the model.
    * @property [colorBlendAmount = 0.5] - A numeric Property specifying the color strength when the <code>colorBlendMode</code> is <code>MIX</code>. A value of 0.0 results in the model's rendered color while a value of 1.0 results in a solid color, with any value in-between resulting in a mix of the two.
    * @property [imageBasedLightingFactor = new Cartesian2(1.0, 1.0)] - A property specifying the contribution from diffuse and specular image-based lighting.
    * @property [lightColor] - A property specifying the light color when shading the model. When <code>undefined</code> the scene's light color is used instead.
    * @property [distanceDisplayCondition] - A Property specifying at what distance from the camera that this model will be displayed.
    * @property [nodeTransformations] - An object, where keys are names of nodes, and values are {@link TranslationRotationScale} Properties describing the transformation to apply to that node. The transformation is applied after the node's existing transformation as specified in the glTF, and does not replace the node's existing transformation.
    * @property [articulations] - An object, where keys are composed of an articulation name, a single space, and a stage name, and the values are numeric properties.
    * @property [clippingPlanes] - A property specifying the {@link ClippingPlaneCollection} used to selectively disable rendering the model.
    * @property [customShader] - A property specifying the {@link CustomShader} to apply to this model.
    */
  trait ConstructorOptions extends StObject {
    
    var articulations: js.UndefOr[PropertyBag | StringDictionary[Double]] = js.undefined
    
    var clampAnimations: js.UndefOr[Property | Boolean] = js.undefined
    
    var clippingPlanes: js.UndefOr[Property | ClippingPlaneCollection] = js.undefined
    
    var color: js.UndefOr[Property | Color] = js.undefined
    
    var colorBlendAmount: js.UndefOr[Property | Double] = js.undefined
    
    var colorBlendMode: js.UndefOr[Property | ColorBlendMode] = js.undefined
    
    var customShader: js.UndefOr[Property | CustomShader] = js.undefined
    
    var distanceDisplayCondition: js.UndefOr[Property | DistanceDisplayCondition] = js.undefined
    
    var heightReference: js.UndefOr[Property | HeightReference] = js.undefined
    
    var imageBasedLightingFactor: js.UndefOr[Property | Cartesian2] = js.undefined
    
    var incrementallyLoadTextures: js.UndefOr[Property | Boolean] = js.undefined
    
    var lightColor: js.UndefOr[Property | Color] = js.undefined
    
    var maximumScale: js.UndefOr[Property | Double] = js.undefined
    
    var minimumPixelSize: js.UndefOr[Property | Double] = js.undefined
    
    var nodeTransformations: js.UndefOr[PropertyBag | StringDictionary[TranslationRotationScale]] = js.undefined
    
    var runAnimations: js.UndefOr[Property | Boolean] = js.undefined
    
    var scale: js.UndefOr[Property | Double] = js.undefined
    
    var shadows: js.UndefOr[Property | ShadowMode] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var silhouetteColor: js.UndefOr[Property | Color] = js.undefined
    
    var silhouetteSize: js.UndefOr[Property | Double] = js.undefined
    
    var uri: js.UndefOr[Property | String | Resource] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setArticulations(value: PropertyBag | StringDictionary[Double]): Self = StObject.set(x, "articulations", value.asInstanceOf[js.Any])
      
      inline def setArticulationsUndefined: Self = StObject.set(x, "articulations", js.undefined)
      
      inline def setClampAnimations(value: Property | Boolean): Self = StObject.set(x, "clampAnimations", value.asInstanceOf[js.Any])
      
      inline def setClampAnimationsUndefined: Self = StObject.set(x, "clampAnimations", js.undefined)
      
      inline def setClippingPlanes(value: Property | ClippingPlaneCollection): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
      
      inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
      
      inline def setColor(value: Property | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorBlendAmount(value: Property | Double): Self = StObject.set(x, "colorBlendAmount", value.asInstanceOf[js.Any])
      
      inline def setColorBlendAmountUndefined: Self = StObject.set(x, "colorBlendAmount", js.undefined)
      
      inline def setColorBlendMode(value: Property | ColorBlendMode): Self = StObject.set(x, "colorBlendMode", value.asInstanceOf[js.Any])
      
      inline def setColorBlendModeUndefined: Self = StObject.set(x, "colorBlendMode", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustomShader(value: Property | CustomShader): Self = StObject.set(x, "customShader", value.asInstanceOf[js.Any])
      
      inline def setCustomShaderUndefined: Self = StObject.set(x, "customShader", js.undefined)
      
      inline def setDistanceDisplayCondition(value: Property | DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
      
      inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
      
      inline def setHeightReference(value: Property | HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
      
      inline def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
      
      inline def setImageBasedLightingFactor(value: Property | Cartesian2): Self = StObject.set(x, "imageBasedLightingFactor", value.asInstanceOf[js.Any])
      
      inline def setImageBasedLightingFactorUndefined: Self = StObject.set(x, "imageBasedLightingFactor", js.undefined)
      
      inline def setIncrementallyLoadTextures(value: Property | Boolean): Self = StObject.set(x, "incrementallyLoadTextures", value.asInstanceOf[js.Any])
      
      inline def setIncrementallyLoadTexturesUndefined: Self = StObject.set(x, "incrementallyLoadTextures", js.undefined)
      
      inline def setLightColor(value: Property | Color): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
      
      inline def setMaximumScale(value: Property | Double): Self = StObject.set(x, "maximumScale", value.asInstanceOf[js.Any])
      
      inline def setMaximumScaleUndefined: Self = StObject.set(x, "maximumScale", js.undefined)
      
      inline def setMinimumPixelSize(value: Property | Double): Self = StObject.set(x, "minimumPixelSize", value.asInstanceOf[js.Any])
      
      inline def setMinimumPixelSizeUndefined: Self = StObject.set(x, "minimumPixelSize", js.undefined)
      
      inline def setNodeTransformations(value: PropertyBag | StringDictionary[TranslationRotationScale]): Self = StObject.set(x, "nodeTransformations", value.asInstanceOf[js.Any])
      
      inline def setNodeTransformationsUndefined: Self = StObject.set(x, "nodeTransformations", js.undefined)
      
      inline def setRunAnimations(value: Property | Boolean): Self = StObject.set(x, "runAnimations", value.asInstanceOf[js.Any])
      
      inline def setRunAnimationsUndefined: Self = StObject.set(x, "runAnimations", js.undefined)
      
      inline def setScale(value: Property | Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSilhouetteColor(value: Property | Color): Self = StObject.set(x, "silhouetteColor", value.asInstanceOf[js.Any])
      
      inline def setSilhouetteColorUndefined: Self = StObject.set(x, "silhouetteColor", js.undefined)
      
      inline def setSilhouetteSize(value: Property | Double): Self = StObject.set(x, "silhouetteSize", value.asInstanceOf[js.Any])
      
      inline def setSilhouetteSizeUndefined: Self = StObject.set(x, "silhouetteSize", js.undefined)
      
      inline def setUri(value: Property | String | Resource): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
