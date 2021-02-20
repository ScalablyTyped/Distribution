package typings.breeze.global.breeze

import typings.breeze.anon.Expression
import typings.breeze.anon.MaxLength
import typings.breeze.anon.MessageTemplate
import typings.breeze.anon.MinLength
import typings.breeze.breeze.ValidatorFunction
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.Validator")
@js.native
class Validator protected ()
  extends typings.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}
/* static members */
object Validator {
  
  @JSGlobal("breeze.Validator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.Validator.bool")
  @js.native
  def bool(): typings.breeze.breeze.Validator = js.native
  
  /** integer between 0 and 255 inclusive */
  @JSGlobal("breeze.Validator.byte")
  @js.native
  def byte(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.byte")
  @js.native
  def byte(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  @JSGlobal("breeze.Validator.creditCard")
  @js.native
  def creditCard(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.creditCard")
  @js.native
  def creditCard(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.date")
  @js.native
  def date(): typings.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSGlobal("breeze.Validator.double")
  @js.native
  def double(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.double")
  @js.native
  def double(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Returns a ISO 8601 duration string Validator. */
  @JSGlobal("breeze.Validator.duration")
  @js.native
  def duration(): typings.breeze.breeze.Validator = js.native
  
  /** Returns the email address validator */
  @JSGlobal("breeze.Validator.emailAddress")
  @js.native
  def emailAddress(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.emailAddress")
  @js.native
  def emailAddress(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  @JSGlobal("breeze.Validator.fromJSON")
  @js.native
  def fromJSON(json: String): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.guid")
  @js.native
  def guid(): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.int16")
  @js.native
  def int16(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.int16")
  @js.native
  def int16(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.int32")
  @js.native
  def int32(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.int32")
  @js.native
  def int32(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.int64")
  @js.native
  def int64(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.int64")
  @js.native
  def int64(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Same as int64 */
  @JSGlobal("breeze.Validator.integer")
  @js.native
  def integer(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.integer")
  @js.native
  def integer(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Creates a regular expression validator with a fixed expression. */
  @JSGlobal("breeze.Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String, context: js.Any): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.maxLength")
  @js.native
  def maxLength(context: MaxLength): typings.breeze.breeze.Validator = js.native
  
  /** Map of standard error message templates keyed by validator name.*/
  @JSGlobal("breeze.Validator.messageTemplates")
  @js.native
  def messageTemplates: js.Any = js.native
  @scala.inline
  def messageTemplates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageTemplates")(x.asInstanceOf[js.Any])
  
  /** Always returns true */
  @JSGlobal("breeze.Validator.none")
  @js.native
  def none(): typings.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSGlobal("breeze.Validator.number")
  @js.native
  def number(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.number")
  @js.native
  def number(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  @JSGlobal("breeze.Validator.phone")
  @js.native
  def phone(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.phone")
  @js.native
  def phone(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  @JSGlobal("breeze.Validator.register")
  @js.native
  def register(validator: typings.breeze.breeze.Validator): Unit = js.native
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  @JSGlobal("breeze.Validator.registerFactory")
  @js.native
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  @JSGlobal("breeze.Validator.regularExpression")
  @js.native
  def regularExpression(context: Expression): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.required")
  @js.native
  def required(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.required")
  @js.native
  def required(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSGlobal("breeze.Validator.single")
  @js.native
  def single(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.single")
  @js.native
  def single(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.string")
  @js.native
  def string(): typings.breeze.breeze.Validator = js.native
  
  @JSGlobal("breeze.Validator.stringLength")
  @js.native
  def stringLength(context: MinLength): typings.breeze.breeze.Validator = js.native
  
  /** Returns the URL (protocol required) validator */
  @JSGlobal("breeze.Validator.url")
  @js.native
  def url(): typings.breeze.breeze.Validator = js.native
  @JSGlobal("breeze.Validator.url")
  @js.native
  def url(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
}
