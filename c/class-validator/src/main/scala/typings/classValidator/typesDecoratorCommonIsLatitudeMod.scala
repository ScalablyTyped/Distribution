package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonIsLatitudeMod {
  
  @JSImport("class-validator/types/decorator/common/IsLatitude", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsLatitude", "IS_LATITUDE")
  @js.native
  val IS_LATITUDE: /* "isLatitude" */ String = js.native
  
  inline def IsLatitude_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatitude")().asInstanceOf[PropertyDecorator]
  inline def IsLatitude_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatitude")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isLatitude(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLatitude")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
