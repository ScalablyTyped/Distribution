package typings.babylonjs.miscIndexMod

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.colorCurvesMod.ColorCurves
import typings.babylonjs.fresnelParametersMod.FresnelParameters
import typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SerializationHelper")
@js.native
open class SerializationHelper ()
  extends typings.babylonjs.decoratorsMod.SerializationHelper
/* static members */
object SerializationHelper {
  
  @JSImport("babylonjs/Misc/index", "SerializationHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets a boolean to indicate if the UniqueId property should be serialized
    */
  @JSImport("babylonjs/Misc/index", "SerializationHelper.AllowLoadingUniqueId")
  @js.native
  def AllowLoadingUniqueId: Boolean = js.native
  inline def AllowLoadingUniqueId_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowLoadingUniqueId")(x.asInstanceOf[js.Any])
  
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  inline def AppendSerializedAnimations(source: IAnimatable, destination: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendSerializedAnimations")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Clones an object
    * @param creationFunction defines the function used to instanciate the new object
    * @param source defines the source object
    * @returns the cloned object
    */
  inline def Clone[T](creationFunction: js.Function0[T], source: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Instanciates a new object based on a source one (some data will be shared between both object)
    * @param creationFunction defines the function used to instanciate the new object
    * @param source defines the source object
    * @returns the new object
    */
  inline def Instanciate[T](creationFunction: js.Function0[T], source: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Instanciate")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Creates a new entity from a serialization data object
    * @param creationFunction defines a function used to instanciated the new entity
    * @param source defines the source serialization data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url for resources
    * @returns a new entity
    */
  inline def Parse[T](creationFunction: js.Function0[T], source: Any, scene: Nullable[Scene]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def Parse[T](creationFunction: js.Function0[T], source: Any, scene: Nullable[Scene], rootUrl: Nullable[String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Static function used to serialized a specific entity
    * @param entity defines the entity to serialize
    * @param serializationObject defines the optional target object where serialization data will be stored
    * @returns a JSON compatible object representing the serialization of the entity
    */
  inline def Serialize[T](entity: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(entity.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def Serialize[T](entity: T, serializationObject: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(entity.asInstanceOf[js.Any], serializationObject.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @param sourceProperty
    * @hidden
    */
  inline def _ColorCurvesParser(sourceProperty: Any): ColorCurves = ^.asInstanceOf[js.Dynamic].applyDynamic("_ColorCurvesParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[ColorCurves]
  
  /**
    * @param sourceProperty
    * @hidden
    */
  inline def _FresnelParametersParser(sourceProperty: Any): FresnelParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("_FresnelParametersParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[FresnelParameters]
  
  /**
    * @param sourceProperty
    * @hidden
    */
  inline def _ImageProcessingConfigurationParser(sourceProperty: Any): ImageProcessingConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("_ImageProcessingConfigurationParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[ImageProcessingConfiguration]
  
  /**
    * @param sourceProperty
    * @param scene
    * @param rootUrl
    * @hidden
    */
  inline def _TextureParser(sourceProperty: Any, scene: Scene, rootUrl: String): Nullable[BaseTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("_TextureParser")(sourceProperty.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[BaseTexture]]
}
