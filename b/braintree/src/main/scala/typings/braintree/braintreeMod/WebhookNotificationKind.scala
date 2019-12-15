package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.account_updater_daily_report
  - typings.braintree.braintreeStrings.check
  - typings.braintree.braintreeStrings.connected_merchant_paypal_status_changed
  - typings.braintree.braintreeStrings.connected_merchant_status_transitioned
  - typings.braintree.braintreeStrings.disbursement
  - typings.braintree.braintreeStrings.disbursement_exception
  - typings.braintree.braintreeStrings.dispute_opened
  - typings.braintree.braintreeStrings.dispute_lost
  - typings.braintree.braintreeStrings.dispute_won
  - typings.braintree.braintreeStrings.grantor_updated_granted_payment_method
  - typings.braintree.braintreeStrings.granted_payment_method_revoked
  - typings.braintree.braintreeStrings.local_payment_completed
  - typings.braintree.braintreeStrings.partner_merchant_connected
  - typings.braintree.braintreeStrings.partner_merchant_disconnected
  - typings.braintree.braintreeStrings.partner_merchant_declined
  - typings.braintree.braintreeStrings.payment_method_revoked_by_customer
  - typings.braintree.braintreeStrings.oauth_access_revoked
  - typings.braintree.braintreeStrings.recipient_updated_granted_payment_method
  - typings.braintree.braintreeStrings.subscription_canceled
  - typings.braintree.braintreeStrings.subscription_charged_successfully
  - typings.braintree.braintreeStrings.subscription_charged_unsuccessfully
  - typings.braintree.braintreeStrings.subscription_expired
  - typings.braintree.braintreeStrings.subscription_trial_ended
  - typings.braintree.braintreeStrings.subscription_went_active
  - typings.braintree.braintreeStrings.subscription_went_past_due
  - typings.braintree.braintreeStrings.sub_merchant_account_approved
  - typings.braintree.braintreeStrings.sub_merchant_account_declined
  - typings.braintree.braintreeStrings.transaction_disbursed
  - typings.braintree.braintreeStrings.transaction_settled
  - typings.braintree.braintreeStrings.transaction_settlement_declined
*/
trait WebhookNotificationKind extends js.Object

object WebhookNotificationKind {
  @scala.inline
  def account_updater_daily_report: typings.braintree.braintreeStrings.account_updater_daily_report = this.cast("account_updater_daily_report")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def check: typings.braintree.braintreeStrings.check = this.cast("check")
  @scala.inline
  def connected_merchant_paypal_status_changed: typings.braintree.braintreeStrings.connected_merchant_paypal_status_changed = this.cast("connected_merchant_paypal_status_changed")
  @scala.inline
  def connected_merchant_status_transitioned: typings.braintree.braintreeStrings.connected_merchant_status_transitioned = this.cast("connected_merchant_status_transitioned")
  @scala.inline
  def disbursement: typings.braintree.braintreeStrings.disbursement = this.cast("disbursement")
  @scala.inline
  def disbursement_exception: typings.braintree.braintreeStrings.disbursement_exception = this.cast("disbursement_exception")
  @scala.inline
  def dispute_lost: typings.braintree.braintreeStrings.dispute_lost = this.cast("dispute_lost")
  @scala.inline
  def dispute_opened: typings.braintree.braintreeStrings.dispute_opened = this.cast("dispute_opened")
  @scala.inline
  def dispute_won: typings.braintree.braintreeStrings.dispute_won = this.cast("dispute_won")
  @scala.inline
  def granted_payment_method_revoked: typings.braintree.braintreeStrings.granted_payment_method_revoked = this.cast("granted_payment_method_revoked")
  @scala.inline
  def grantor_updated_granted_payment_method: typings.braintree.braintreeStrings.grantor_updated_granted_payment_method = this.cast("grantor_updated_granted_payment_method")
  @scala.inline
  def local_payment_completed: typings.braintree.braintreeStrings.local_payment_completed = this.cast("local_payment_completed")
  @scala.inline
  def oauth_access_revoked: typings.braintree.braintreeStrings.oauth_access_revoked = this.cast("oauth_access_revoked")
  @scala.inline
  def partner_merchant_connected: typings.braintree.braintreeStrings.partner_merchant_connected = this.cast("partner_merchant_connected")
  @scala.inline
  def partner_merchant_declined: typings.braintree.braintreeStrings.partner_merchant_declined = this.cast("partner_merchant_declined")
  @scala.inline
  def partner_merchant_disconnected: typings.braintree.braintreeStrings.partner_merchant_disconnected = this.cast("partner_merchant_disconnected")
  @scala.inline
  def payment_method_revoked_by_customer: typings.braintree.braintreeStrings.payment_method_revoked_by_customer = this.cast("payment_method_revoked_by_customer")
  @scala.inline
  def recipient_updated_granted_payment_method: typings.braintree.braintreeStrings.recipient_updated_granted_payment_method = this.cast("recipient_updated_granted_payment_method")
  @scala.inline
  def sub_merchant_account_approved: typings.braintree.braintreeStrings.sub_merchant_account_approved = this.cast("sub_merchant_account_approved")
  @scala.inline
  def sub_merchant_account_declined: typings.braintree.braintreeStrings.sub_merchant_account_declined = this.cast("sub_merchant_account_declined")
  @scala.inline
  def subscription_canceled: typings.braintree.braintreeStrings.subscription_canceled = this.cast("subscription_canceled")
  @scala.inline
  def subscription_charged_successfully: typings.braintree.braintreeStrings.subscription_charged_successfully = this.cast("subscription_charged_successfully")
  @scala.inline
  def subscription_charged_unsuccessfully: typings.braintree.braintreeStrings.subscription_charged_unsuccessfully = this.cast("subscription_charged_unsuccessfully")
  @scala.inline
  def subscription_expired: typings.braintree.braintreeStrings.subscription_expired = this.cast("subscription_expired")
  @scala.inline
  def subscription_trial_ended: typings.braintree.braintreeStrings.subscription_trial_ended = this.cast("subscription_trial_ended")
  @scala.inline
  def subscription_went_active: typings.braintree.braintreeStrings.subscription_went_active = this.cast("subscription_went_active")
  @scala.inline
  def subscription_went_past_due: typings.braintree.braintreeStrings.subscription_went_past_due = this.cast("subscription_went_past_due")
  @scala.inline
  def transaction_disbursed: typings.braintree.braintreeStrings.transaction_disbursed = this.cast("transaction_disbursed")
  @scala.inline
  def transaction_settled: typings.braintree.braintreeStrings.transaction_settled = this.cast("transaction_settled")
  @scala.inline
  def transaction_settlement_declined: typings.braintree.braintreeStrings.transaction_settlement_declined = this.cast("transaction_settlement_declined")
}

