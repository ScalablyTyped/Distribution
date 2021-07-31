package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUppercaseMod {
  
  @JSImport("class-validator/types/decorator/string/IsUppercase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUppercase", "IS_UPPERCASE")
  @js.native
  val IS_UPPERCASE: /* "isUppercase" */ String = js.native
  
  @scala.inline
  def IsUppercase_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUppercase")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsUppercase_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUppercase")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isUppercase(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUppercase")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
