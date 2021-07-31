package typings.classTransformer

import typings.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typings.classTransformer.classTransformerMod.ClassType
import typings.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import typings.classTransformer.exposeExcludeOptionsMod.ExposeOptions
import typings.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeHelpOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeOptions
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
  class ClassTransformer ()
    extends typings.classTransformer.classTransformerMod.ClassTransformer
  
  @scala.inline
  def Exclude(): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")().asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  @scala.inline
  def Exclude(options: ExcludeOptions): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  
  @scala.inline
  def Expose(): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")().asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  @scala.inline
  def Expose(options: ExposeOptions): js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Expose")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* object */ (Record[String, js.Any]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ]]
  
  @scala.inline
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ typings.classTransformer.transformationTypeEnumMod.TransformationType, 
      js.Any
    ]
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ typings.classTransformer.transformationTypeEnumMod.TransformationType, 
      js.Any
    ],
    options: TransformOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(transformFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  
  @scala.inline
  def TransformClassToClass(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToClass")().asInstanceOf[js.Function]
  @scala.inline
  def TransformClassToClass(params: ClassTransformOptions): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToClass")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def TransformClassToPlain(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToPlain")().asInstanceOf[js.Function]
  @scala.inline
  def TransformClassToPlain(params: ClassTransformOptions): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformClassToPlain")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def TransformPlainToClass(classType: js.Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToClass")(classType.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def TransformPlainToClass(classType: js.Any, params: ClassTransformOptions): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformPlainToClass")(classType.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @js.native
  sealed trait TransformationType extends StObject
  @JSImport("class-transformer", "TransformationType")
  @js.native
  object TransformationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransformationType & Double] = js.native
    
    @js.native
    sealed trait CLASS_TO_CLASS
      extends StObject
         with TransformationType
    /* 2 */ val CLASS_TO_CLASS: typings.classTransformer.mod.TransformationType.CLASS_TO_CLASS & Double = js.native
    
    @js.native
    sealed trait CLASS_TO_PLAIN
      extends StObject
         with TransformationType
    /* 1 */ val CLASS_TO_PLAIN: typings.classTransformer.mod.TransformationType.CLASS_TO_PLAIN & Double = js.native
    
    @js.native
    sealed trait PLAIN_TO_CLASS
      extends StObject
         with TransformationType
    /* 0 */ val PLAIN_TO_CLASS: typings.classTransformer.mod.TransformationType.PLAIN_TO_CLASS & Double = js.native
  }
  
  @scala.inline
  def Type(): js.Function2[/* target */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")().asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): js.Function2[/* target */ js.Any, /* key */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  @scala.inline
  def Type(typeFunction: Unit, options: TypeOptions): js.Function2[/* target */ js.Any, /* key */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(typeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ js.Any, /* key */ String, Unit]]
  
  @scala.inline
  def classToClass[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("classToClass")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def classToClass[T](`object`: T, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClass")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def classToClass[T](`object`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("classToClass")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def classToClass[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClass")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def classToClassFromExist[T](`object`: T, fromObject: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObject.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def classToClassFromExist[T](`object`: T, fromObject: T, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObjects.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToClassFromExist")(`object`.asInstanceOf[js.Any], fromObjects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def classToPlain[T](`object`: T): Record[String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Any]]
  @scala.inline
  def classToPlain[T](`object`: T, options: ClassTransformOptions): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  @scala.inline
  def classToPlain[T](`object`: js.Array[T]): js.Array[Record[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, js.Any]]]
  @scala.inline
  def classToPlain[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlain")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, js.Any]]]
  
  @scala.inline
  def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, js.Any]]): js.Array[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObjects.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, js.Any]]]
  @scala.inline
  def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, js.Any]], options: ClassTransformOptions): js.Array[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObjects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, js.Any]]]
  @scala.inline
  def classToPlainFromExist[T](`object`: T, plainObject: Record[String, js.Any]): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObject.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  @scala.inline
  def classToPlainFromExist[T](`object`: T, plainObject: Record[String, js.Any], options: ClassTransformOptions): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("classToPlainFromExist")(`object`.asInstanceOf[js.Any], plainObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  
  @scala.inline
  def deserialize[T](cls: ClassType[T], json: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def deserialize[T](cls: ClassType[T], json: String, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def deserializeArray[T](cls: ClassType[T], json: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeArray")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def deserializeArray[T](cls: ClassType[T], json: String, options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeArray")(cls.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def plainToClass[T, V](cls: ClassType[T], plain: V): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def plainToClass[T, V](cls: ClassType[T], plain: V, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def plainToClass[T, V](cls: ClassType[T], plain: js.Array[V]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def plainToClass[T, V](cls: ClassType[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClass")(cls.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def plainToClassFromExist[T, V](clsObject: T, plain: V): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def plainToClassFromExist[T, V](clsObject: T, plain: V, options: ClassTransformOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("plainToClassFromExist")(clsObject.asInstanceOf[js.Any], plain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def serialize[T](`object`: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def serialize[T](`object`: T, options: ClassTransformOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def serialize[T](`object`: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def serialize[T](`object`: js.Array[T], options: ClassTransformOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
