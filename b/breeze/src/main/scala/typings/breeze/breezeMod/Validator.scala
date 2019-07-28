package typings.breeze.breezeMod

import typings.breeze.Anon_Expression
import typings.breeze.Anon_MaxLength
import typings.breeze.Anon_MaxLengthMessageTemplate
import typings.breeze.Anon_MessageTemplate
import typings.breeze.breezeNs.ValidatorFunction
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Validator")
@js.native
class Validator protected ()
  extends typings.breeze.breezeNs.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}

/* static members */
@JSImport("breeze", "Validator")
@js.native
object Validator extends js.Object {
  /** Map of standard error message templates keyed by validator name.*/
  var messageTemplates: js.Any = js.native
  def bool(): typings.breeze.breezeNs.Validator = js.native
  /** integer between 0 and 255 inclusive */
  def byte(): typings.breeze.breezeNs.Validator = js.native
  def byte(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  def creditCard(): typings.breeze.breezeNs.Validator = js.native
  def creditCard(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  def date(): typings.breeze.breezeNs.Validator = js.native
  /** Validators number, double, and single are all the same */
  def double(): typings.breeze.breezeNs.Validator = js.native
  def double(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Returns a ISO 8601 duration string Validator. */
  def duration(): typings.breeze.breezeNs.Validator = js.native
  /** Returns the email address validator */
  def emailAddress(): typings.breeze.breezeNs.Validator = js.native
  def emailAddress(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  def fromJSON(json: String): typings.breeze.breezeNs.Validator = js.native
  def guid(): typings.breeze.breezeNs.Validator = js.native
  def int16(): typings.breeze.breezeNs.Validator = js.native
  def int16(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  def int32(): typings.breeze.breezeNs.Validator = js.native
  def int32(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  def int64(): typings.breeze.breezeNs.Validator = js.native
  def int64(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Same as int64 */
  def integer(): typings.breeze.breezeNs.Validator = js.native
  def integer(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Creates a regular expression validator with a fixed expression. */
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String): typings.breeze.breezeNs.Validator = js.native
  def makeRegExpValidator(validatorName: String, expression: RegExp, defaultMessage: String, context: js.Any): typings.breeze.breezeNs.Validator = js.native
  def maxLength(context: Anon_MaxLength): typings.breeze.breezeNs.Validator = js.native
  /** Always returns true */
  def none(): typings.breeze.breezeNs.Validator = js.native
  /** Validators number, double, and single are all the same */
  def number(): typings.breeze.breezeNs.Validator = js.native
  def number(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  def phone(): typings.breeze.breezeNs.Validator = js.native
  def phone(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Register a validator instance so that any deserialized metadata can reference it. */
  def register(validator: typings.breeze.breezeNs.Validator): Unit = js.native
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  def regularExpression(context: Anon_Expression): typings.breeze.breezeNs.Validator = js.native
  def required(): typings.breeze.breezeNs.Validator = js.native
  def required(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Validators number, double, and single are all the same */
  def single(): typings.breeze.breezeNs.Validator = js.native
  def single(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
  def string(): typings.breeze.breezeNs.Validator = js.native
  def stringLength(context: Anon_MaxLengthMessageTemplate): typings.breeze.breezeNs.Validator = js.native
  /** Returns the URL (protocol required) validator */
  def url(): typings.breeze.breezeNs.Validator = js.native
  def url(context: Anon_MessageTemplate): typings.breeze.breezeNs.Validator = js.native
}

