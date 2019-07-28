package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commercial extends js.Object {
  var Commercial: String
  var CountryOfIssuance: String
  var Debit: String
  var DurbinRegulated: String
  var Fraud: String
  var Healthcare: String
  var Hiper: String
  var HiperCard: String
  var IssuingBank: String
  var No: String
  var Payroll: String
  var Prepaid: String
  var Unknown: String
}

object Anon_Commercial {
  @scala.inline
  def apply(
    Commercial: String,
    CountryOfIssuance: String,
    Debit: String,
    DurbinRegulated: String,
    Fraud: String,
    Healthcare: String,
    Hiper: String,
    HiperCard: String,
    IssuingBank: String,
    No: String,
    Payroll: String,
    Prepaid: String,
    Unknown: String
  ): Anon_Commercial = {
    val __obj = js.Dynamic.literal(Commercial = Commercial, CountryOfIssuance = CountryOfIssuance, Debit = Debit, DurbinRegulated = DurbinRegulated, Fraud = Fraud, Healthcare = Healthcare, Hiper = Hiper, HiperCard = HiperCard, IssuingBank = IssuingBank, No = No, Payroll = Payroll, Prepaid = Prepaid, Unknown = Unknown)
  
    __obj.asInstanceOf[Anon_Commercial]
  }
}

