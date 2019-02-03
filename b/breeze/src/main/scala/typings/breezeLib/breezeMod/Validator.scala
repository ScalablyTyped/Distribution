package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Validator")
@js.native
class Validator protected ()
  extends breezeLib.breezeNs.Validator {
  def this(name: java.lang.String, validatorFn: breezeLib.breezeNs.ValidatorFunction) = this()
  def this(name: java.lang.String, validatorFn: breezeLib.breezeNs.ValidatorFunction, context: js.Any) = this()
}

/* static members */
@JSImport("breeze", "Validator")
@js.native
object Validator extends js.Object {
  /** Map of standard error message templates keyed by validator name.*/
  var messageTemplates: js.Any = js.native
  def bool(): breezeLib.breezeNs.Validator = js.native
  /** integer between 0 and 255 inclusive */
  def byte(): breezeLib.breezeNs.Validator = js.native
  def byte(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  def creditCard(): breezeLib.breezeNs.Validator = js.native
  def creditCard(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  def date(): breezeLib.breezeNs.Validator = js.native
  /** Validators number, double, and single are all the same */
  def double(): breezeLib.breezeNs.Validator = js.native
  def double(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Returns a ISO 8601 duration string Validator. */
  def duration(): breezeLib.breezeNs.Validator = js.native
  /** Returns the email address validator */
  def emailAddress(): breezeLib.breezeNs.Validator = js.native
  def emailAddress(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  def fromJSON(json: java.lang.String): breezeLib.breezeNs.Validator = js.native
  def guid(): breezeLib.breezeNs.Validator = js.native
  def int16(): breezeLib.breezeNs.Validator = js.native
  def int16(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  def int32(): breezeLib.breezeNs.Validator = js.native
  def int32(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  def int64(): breezeLib.breezeNs.Validator = js.native
  def int64(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Same as int64 */
  def integer(): breezeLib.breezeNs.Validator = js.native
  def integer(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Creates a regular expression validator with a fixed expression. */
  def makeRegExpValidator(validatorName: java.lang.String, expression: stdLib.RegExp, defaultMessage: java.lang.String): breezeLib.breezeNs.Validator = js.native
  def makeRegExpValidator(
    validatorName: java.lang.String,
    expression: stdLib.RegExp,
    defaultMessage: java.lang.String,
    context: js.Any
  ): breezeLib.breezeNs.Validator = js.native
  def maxLength(context: breezeLib.Anon_MaxLength): breezeLib.breezeNs.Validator = js.native
  /** Always returns true */
  def none(): breezeLib.breezeNs.Validator = js.native
  /** Validators number, double, and single are all the same */
  def number(): breezeLib.breezeNs.Validator = js.native
  def number(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  def phone(): breezeLib.breezeNs.Validator = js.native
  def phone(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Register a validator instance so that any deserialized metadata can reference it. */
  def register(validator: breezeLib.breezeNs.Validator): scala.Unit = js.native
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  def registerFactory(fn: js.Function0[this.type], name: java.lang.String): scala.Unit = js.native
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  def regularExpression(context: breezeLib.Anon_Expression): breezeLib.breezeNs.Validator = js.native
  def required(): breezeLib.breezeNs.Validator = js.native
  def required(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Validators number, double, and single are all the same */
  def single(): breezeLib.breezeNs.Validator = js.native
  def single(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
  def string(): breezeLib.breezeNs.Validator = js.native
  def stringLength(context: breezeLib.Anon_MaxLengthMessageTemplate): breezeLib.breezeNs.Validator = js.native
  /** Returns the URL (protocol required) validator */
  def url(): breezeLib.breezeNs.Validator = js.native
  def url(context: breezeLib.Anon_MessageTemplate): breezeLib.breezeNs.Validator = js.native
}

