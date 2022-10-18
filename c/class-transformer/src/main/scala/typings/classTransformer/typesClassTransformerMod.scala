package typings.classTransformer

import typings.classTransformer.typesInterfacesClassConstructorDottypeMod.ClassConstructor
import typings.classTransformer.typesInterfacesClassTransformerOptionsDotinterfaceMod.ClassTransformOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClassTransformerMod {
  
  @JSImport("class-transformer/types/ClassTransformer", "ClassTransformer")
  @js.native
  open class ClassTransformer () extends StObject {
    
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
      * Converts class (constructor) object to plain (literal) object.
      * Uses given plain object as source object (it means fills given plain object with data from class object).
      * Also works with arrays.
      */
    def classToPlainFromExist[T /* <: Record[String, Any] */, P](`object`: T, plainObject: P): T = js.native
    def classToPlainFromExist[T /* <: Record[String, Any] */, P](`object`: T, plainObject: P, options: ClassTransformOptions): T = js.native
    def classToPlainFromExist[T /* <: Record[String, Any] */, P](`object`: T, plainObjects: js.Array[P]): js.Array[T] = js.native
    def classToPlainFromExist[T /* <: Record[String, Any] */, P](`object`: T, plainObjects: js.Array[P], options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Deserializes given JSON string to a object of the given class.
      */
    def deserialize[T](cls: ClassConstructor[T], json: String): T = js.native
    def deserialize[T](cls: ClassConstructor[T], json: String, options: ClassTransformOptions): T = js.native
    
    /**
      * Deserializes given JSON string to an array of objects of the given class.
      */
    def deserializeArray[T](cls: ClassConstructor[T], json: String): js.Array[T] = js.native
    def deserializeArray[T](cls: ClassConstructor[T], json: String, options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Converts class (constructor) object to new class (constructor) object. Also works with arrays.
      */
    def instanceToInstance[T](`object`: T): T = js.native
    def instanceToInstance[T](`object`: T, options: ClassTransformOptions): T = js.native
    def instanceToInstance[T](`object`: js.Array[T]): js.Array[T] = js.native
    def instanceToInstance[T](`object`: js.Array[T], options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Converts class (constructor) object to plain (literal) object. Also works with arrays.
      */
    def instanceToPlain[T /* <: Record[String, Any] */](`object`: T): Record[String, Any] = js.native
    def instanceToPlain[T /* <: Record[String, Any] */](`object`: T, options: ClassTransformOptions): Record[String, Any] = js.native
    def instanceToPlain[T /* <: Record[String, Any] */](`object`: js.Array[T]): js.Array[Record[String, Any]] = js.native
    def instanceToPlain[T /* <: Record[String, Any] */](`object`: js.Array[T], options: ClassTransformOptions): js.Array[Record[String, Any]] = js.native
    
    /**
      * Converts plain (literal) object to class (constructor) object.
      * Uses given object as source object (it means fills given object with data from plain object).
      * Also works with arrays.
      */
    def plainToClassFromExist[T /* <: Record[String, Any] */, V /* <: js.Array[Any] */](clsObject: T, plain: V): T = js.native
    def plainToClassFromExist[T /* <: Record[String, Any] */, V /* <: js.Array[Any] */](clsObject: T, plain: V, options: ClassTransformOptions): T = js.native
    @JSName("plainToClassFromExist")
    def plainToClassFromExist_TV_Array[T /* <: Record[String, Any] */, V](clsObject: T, plain: V): js.Array[T] = js.native
    @JSName("plainToClassFromExist")
    def plainToClassFromExist_TV_Array[T /* <: Record[String, Any] */, V](clsObject: T, plain: V, options: ClassTransformOptions): js.Array[T] = js.native
    
    def plainToInstance[T /* <: Record[String, Any] */, V](cls: ClassConstructor[T], plain: V): T = js.native
    def plainToInstance[T /* <: Record[String, Any] */, V](cls: ClassConstructor[T], plain: V, options: ClassTransformOptions): T = js.native
    /**
      * Converts plain (literal) object to class (constructor) object. Also works with arrays.
      */
    @JSName("plainToInstance")
    def plainToInstance_TV_Array[T /* <: Record[String, Any] */, V /* <: js.Array[Any] */](cls: ClassConstructor[T], plain: V): js.Array[T] = js.native
    @JSName("plainToInstance")
    def plainToInstance_TV_Array[T /* <: Record[String, Any] */, V /* <: js.Array[Any] */](cls: ClassConstructor[T], plain: V, options: ClassTransformOptions): js.Array[T] = js.native
    
    /**
      * Serializes given object to a JSON string.
      */
    def serialize[T](`object`: T): String = js.native
    def serialize[T](`object`: T, options: ClassTransformOptions): String = js.native
    def serialize[T](`object`: js.Array[T]): String = js.native
    def serialize[T](`object`: js.Array[T], options: ClassTransformOptions): String = js.native
  }
}
