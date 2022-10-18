package typings.classTransformer

import typings.classTransformer.typesInterfacesClassConstructorDottypeMod.ClassConstructor
import typings.classTransformer.typesInterfacesClassTransformerOptionsDotinterfaceMod.ClassTransformOptions
import typings.classTransformer.typesInterfacesDecoratorOptionsExcludeOptionsDotinterfaceMod.ExcludeOptions
import typings.classTransformer.typesInterfacesDecoratorOptionsExposeOptionsDotinterfaceMod.ExposeOptions
import typings.classTransformer.typesInterfacesDecoratorOptionsTransformOptionsDotinterfaceMod.TransformOptions
import typings.classTransformer.typesInterfacesDecoratorOptionsTypeOptionsDotinterfaceMod.TypeOptions
import typings.classTransformer.typesInterfacesMetadataTransformFnParamsDotinterfaceMod.TransformFnParams
import typings.classTransformer.typesInterfacesTypeHelpOptionsDotinterfaceMod.TypeHelpOptions
import typings.std.ClassDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("class-transformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-transformer", "ClassTransformer")
  @js.native
  open class ClassTransformer ()
    extends typings.classTransformer.typesClassTransformerMod.ClassTransformer
  
  inline def Exclude(): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")().asInstanceOf[PropertyDecorator & ClassDecorator]
  inline def Exclude(options: ExcludeOptions): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & ClassDecorator]
  
  inline def Expose(): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")().asInstanceOf[PropertyDecorator & ClassDecorator]
  inline def Expose(options: ExposeOptions): PropertyDecorator & ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & ClassDecorator]
  
  inline def Transform(transformFn: js.Function1[/* params */ TransformFnParams, Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Transform(transformFn: js.Function1[/* params */ TransformFnParams, Any], options: TransformOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def TransformInstanceToInstance(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToInstance")().asInstanceOf[MethodDecorator]
  inline def TransformInstanceToInstance(params: ClassTransformOptions): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToInstance")(params.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  
  inline def TransformInstanceToPlain(): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToPlain")().asInstanceOf[MethodDecorator]
  inline def TransformInstanceToPlain(params: ClassTransformOptions): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformInstanceToPlain")(params.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  
  inline def TransformPlainToInstance(classType: ClassConstructor[Any]): MethodDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToInstance")(classType.asInstanceOf[js.Any]).asInstanceOf[MethodDecorator]
  inline def TransformPlainToInstance(classType: ClassConstructor[Any], params: ClassTransformOptions): MethodDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToInstance")(classType.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[MethodDecorator]
  
  @JSImport("class-transformer", "TransformationType")
  @js.native
  object TransformationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType & Double
      ] = js.native
    
    /* 2 */ val CLASS_TO_CLASS: typings.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType.CLASS_TO_CLASS & Double = js.native
    
    /* 1 */ val CLASS_TO_PLAIN: typings.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType.CLASS_TO_PLAIN & Double = js.native
    
    /* 0 */ val PLAIN_TO_CLASS: typings.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType.PLAIN_TO_CLASS & Double = js.native
  }
  
  inline def Type(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")().asInstanceOf[PropertyDecorator]
  inline def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Type(typeFunction: Unit, options: TypeOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def classToClassFromExist[T](`object`: T, fromObject: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObject.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def classToClassFromExist[T](`object`: T, fromObject: T, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObjects.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObjects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def classToPlain[T](`object`: T): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def classToPlain[T](`object`: T, options: ClassTransformOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def classToPlain[T](`object`: js.Array[T]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  inline def classToPlain[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, Any]]): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObjects.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, Any]], options: ClassTransformOptions): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObjects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def classToPlainFromExist[T](`object`: T, plainObject: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObject.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def classToPlainFromExist[T](`object`: T, plainObject: Record[String, Any], options: ClassTransformOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def deserialize[T](cls: ClassConstructor[T], json: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def deserialize[T](cls: ClassConstructor[T], json: String, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def deserializeArray[T](cls: ClassConstructor[T], json: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeArray")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def deserializeArray[T](cls: ClassConstructor[T], json: String, options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeArray")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def instanceToInstance[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceToInstance")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def instanceToInstance[T](`object`: T, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("instanceToInstance")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def instanceToInstance[T](`object`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceToInstance")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def instanceToInstance[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("instanceToInstance")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def instanceToPlain[T](`object`: T): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceToPlain")(`object`.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def instanceToPlain[T](`object`: T, options: ClassTransformOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("instanceToPlain")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def instanceToPlain[T](`object`: js.Array[T]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceToPlain")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  inline def instanceToPlain[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("instanceToPlain")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def plainToClass[T, V](cls: ClassConstructor[T], plain: V): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def plainToClass[T, V](cls: ClassConstructor[T], plain: V, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def plainToClass[T, V](cls: ClassConstructor[T], plain: js.Array[V]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def plainToClass[T, V](cls: ClassConstructor[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def plainToClassFromExist[T, V](clsObject: T, plain: V): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def plainToClassFromExist[T, V](clsObject: T, plain: V, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def plainToInstance[T, V](cls: ClassConstructor[T], plain: V): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToInstance")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def plainToInstance[T, V](cls: ClassConstructor[T], plain: V, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToInstance")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def plainToInstance[T, V](cls: ClassConstructor[T], plain: js.Array[V]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToInstance")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def plainToInstance[T, V](cls: ClassConstructor[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToInstance")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def serialize[T](`object`: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize[T](`object`: T, options: ClassTransformOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serialize[T](`object`: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize[T](`object`: js.Array[T], options: ClassTransformOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
