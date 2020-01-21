package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommercial extends js.Object {
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

object AnonCommercial {
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
  ): AnonCommercial = {
    val __obj = js.Dynamic.literal(Commercial = Commercial.asInstanceOf[js.Any], CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], Debit = Debit.asInstanceOf[js.Any], DurbinRegulated = DurbinRegulated.asInstanceOf[js.Any], Fraud = Fraud.asInstanceOf[js.Any], Healthcare = Healthcare.asInstanceOf[js.Any], Hiper = Hiper.asInstanceOf[js.Any], HiperCard = HiperCard.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any], No = No.asInstanceOf[js.Any], Payroll = Payroll.asInstanceOf[js.Any], Prepaid = Prepaid.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommercial]
  }
}

