package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReputationOptions extends StObject {
  
  /**
    * The date and time at which the reputation metrics for the configuration set were last reset. Resetting these metrics is known as a fresh start. When you disable email sending for a configuration set using UpdateConfigurationSetSendingEnabled and later re-enable it, the reputation metrics for the configuration set (but not for the entire Amazon SES account) are reset. If email sending for the configuration set has never been disabled and later re-enabled, the value of this attribute is null.
    */
  var LastFreshStart: js.UndefOr[typings.awsSdk.sesMod.LastFreshStart] = js.native
  
  /**
    * Describes whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. If the value is true, reputation metrics are published. If the value is false, reputation metrics are not published. The default value is false.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.native
  
  /**
    * Describes whether email sending is enabled or disabled for the configuration set. If the value is true, then Amazon SES will send emails that use the configuration set. If the value is false, Amazon SES will not send emails that use the configuration set. The default value is true. You can change this setting using UpdateConfigurationSetSendingEnabled.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}
object ReputationOptions {
  
  @scala.inline
  def apply(): ReputationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReputationOptions]
  }
  
  @scala.inline
  implicit class ReputationOptionsMutableBuilder[Self <: ReputationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastFreshStart(value: LastFreshStart): Self = StObject.set(x, "LastFreshStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFreshStartUndefined: Self = StObject.set(x, "LastFreshStart", js.undefined)
    
    @scala.inline
    def setReputationMetricsEnabled(value: Enabled): Self = StObject.set(x, "ReputationMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReputationMetricsEnabledUndefined: Self = StObject.set(x, "ReputationMetricsEnabled", js.undefined)
    
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
