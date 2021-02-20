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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("class-transformer", "ClassTransformer")
  @js.native
  class ClassTransformer ()
    extends typings.classTransformer.classTransformerMod.ClassTransformer
  
  @JSImport("class-transformer", "Exclude")
  @js.native
  def Exclude(): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  @JSImport("class-transformer", "Exclude")
  @js.native
  def Exclude(options: ExcludeOptions): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  
  @JSImport("class-transformer", "Expose")
  @js.native
  def Expose(): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  @JSImport("class-transformer", "Expose")
  @js.native
  def Expose(options: ExposeOptions): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  
  @JSImport("class-transformer", "Transform")
  @js.native
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ typings.classTransformer.transformationTypeEnumMod.TransformationType, 
      _
    ]
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  @JSImport("class-transformer", "Transform")
  @js.native
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ typings.classTransformer.transformationTypeEnumMod.TransformationType, 
      _
    ],
    options: TransformOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  
  @JSImport("class-transformer", "TransformClassToClass")
  @js.native
  def TransformClassToClass(): js.Function = js.native
  @JSImport("class-transformer", "TransformClassToClass")
  @js.native
  def TransformClassToClass(params: ClassTransformOptions): js.Function = js.native
  
  @JSImport("class-transformer", "TransformClassToPlain")
  @js.native
  def TransformClassToPlain(): js.Function = js.native
  @JSImport("class-transformer", "TransformClassToPlain")
  @js.native
  def TransformClassToPlain(params: ClassTransformOptions): js.Function = js.native
  
  @JSImport("class-transformer", "TransformPlainToClass")
  @js.native
  def TransformPlainToClass(classType: js.Any): js.Function = js.native
  @JSImport("class-transformer", "TransformPlainToClass")
  @js.native
  def TransformPlainToClass(classType: js.Any, params: ClassTransformOptions): js.Function = js.native
  
  @js.native
  sealed trait TransformationType extends StObject
  @JSImport("class-transformer", "TransformationType")
  @js.native
  object TransformationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransformationType with Double] = js.native
    
    @js.native
    sealed trait CLASS_TO_CLASS extends TransformationType
    /* 2 */ val CLASS_TO_CLASS: typings.classTransformer.mod.TransformationType.CLASS_TO_CLASS with Double = js.native
    
    @js.native
    sealed trait CLASS_TO_PLAIN extends TransformationType
    /* 1 */ val CLASS_TO_PLAIN: typings.classTransformer.mod.TransformationType.CLASS_TO_PLAIN with Double = js.native
    
    @js.native
    sealed trait PLAIN_TO_CLASS extends TransformationType
    /* 0 */ val PLAIN_TO_CLASS: typings.classTransformer.mod.TransformationType.PLAIN_TO_CLASS with Double = js.native
  }
  
  @JSImport("class-transformer", "Type")
  @js.native
  def Type(): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  @JSImport("class-transformer", "Type")
  @js.native
  def Type(typeFunction: js.UndefOr[scala.Nothing], options: TypeOptions): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  @JSImport("class-transformer", "Type")
  @js.native
  def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  @JSImport("class-transformer", "Type")
  @js.native
  def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  
  @JSImport("class-transformer", "classToClass")
  @js.native
  def classToClass[T](`object`: T): T = js.native
  @JSImport("class-transformer", "classToClass")
  @js.native
  def classToClass[T](`object`: T, options: ClassTransformOptions): T = js.native
  @JSImport("class-transformer", "classToClass")
  @js.native
  def classToClass[T](`object`: js.Array[T]): js.Array[T] = js.native
  @JSImport("class-transformer", "classToClass")
  @js.native
  def classToClass[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
  
  @JSImport("class-transformer", "classToClassFromExist")
  @js.native
  def classToClassFromExist[T](`object`: T, fromObject: T): T = js.native
  @JSImport("class-transformer", "classToClassFromExist")
  @js.native
  def classToClassFromExist[T](`object`: T, fromObject: T, options: ClassTransformOptions): T = js.native
  @JSImport("class-transformer", "classToClassFromExist")
  @js.native
  def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T]): js.Array[T] = js.native
  @JSImport("class-transformer", "classToClassFromExist")
  @js.native
  def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
  
  @JSImport("class-transformer", "classToPlain")
  @js.native
  def classToPlain[T](`object`: T): Record[String, _] = js.native
  @JSImport("class-transformer", "classToPlain")
  @js.native
  def classToPlain[T](`object`: T, options: ClassTransformOptions): Record[String, _] = js.native
  @JSImport("class-transformer", "classToPlain")
  @js.native
  def classToPlain[T](`object`: js.Array[T]): js.Array[Record[String, _]] = js.native
  @JSImport("class-transformer", "classToPlain")
  @js.native
  def classToPlain[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, _]] = js.native
  
  @JSImport("class-transformer", "classToPlainFromExist")
  @js.native
  def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, _]]): js.Array[Record[String, _]] = js.native
  @JSImport("class-transformer", "classToPlainFromExist")
  @js.native
  def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, _]], options: ClassTransformOptions): js.Array[Record[String, _]] = js.native
  @JSImport("class-transformer", "classToPlainFromExist")
  @js.native
  def classToPlainFromExist[T](`object`: T, plainObject: Record[String, _]): Record[String, _] = js.native
  @JSImport("class-transformer", "classToPlainFromExist")
  @js.native
  def classToPlainFromExist[T](`object`: T, plainObject: Record[String, _], options: ClassTransformOptions): Record[String, _] = js.native
  
  @JSImport("class-transformer", "deserialize")
  @js.native
  def deserialize[T](cls: ClassType[T], json: String): T = js.native
  @JSImport("class-transformer", "deserialize")
  @js.native
  def deserialize[T](cls: ClassType[T], json: String, options: ClassTransformOptions): T = js.native
  
  @JSImport("class-transformer", "deserializeArray")
  @js.native
  def deserializeArray[T](cls: ClassType[T], json: String): js.Array[T] = js.native
  @JSImport("class-transformer", "deserializeArray")
  @js.native
  def deserializeArray[T](cls: ClassType[T], json: String, options: ClassTransformOptions): js.Array[T] = js.native
  
  @JSImport("class-transformer", "plainToClass")
  @js.native
  def plainToClass[T, V](cls: ClassType[T], plain: V): T = js.native
  @JSImport("class-transformer", "plainToClass")
  @js.native
  def plainToClass[T, V](cls: ClassType[T], plain: V, options: ClassTransformOptions): T = js.native
  @JSImport("class-transformer", "plainToClass")
  @js.native
  def plainToClass[T, V](cls: ClassType[T], plain: js.Array[V]): js.Array[T] = js.native
  @JSImport("class-transformer", "plainToClass")
  @js.native
  def plainToClass[T, V](cls: ClassType[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = js.native
  
  @JSImport("class-transformer", "plainToClassFromExist")
  @js.native
  def plainToClassFromExist[T, V](clsObject: T, plain: V): T = js.native
  @JSImport("class-transformer", "plainToClassFromExist")
  @js.native
  def plainToClassFromExist[T, V](clsObject: T, plain: V, options: ClassTransformOptions): T = js.native
  @JSImport("class-transformer", "plainToClassFromExist")
  @js.native
  def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V]): js.Array[T] = js.native
  @JSImport("class-transformer", "plainToClassFromExist")
  @js.native
  def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = js.native
  
  @JSImport("class-transformer", "serialize")
  @js.native
  def serialize[T](`object`: T): String = js.native
  @JSImport("class-transformer", "serialize")
  @js.native
  def serialize[T](`object`: T, options: ClassTransformOptions): String = js.native
  @JSImport("class-transformer", "serialize")
  @js.native
  def serialize[T](`object`: js.Array[T]): String = js.native
  @JSImport("class-transformer", "serialize")
  @js.native
  def serialize[T](`object`: js.Array[T], options: ClassTransformOptions): String = js.native
}
