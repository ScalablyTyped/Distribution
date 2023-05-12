package typings.babylonjs

import typings.babylonjs.animationsAnimatableDotinterfaceMod.IAnimatable
import typings.babylonjs.materialsColorCurvesMod.ColorCurves
import typings.babylonjs.materialsFresnelParametersMod.FresnelParameters
import typings.babylonjs.materialsImageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.Parameters
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscDecoratorsMod {
  
  @JSImport("babylonjs/Misc/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/decorators", "SerializationHelper")
  @js.native
  open class SerializationHelper () extends StObject
  /* static members */
  object SerializationHelper {
    
    @JSImport("babylonjs/Misc/decorators", "SerializationHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets a boolean to indicate if the UniqueId property should be serialized
      */
    @JSImport("babylonjs/Misc/decorators", "SerializationHelper.AllowLoadingUniqueId")
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
    inline def Clone[T](creationFunction: js.Function0[T], source: T, options: CopySourceOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(creationFunction.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
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
      * Given a source json and a destination object in a scene, this function will parse the source and will try to apply its content to the destination object
      * @param source the source json data
      * @param destination the destination object
      * @param scene the scene where the object is
      * @param rootUrl root url to use to load assets
      */
    inline def ParseProperties(source: Any, destination: Any, scene: Nullable[Scene], rootUrl: Nullable[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseProperties")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Static function used to serialized a specific entity
      * @param entity defines the entity to serialize
      * @param serializationObject defines the optional target object where serialization data will be stored
      * @returns a JSON compatible object representing the serialization of the entity
      */
    inline def Serialize[T](entity: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(entity.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def Serialize[T](entity: T, serializationObject: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(entity.asInstanceOf[js.Any], serializationObject.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * @internal
      */
    inline def _ColorCurvesParser(sourceProperty: Any): ColorCurves = ^.asInstanceOf[js.Dynamic].applyDynamic("_ColorCurvesParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[ColorCurves]
    
    /**
      * @internal
      */
    inline def _FresnelParametersParser(sourceProperty: Any): FresnelParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("_FresnelParametersParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[FresnelParameters]
    
    /**
      * @internal
      */
    inline def _ImageProcessingConfigurationParser(sourceProperty: Any): ImageProcessingConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("_ImageProcessingConfigurationParser")(sourceProperty.asInstanceOf[js.Any]).asInstanceOf[ImageProcessingConfiguration]
    
    /**
      * @internal
      */
    inline def _TextureParser(sourceProperty: Any, scene: Scene, rootUrl: String): Nullable[BaseTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("_TextureParser")(sourceProperty.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[BaseTexture]]
  }
  
  inline def expandToProperty(callback: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandToProperty")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  inline def expandToProperty(callback: String, targetKey: Nullable[String]): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandToProperty")(callback.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
  
  object nativeOverride {
    
    inline def apply[T /* <: js.Function1[/* repeated */ Any, Boolean] */](
      target: Any,
      propertyKey: String,
      descriptor: TypedPropertyDescriptor[js.Function1[/* params */ Parameters[T], Any]]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply[T /* <: js.Function1[/* repeated */ Any, Boolean] */](
      target: Any,
      propertyKey: String,
      descriptor: TypedPropertyDescriptor[js.Function1[/* params */ Parameters[T], Any]],
      predicate: T
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Misc/decorators", "nativeOverride")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/decorators", "nativeOverride.filter")
    @js.native
    def filter: js.Function1[
        /* predicate */ js.Function1[/* params */ Any, Boolean], 
        js.Function3[
          /* target */ Any, 
          /* propertyKey */ String, 
          /* descriptor */ TypedPropertyDescriptor[
            js.Function1[/* params */ Parameters[js.Function1[/* params */ Any, Boolean]], Any]
          ], 
          Unit
        ]
      ] = js.native
    inline def filter_=(
      x: js.Function1[
          /* predicate */ js.Function1[/* params */ Any, Boolean], 
          js.Function3[
            /* target */ Any, 
            /* propertyKey */ String, 
            /* descriptor */ TypedPropertyDescriptor[
              js.Function1[/* params */ Parameters[js.Function1[/* params */ Any, Boolean]], Any]
            ], 
            Unit
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
  }
  
  inline def serialize(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serialize(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsCameraReference(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsCameraReference")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsCameraReference(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsCameraReference")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsColor3(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor3")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsColor3(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor3")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsColor4(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor4")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsColor4(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor4")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsColorCurves(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColorCurves")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsColorCurves(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColorCurves")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsFresnelParameters(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsFresnelParameters")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsFresnelParameters(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsFresnelParameters")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsImageProcessingConfiguration(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsImageProcessingConfiguration")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsImageProcessingConfiguration(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsImageProcessingConfiguration")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsMatrix(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMatrix")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsMatrix(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMatrix")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsMeshReference(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMeshReference")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsMeshReference(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMeshReference")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsQuaternion(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsQuaternion")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsQuaternion(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsQuaternion")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsTexture(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsTexture")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsTexture(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsTexture")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsVector2(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector2")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsVector2(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector2")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  inline def serializeAsVector3(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector3")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  inline def serializeAsVector3(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector3")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
  
  trait CopySourceOptions extends StObject {
    
    var cloneTexturesOnlyOnce: js.UndefOr[Boolean] = js.undefined
  }
  object CopySourceOptions {
    
    inline def apply(): CopySourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopySourceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopySourceOptions] (val x: Self) extends AnyVal {
      
      inline def setCloneTexturesOnlyOnce(value: Boolean): Self = StObject.set(x, "cloneTexturesOnlyOnce", value.asInstanceOf[js.Any])
      
      inline def setCloneTexturesOnlyOnceUndefined: Self = StObject.set(x, "cloneTexturesOnlyOnce", js.undefined)
    }
  }
}
