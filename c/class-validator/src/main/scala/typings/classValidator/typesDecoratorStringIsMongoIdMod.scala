package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsMongoIdMod {
  
  @JSImport("class-validator/types/decorator/string/IsMongoId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMongoId", "IS_MONGO_ID")
  @js.native
  val IS_MONGO_ID: /* "isMongoId" */ String = js.native
  
  inline def IsMongoId_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMongoId")().asInstanceOf[PropertyDecorator]
  inline def IsMongoId_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMongoId")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isMongoId(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMongoId")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
