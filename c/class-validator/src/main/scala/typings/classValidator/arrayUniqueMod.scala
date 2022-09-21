package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayUniqueMod {
  
  @JSImport("class-validator/types/decorator/array/ArrayUnique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/array/ArrayUnique", "ARRAY_UNIQUE")
  @js.native
  val ARRAY_UNIQUE: /* "arrayUnique" */ String = js.native
  
  inline def ArrayUnique_[T](): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")().asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ArrayUniqueIdentifier[T]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ArrayUniqueIdentifier[T], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ValidationOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def arrayUnique(array: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def arrayUnique(array: js.Array[Any], identifier: ArrayUniqueIdentifier[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type ArrayUniqueIdentifier[T] = js.Function1[/* o */ T, Any]
}
