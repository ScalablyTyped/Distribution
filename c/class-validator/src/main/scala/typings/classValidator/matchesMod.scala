package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchesMod {
  
  @JSImport("class-validator/types/decorator/string/Matches", "MATCHES")
  @js.native
  val MATCHES: /* "matches" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/Matches", "Matches")
  @js.native
  def Matches_(pattern: String): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Matches", "Matches")
  @js.native
  def Matches_(pattern: String, modifiers: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Matches", "Matches")
  @js.native
  def Matches_(pattern: String, modifiers: String): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Matches", "Matches")
  @js.native
  def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Matches", "Matches")
  @js.native
  def Matches_(pattern: RegExp): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/Matches", "Matches")
  @js.native
  def Matches_(pattern: RegExp, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/Matches", "matches")
  @js.native
  def matches(value: String, pattern: String, modifiers: String): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/Matches", "matches")
  @js.native
  def matches(value: String, pattern: RegExp): Boolean = js.native
}
