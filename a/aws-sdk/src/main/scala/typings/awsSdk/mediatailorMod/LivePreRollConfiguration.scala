package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LivePreRollConfiguration extends js.Object {
  
  /**
    * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25,000 characters.
    */
  var AdDecisionServerUrl: js.UndefOr[string] = js.native
  
  /**
    * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to exceed this duration, regardless of the total duration of ads that the ADS returns.
    */
  var MaxDurationSeconds: js.UndefOr[integer] = js.native
}
object LivePreRollConfiguration {
  
  @scala.inline
  def apply(): LivePreRollConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivePreRollConfiguration]
  }
  
  @scala.inline
  implicit class LivePreRollConfigurationOps[Self <: LivePreRollConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdDecisionServerUrl(value: string): Self = this.set("AdDecisionServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdDecisionServerUrl: Self = this.set("AdDecisionServerUrl", js.undefined)
    
    @scala.inline
    def setMaxDurationSeconds(value: integer): Self = this.set("MaxDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDurationSeconds: Self = this.set("MaxDurationSeconds", js.undefined)
  }
}
