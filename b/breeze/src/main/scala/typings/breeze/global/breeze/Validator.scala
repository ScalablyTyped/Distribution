package typings.breeze.global.breeze

import typings.breeze.anon.Expression
import typings.breeze.anon.MaxLength
import typings.breeze.anon.MessageTemplate
import typings.breeze.anon.MinLength
import typings.breeze.breeze.ValidatorFunction
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.Validator")
@js.native
class Validator protected ()
  extends StObject
     with typings.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}
/* static members */
object Validator {
  
  @JSGlobal("breeze.Validator")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bool(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[typings.breeze.breeze.Validator]
  
  /** integer between 0 and 255 inclusive */
  @scala.inline
  def byte(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def byte(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  @scala.inline
  def creditCard(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCard")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def creditCard(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCard")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def date(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Validators number, double, and single are all the same */
  @scala.inline
  def double(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("double")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def double(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("double")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Returns a ISO 8601 duration string Validator. */
  @scala.inline
  def duration(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")().asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Returns the email address validator */
  @scala.inline
  def emailAddress(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("emailAddress")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def emailAddress(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("emailAddress")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  @scala.inline
  def fromJSON(json: String): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def guid(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")().asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def int16(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int16")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def int16(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int16")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def int32(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def int32(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def int64(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int64")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def int64(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int64")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Same as int64 */
  @scala.inline
  def integer(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def integer(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Creates a regular expression validator with a fixed expression. */
  @scala.inline
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String): typings.breeze.breeze.Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegExpValidator")(validatorName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], defaultMessage.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String, context: js.Any): typings.breeze.breeze.Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegExpValidator")(validatorName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], defaultMessage.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def maxLength(context: MaxLength): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Map of standard error message templates keyed by validator name.*/
  @JSGlobal("breeze.Validator.messageTemplates")
  @js.native
  def messageTemplates: js.Any = js.native
  @scala.inline
  def messageTemplates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageTemplates")(x.asInstanceOf[js.Any])
  
  /** Always returns true */
  @scala.inline
  def none(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Validators number, double, and single are all the same */
  @scala.inline
  def number(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def number(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  @scala.inline
  def phone(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("phone")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def phone(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("phone")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  @scala.inline
  def register(validator: typings.breeze.breeze.Validator): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(validator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  @scala.inline
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFactory")(fn.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  @scala.inline
  def regularExpression(context: Expression): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("regularExpression")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def required(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def required(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("required")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Validators number, double, and single are all the same */
  @scala.inline
  def single(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def single(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def string(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[typings.breeze.breeze.Validator]
  
  @scala.inline
  def stringLength(context: MinLength): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLength")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
  
  /** Returns the URL (protocol required) validator */
  @scala.inline
  def url(): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[typings.breeze.breeze.Validator]
  @scala.inline
  def url(context: MessageTemplate): typings.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(context.asInstanceOf[js.Any]).asInstanceOf[typings.breeze.breeze.Validator]
}
