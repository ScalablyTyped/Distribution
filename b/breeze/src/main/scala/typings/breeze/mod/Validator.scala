package typings.breeze.mod

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

@JSImport("breeze", "Validator")
@js.native
class Validator protected ()
  extends typings.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}
/* static members */
object Validator {
  
  @JSImport("breeze", "Validator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "Validator.bool")
  @js.native
  def bool(): typings.breeze.breeze.Validator = js.native
  
  /** integer between 0 and 255 inclusive */
  @JSImport("breeze", "Validator.byte")
  @js.native
  def byte(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.byte")
  @js.native
  def byte(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  @JSImport("breeze", "Validator.creditCard")
  @js.native
  def creditCard(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.creditCard")
  @js.native
  def creditCard(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.date")
  @js.native
  def date(): typings.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSImport("breeze", "Validator.double")
  @js.native
  def double(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.double")
  @js.native
  def double(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Returns a ISO 8601 duration string Validator. */
  @JSImport("breeze", "Validator.duration")
  @js.native
  def duration(): typings.breeze.breeze.Validator = js.native
  
  /** Returns the email address validator */
  @JSImport("breeze", "Validator.emailAddress")
  @js.native
  def emailAddress(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.emailAddress")
  @js.native
  def emailAddress(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  @JSImport("breeze", "Validator.fromJSON")
  @js.native
  def fromJSON(json: String): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.guid")
  @js.native
  def guid(): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.int16")
  @js.native
  def int16(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.int16")
  @js.native
  def int16(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.int32")
  @js.native
  def int32(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.int32")
  @js.native
  def int32(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.int64")
  @js.native
  def int64(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.int64")
  @js.native
  def int64(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Same as int64 */
  @JSImport("breeze", "Validator.integer")
  @js.native
  def integer(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.integer")
  @js.native
  def integer(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Creates a regular expression validator with a fixed expression. */
  @JSImport("breeze", "Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.makeRegExpValidator")
  @js.native
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String, context: js.Any): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.maxLength")
  @js.native
  def maxLength(context: MaxLength): typings.breeze.breeze.Validator = js.native
  
  /** Map of standard error message templates keyed by validator name.*/
  @JSImport("breeze", "Validator.messageTemplates")
  @js.native
  def messageTemplates: js.Any = js.native
  @scala.inline
  def messageTemplates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageTemplates")(x.asInstanceOf[js.Any])
  
  /** Always returns true */
  @JSImport("breeze", "Validator.none")
  @js.native
  def none(): typings.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSImport("breeze", "Validator.number")
  @js.native
  def number(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.number")
  @js.native
  def number(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  @JSImport("breeze", "Validator.phone")
  @js.native
  def phone(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.phone")
  @js.native
  def phone(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  @JSImport("breeze", "Validator.register")
  @js.native
  def register(validator: typings.breeze.breeze.Validator): Unit = js.native
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  @JSImport("breeze", "Validator.registerFactory")
  @js.native
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  @JSImport("breeze", "Validator.regularExpression")
  @js.native
  def regularExpression(context: Expression): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.required")
  @js.native
  def required(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.required")
  @js.native
  def required(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  /** Validators number, double, and single are all the same */
  @JSImport("breeze", "Validator.single")
  @js.native
  def single(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.single")
  @js.native
  def single(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.string")
  @js.native
  def string(): typings.breeze.breeze.Validator = js.native
  
  @JSImport("breeze", "Validator.stringLength")
  @js.native
  def stringLength(context: MinLength): typings.breeze.breeze.Validator = js.native
  
  /** Returns the URL (protocol required) validator */
  @JSImport("breeze", "Validator.url")
  @js.native
  def url(): typings.breeze.breeze.Validator = js.native
  @JSImport("breeze", "Validator.url")
  @js.native
  def url(context: MessageTemplate): typings.breeze.breeze.Validator = js.native
}
