package typings.classTransformer

import org.scalablytyped.runtime.TopLevel
import typings.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typings.classTransformer.classTransformerMod.ClassType
import typings.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import typings.classTransformer.exposeExcludeOptionsMod.ExposeOptions
import typings.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeHelpOptions
import typings.classTransformer.exposeExcludeOptionsMod.TypeOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Exclude(): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  def Exclude(options: ExcludeOptions): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  
  def Expose(): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  def Expose(options: ExposeOptions): js.Function2[
    /* object */ (Record[String, _]) | js.Function, 
    /* propertyName */ js.UndefOr[String], 
    Unit
  ] = js.native
  
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ typings.classTransformer.transformationTypeEnumMod.TransformationType, 
      _
    ]
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Transform(
    transformFn: js.Function3[
      /* value */ js.Any, 
      /* obj */ js.Any, 
      /* transformationType */ typings.classTransformer.transformationTypeEnumMod.TransformationType, 
      _
    ],
    options: TransformOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  
  def TransformClassToClass(): js.Function = js.native
  def TransformClassToClass(params: ClassTransformOptions): js.Function = js.native
  
  def TransformClassToPlain(): js.Function = js.native
  def TransformClassToPlain(params: ClassTransformOptions): js.Function = js.native
  
  def TransformPlainToClass(classType: js.Any): js.Function = js.native
  def TransformPlainToClass(classType: js.Any, params: ClassTransformOptions): js.Function = js.native
  
  def Type(): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(typeFunction: js.UndefOr[scala.Nothing], options: TypeOptions): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  
  def classToClass[T](`object`: T): T = js.native
  def classToClass[T](`object`: T, options: ClassTransformOptions): T = js.native
  def classToClass[T](`object`: js.Array[T]): js.Array[T] = js.native
  def classToClass[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
  
  def classToClassFromExist[T](`object`: T, fromObject: T): T = js.native
  def classToClassFromExist[T](`object`: T, fromObject: T, options: ClassTransformOptions): T = js.native
  def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T]): js.Array[T] = js.native
  def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
  
  def classToPlain[T](`object`: T): Record[String, _] = js.native
  def classToPlain[T](`object`: T, options: ClassTransformOptions): Record[String, _] = js.native
  def classToPlain[T](`object`: js.Array[T]): js.Array[Record[String, _]] = js.native
  def classToPlain[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, _]] = js.native
  
  def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, _]]): js.Array[Record[String, _]] = js.native
  def classToPlainFromExist[T](`object`: T, plainObjects: js.Array[Record[String, _]], options: ClassTransformOptions): js.Array[Record[String, _]] = js.native
  def classToPlainFromExist[T](`object`: T, plainObject: Record[String, _]): Record[String, _] = js.native
  def classToPlainFromExist[T](`object`: T, plainObject: Record[String, _], options: ClassTransformOptions): Record[String, _] = js.native
  
  def deserialize[T](cls: ClassType[T], json: String): T = js.native
  def deserialize[T](cls: ClassType[T], json: String, options: ClassTransformOptions): T = js.native
  
  def deserializeArray[T](cls: ClassType[T], json: String): js.Array[T] = js.native
  def deserializeArray[T](cls: ClassType[T], json: String, options: ClassTransformOptions): js.Array[T] = js.native
  
  def plainToClass[T, V](cls: ClassType[T], plain: V): T = js.native
  def plainToClass[T, V](cls: ClassType[T], plain: V, options: ClassTransformOptions): T = js.native
  def plainToClass[T, V](cls: ClassType[T], plain: js.Array[V]): js.Array[T] = js.native
  def plainToClass[T, V](cls: ClassType[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = js.native
  
  def plainToClassFromExist[T, V](clsObject: T, plain: V): T = js.native
  def plainToClassFromExist[T, V](clsObject: T, plain: V, options: ClassTransformOptions): T = js.native
  def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V]): js.Array[T] = js.native
  def plainToClassFromExist[T, V](clsObject: js.Array[T], plain: js.Array[V], options: ClassTransformOptions): js.Array[T] = js.native
  
  def serialize[T](`object`: T): String = js.native
  def serialize[T](`object`: T, options: ClassTransformOptions): String = js.native
  def serialize[T](`object`: js.Array[T]): String = js.native
  def serialize[T](`object`: js.Array[T], options: ClassTransformOptions): String = js.native
  
  @js.native
  class ClassTransformer ()
    extends typings.classTransformer.classTransformerMod.ClassTransformer
  
  @js.native
  sealed trait TransformationType extends js.Object
  @js.native
  object TransformationType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransformationType with Double] = js.native
    
    @js.native
    sealed trait CLASS_TO_CLASS extends TransformationType
    /* 2 */ @js.native
    object CLASS_TO_CLASS extends TopLevel[CLASS_TO_CLASS with Double]
    
    @js.native
    sealed trait CLASS_TO_PLAIN extends TransformationType
    /* 1 */ @js.native
    object CLASS_TO_PLAIN extends TopLevel[CLASS_TO_PLAIN with Double]
    
    @js.native
    sealed trait PLAIN_TO_CLASS extends TransformationType
    /* 0 */ @js.native
    object PLAIN_TO_CLASS extends TopLevel[PLAIN_TO_CLASS with Double]
  }
}
