package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesSourceList extends js.Object {
  
  /**
    * Whether you want to allow or deny access to the domains in your target list.
    */
  var GeneratedRulesType: typings.awsSdk.networkfirewallMod.GeneratedRulesType = js.native
  
  /**
    * 
    */
  var TargetTypes: typings.awsSdk.networkfirewallMod.TargetTypes = js.native
  
  /**
    * The domains that you want to inspect for in your traffic flows. To provide multiple domains, separate them with commas.
    */
  var Targets: RuleTargets = js.native
}
object RulesSourceList {
  
  @scala.inline
  def apply(GeneratedRulesType: GeneratedRulesType, TargetTypes: TargetTypes, Targets: RuleTargets): RulesSourceList = {
    val __obj = js.Dynamic.literal(GeneratedRulesType = GeneratedRulesType.asInstanceOf[js.Any], TargetTypes = TargetTypes.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesSourceList]
  }
  
  @scala.inline
  implicit class RulesSourceListOps[Self <: RulesSourceList] (val x: Self) extends AnyVal {
    
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
    def setGeneratedRulesType(value: GeneratedRulesType): Self = this.set("GeneratedRulesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypesVarargs(value: TargetType*): Self = this.set("TargetTypes", js.Array(value :_*))
    
    @scala.inline
    def setTargetTypes(value: TargetTypes): Self = this.set("TargetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: CollectionMemberString*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: RuleTargets): Self = this.set("Targets", value.asInstanceOf[js.Any])
  }
}
