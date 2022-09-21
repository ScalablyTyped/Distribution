package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  @JSImport("class-validator/types/decorator/string/Matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/Matches", "MATCHES")
  @js.native
  val MATCHES: /* "matches" */ String = js.native
  
  inline def Matches_(pattern: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: String, modifiers: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: String, modifiers: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: js.RegExp): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: js.RegExp, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def matches(value: String, pattern: String, modifiers: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matches(value: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
