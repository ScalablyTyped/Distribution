package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmptyMod {
  
  @JSImport("class-validator/types/decorator/common/IsEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsEmpty", "IS_EMPTY")
  @js.native
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  
  @scala.inline
  def IsEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isEmpty(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
