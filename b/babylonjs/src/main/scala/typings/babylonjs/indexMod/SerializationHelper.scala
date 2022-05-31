package typings.babylonjs.indexMod

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SerializationHelper")
@js.native
class SerializationHelper ()
  extends typings.babylonjs.miscIndexMod.SerializationHelper
/* static members */
object SerializationHelper {
  
  @JSImport("babylonjs/index", "SerializationHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  inline def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendSerializedAnimations")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    rootUrl: Nullable[String]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Static function used to serialized a specific entity
    * @param entity defines the entity to serialize
    * @param serializationObject defines the optional target obecjt where serialization data will be stored
    * @returns a JSON compatible object representing the serialization of the entity
    */
  inline def Serialize[T](entity: T): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(entity.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def Serialize[T](entity: T, serializationObject: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(entity.asInstanceOf[js.Any], serializationObject.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** @hidden */
  inline def _ColorCurvesParser(sourceProperty: js.Any): typings.babylonjs.colorCurvesMod.ColorCurves = ^.asInstanceOf[js.Dynamic].applyDynamic("_ColorCurvesParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.colorCurvesMod.ColorCurves]
  
  /** @hidden */
  inline def _FresnelParametersParser(sourceProperty: js.Any): typings.babylonjs.fresnelParametersMod.FresnelParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("_FresnelParametersParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.fresnelParametersMod.FresnelParameters]
  
  /** @hidden */
  inline def _ImageProcessingConfigurationParser(sourceProperty: js.Any): typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("_ImageProcessingConfigurationParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration]
  
  /** @hidden */
  inline def _TextureParser(sourceProperty: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.baseTextureMod.BaseTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("_TextureParser")(sourceProperty.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.baseTextureMod.BaseTexture]]
}
