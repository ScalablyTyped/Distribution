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
  
  @scala.inline
  def ArrayUnique_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def ArrayUnique_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def arrayUnique(array: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
