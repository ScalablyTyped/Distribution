package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/Matches", JSImport.Namespace)
@js.native
object matchesMod extends js.Object {
  
  val MATCHES: /* "matches" */ String = js.native
  
  @JSName("Matches")
  def Matches_(pattern: String): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: String): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: RegExp): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: RegExp, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def matches(value: String, pattern: String, modifiers: String): Boolean = js.native
  def matches(value: String, pattern: RegExp): Boolean = js.native
}
