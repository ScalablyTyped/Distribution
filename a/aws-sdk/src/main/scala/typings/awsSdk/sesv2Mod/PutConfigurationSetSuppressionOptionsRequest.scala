package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetSuppressionOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to change the suppression list preferences for.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName
  
  /**
    * A list that contains the reasons that email addresses are automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.undefined
}
object PutConfigurationSetSuppressionOptionsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetSuppressionOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetSuppressionOptionsRequest]
  }
  
  @scala.inline
  implicit class PutConfigurationSetSuppressionOptionsRequestMutableBuilder[Self <: PutConfigurationSetSuppressionOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressedReasons(value: SuppressionListReasons): Self = StObject.set(x, "SuppressedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressedReasonsUndefined: Self = StObject.set(x, "SuppressedReasons", js.undefined)
    
    @scala.inline
    def setSuppressedReasonsVarargs(value: SuppressionListReason*): Self = StObject.set(x, "SuppressedReasons", js.Array(value :_*))
  }
}
