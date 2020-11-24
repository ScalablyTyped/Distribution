package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConfigurationSetSuppressionOptionsRequest extends js.Object {
  
  /**
    * The name of the configuration set that you want to change the suppression list preferences for.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName = js.native
  
  /**
    * A list that contains the reasons that email addresses are automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.native
}
object PutConfigurationSetSuppressionOptionsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetSuppressionOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetSuppressionOptionsRequest]
  }
  
  @scala.inline
  implicit class PutConfigurationSetSuppressionOptionsRequestOps[Self <: PutConfigurationSetSuppressionOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressedReasonsVarargs(value: SuppressionListReason*): Self = this.set("SuppressedReasons", js.Array(value :_*))
    
    @scala.inline
    def setSuppressedReasons(value: SuppressionListReasons): Self = this.set("SuppressedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressedReasons: Self = this.set("SuppressedReasons", js.undefined)
  }
}
