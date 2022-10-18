package typings.consumerDataStandards.bankingMod

import typings.consumerDataStandards.anon.ExtensionUType
import typings.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typings.consumerDataStandards.consumerDataStandardsStrings.FEE
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_CHARGED
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.PENDING
import typings.consumerDataStandards.consumerDataStandardsStrings.POSTED
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANSFER_INCOMING
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANSFER_OUTGOING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingTransactionDetail
  extends StObject
     with BankingTransaction {
  
  var extendedData: ExtensionUType
}
object BankingTransactionDetail {
  
  inline def apply(
    accountId: String,
    amount: String,
    description: String,
    extendedData: ExtensionUType,
    isDetailAvailable: Boolean,
    reference: String,
    status: PENDING | POSTED,
    `type`: DIRECT_DEBIT | FEE | INTEREST_CHARGED | INTEREST_PAID | OTHER | PAYMENT | TRANSFER_INCOMING | TRANSFER_OUTGOING
  ): BankingTransactionDetail = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], isDetailAvailable = isDetailAvailable.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingTransactionDetail]
  }
  
  extension [Self <: BankingTransactionDetail](x: Self) {
    
    inline def setExtendedData(value: ExtensionUType): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
  }
}
