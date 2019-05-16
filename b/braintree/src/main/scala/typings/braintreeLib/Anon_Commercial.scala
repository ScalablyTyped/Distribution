package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commercial extends js.Object {
  var Commercial: java.lang.String
  var CountryOfIssuance: java.lang.String
  var Debit: java.lang.String
  var DurbinRegulated: java.lang.String
  var Fraud: java.lang.String
  var Healthcare: java.lang.String
  var Hiper: java.lang.String
  var HiperCard: java.lang.String
  var IssuingBank: java.lang.String
  var No: java.lang.String
  var Payroll: java.lang.String
  var Prepaid: java.lang.String
  var Unknown: java.lang.String
}

object Anon_Commercial {
  @scala.inline
  def apply(
    Commercial: java.lang.String,
    CountryOfIssuance: java.lang.String,
    Debit: java.lang.String,
    DurbinRegulated: java.lang.String,
    Fraud: java.lang.String,
    Healthcare: java.lang.String,
    Hiper: java.lang.String,
    HiperCard: java.lang.String,
    IssuingBank: java.lang.String,
    No: java.lang.String,
    Payroll: java.lang.String,
    Prepaid: java.lang.String,
    Unknown: java.lang.String
  ): Anon_Commercial = {
    val __obj = js.Dynamic.literal(Commercial = Commercial, CountryOfIssuance = CountryOfIssuance, Debit = Debit, DurbinRegulated = DurbinRegulated, Fraud = Fraud, Healthcare = Healthcare, Hiper = Hiper, HiperCard = HiperCard, IssuingBank = IssuingBank, No = No, Payroll = Payroll, Prepaid = Prepaid, Unknown = Unknown)
  
    __obj.asInstanceOf[Anon_Commercial]
  }
}

