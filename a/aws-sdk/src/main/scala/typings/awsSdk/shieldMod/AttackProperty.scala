package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttackProperty extends js.Object {
  
  /**
    * The type of distributed denial of service (DDoS) event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
    */
  var AttackLayer: js.UndefOr[typings.awsSdk.shieldMod.AttackLayer] = js.native
  
  /**
    * Defines the DDoS attack property information that is provided. The WORDPRESS_PINGBACK_REFLECTOR and WORDPRESS_PINGBACK_SOURCE values are valid only for WordPress reflective pingback DDoS attacks.
    */
  var AttackPropertyIdentifier: js.UndefOr[typings.awsSdk.shieldMod.AttackPropertyIdentifier] = js.native
  
  /**
    * The array of contributor objects that includes the top five contributors to an attack. 
    */
  var TopContributors: js.UndefOr[typings.awsSdk.shieldMod.TopContributors] = js.native
  
  /**
    * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
    */
  var Total: js.UndefOr[Long] = js.native
  
  /**
    * The unit of the Value of the contributions.
    */
  var Unit: js.UndefOr[typings.awsSdk.shieldMod.Unit] = js.native
}
object AttackProperty {
  
  @scala.inline
  def apply(): AttackProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackProperty]
  }
  
  @scala.inline
  implicit class AttackPropertyOps[Self <: AttackProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttackLayer(value: AttackLayer): Self = this.set("AttackLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackLayer: Self = this.set("AttackLayer", js.undefined)
    
    @scala.inline
    def setAttackPropertyIdentifier(value: AttackPropertyIdentifier): Self = this.set("AttackPropertyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackPropertyIdentifier: Self = this.set("AttackPropertyIdentifier", js.undefined)
    
    @scala.inline
    def setTopContributorsVarargs(value: Contributor*): Self = this.set("TopContributors", js.Array(value :_*))
    
    @scala.inline
    def setTopContributors(value: TopContributors): Self = this.set("TopContributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopContributors: Self = this.set("TopContributors", js.undefined)
    
    @scala.inline
    def setTotal(value: Long): Self = this.set("Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
}
