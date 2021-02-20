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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "SerializationHelper")
@js.native
class SerializationHelper ()
  extends typings.babylonjs.decoratorsMod.SerializationHelper
/* static members */
object SerializationHelper {
  
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  @JSImport("babylonjs/Misc/index", "SerializationHelper.AppendSerializedAnimations")
  @js.native
  def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): Unit = js.native
  
  /**
    * Clones an object
    * @param creationFunction defines the function used to instanciate the new object
    * @param source defines the source object
    * @returns the cloned object
    */
  @JSImport("babylonjs/Misc/index", "SerializationHelper.Clone")
  @js.native
  def Clone[T](creationFunction: js.Function0[T], source: T): T = js.native
  
  /**
    * Instanciates a new object based on a source one (some data will be shared between both object)
    * @param creationFunction defines the function used to instanciate the new object
    * @param source defines the source object
    * @returns the new object
    */
  @JSImport("babylonjs/Misc/index", "SerializationHelper.Instanciate")
  @js.native
  def Instanciate[T](creationFunction: js.Function0[T], source: T): T = js.native
  
  /**
    * Creates a new entity from a serialization data object
    * @param creationFunction defines a function used to instanciated the new entity
    * @param source defines the source serialization data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url for resources
    * @returns a new entity
    */
  @JSImport("babylonjs/Misc/index", "SerializationHelper.Parse")
  @js.native
  def Parse[T](creationFunction: js.Function0[T], source: js.Any, scene: Nullable[Scene]): T = js.native
  @JSImport("babylonjs/Misc/index", "SerializationHelper.Parse")
  @js.native
  def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: Nullable[Scene],
    rootUrl: Nullable[String]
  ): T = js.native
  
  /**
    * Static function used to serialized a specific entity
    * @param entity defines the entity to serialize
    * @param serializationObject defines the optional target obecjt where serialization data will be stored
    * @returns a JSON compatible object representing the serialization of the entity
    */
  @JSImport("babylonjs/Misc/index", "SerializationHelper.Serialize")
  @js.native
  def Serialize[T](entity: T): js.Any = js.native
  @JSImport("babylonjs/Misc/index", "SerializationHelper.Serialize")
  @js.native
  def Serialize[T](entity: T, serializationObject: js.Any): js.Any = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Misc/index", "SerializationHelper._ColorCurvesParser")
  @js.native
  def _ColorCurvesParser(sourceProperty: js.Any): ColorCurves = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Misc/index", "SerializationHelper._FresnelParametersParser")
  @js.native
  def _FresnelParametersParser(sourceProperty: js.Any): FresnelParameters = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Misc/index", "SerializationHelper._ImageProcessingConfigurationParser")
  @js.native
  def _ImageProcessingConfigurationParser(sourceProperty: js.Any): ImageProcessingConfiguration = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Misc/index", "SerializationHelper._TextureParser")
  @js.native
  def _TextureParser(sourceProperty: js.Any, scene: Scene, rootUrl: String): Nullable[BaseTexture] = js.native
}
