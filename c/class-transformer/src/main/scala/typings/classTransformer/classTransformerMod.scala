package typings.classTransformer

import org.scalablytyped.runtime.Instantiable1
import typings.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classTransformerMod {
  
  @JSImport("class-transformer/ClassTransformer", "ClassTransformer")
  @js.native
  class ClassTransformer () extends StObject {
    
    /**
      * Converts class (constructor) object to new class (constructor) object. Also works with arrays.
      */
    def classToClass[T](`object`: T): T = js.native
    def classToClass[T](`object`: T, options: ClassTransformOptions): T = js.native
    def classToClass[T](`object`: js.Array[T]): js.Array[T] = js.native
    def classToClass[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Converts class (constructor) object to plain (literal) object.
      * Uses given plain object as source object (it means fills given plain object with data from class object).
      * Also works with arrays.
      */
    def classToClassFromExist[T](`object`: T, fromObject: T): T = js.native
    def classToClassFromExist[T](`object`: T, fromObject: T, options: ClassTransformOptions): T = js.native
    def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T]): js.Array[T] = js.native
    def classToClassFromExist[T](`object`: T, fromObjects: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Converts class (constructor) object to plain (literal) object. Also works with arrays.
      */
    def classToPlain[T /* <: Record[String, _] */](`object`: T): Record[String, _] = js.native
    def classToPlain[T /* <: Record[String, _] */](`object`: T, options: ClassTransformOptions): Record[String, _] = js.native
    def classToPlain[T /* <: Record[String, _] */](`object`: js.Array[T]): js.Array[Record[String, _]] = js.native
    def classToPlain[T /* <: Record[String, _] */](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, _]] = js.native
    
    /**
      * Converts class (constructor) object to plain (literal) object.
      * Uses given plain object as source object (it means fills given plain object with data from class object).
      * Also works with arrays.
      */
    def classToPlainFromExist[T /* <: Record[String, _] */, P](`object`: T, plainObject: P): T = js.native
    def classToPlainFromExist[T /* <: Record[String, _] */, P](`object`: T, plainObject: P, options: ClassTransformOptions): T = js.native
    def classToPlainFromExist[T /* <: Record[String, _] */, P](`object`: T, plainObjects: js.Array[P]): js.Array[T] = js.native
    def classToPlainFromExist[T /* <: Record[String, _] */, P](`object`: T, plainObjects: js.Array[P], options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Deserializes given JSON string to a object of the given class.
      */
    def deserialize[T](cls: ClassType[T], json: String): T = js.native
    def deserialize[T](cls: ClassType[T], json: String, options: ClassTransformOptions): T = js.native
    
    /**
      * Deserializes given JSON string to an array of objects of the given class.
      */
    def deserializeArray[T](cls: ClassType[T], json: String): js.Array[T] = js.native
    def deserializeArray[T](cls: ClassType[T], json: String, options: ClassTransformOptions): js.Array[T] = js.native
    
    def plainToClass[T /* <: Record[String, _] */, V](cls: ClassType[T], plain: V): T = js.native
    def plainToClass[T /* <: Record[String, _] */, V](cls: ClassType[T], plain: V, options: ClassTransformOptions): T = js.native
    
    def plainToClassFromExist[T /* <: Record[String, _] */, V](clsObject: T, plain: V): js.Array[T] = js.native
    def plainToClassFromExist[T /* <: Record[String, _] */, V](clsObject: T, plain: V, options: ClassTransformOptions): js.Array[T] = js.native
    /**
      * Converts plain (literal) object to class (constructor) object.
      * Uses given object as source object (it means fills given object with data from plain object).
      * Also works with arrays.
      */
    @JSName("plainToClassFromExist")
    def plainToClassFromExist_T_RecordStringWildcardV_ArrayWildcard_T[T /* <: Record[String, _] */, V /* <: js.Array[_] */](clsObject: T, plain: V): T = js.native
    @JSName("plainToClassFromExist")
    def plainToClassFromExist_T_RecordStringWildcardV_ArrayWildcard_T[T /* <: Record[String, _] */, V /* <: js.Array[_] */](clsObject: T, plain: V, options: ClassTransformOptions): T = js.native
    
    /**
      * Converts plain (literal) object to class (constructor) object. Also works with arrays.
      */
    @JSName("plainToClass")
    def plainToClass_T_RecordStringWildcardV_ArrayWildcard_Array[T /* <: Record[String, _] */, V /* <: js.Array[_] */](cls: ClassType[T], plain: V): js.Array[T] = js.native
    @JSName("plainToClass")
    def plainToClass_T_RecordStringWildcardV_ArrayWildcard_Array[T /* <: Record[String, _] */, V /* <: js.Array[_] */](cls: ClassType[T], plain: V, options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Serializes given object to a JSON string.
      */
    def serialize[T](`object`: T): String = js.native
    def serialize[T](`object`: T, options: ClassTransformOptions): String = js.native
    def serialize[T](`object`: js.Array[T]): String = js.native
    def serialize[T](`object`: js.Array[T], options: ClassTransformOptions): String = js.native
  }
  
  @js.native
  trait ClassType[T]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
}
