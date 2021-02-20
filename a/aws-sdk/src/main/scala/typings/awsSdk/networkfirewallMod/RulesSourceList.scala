package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesSourceList extends StObject {
  
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
  implicit class RulesSourceListMutableBuilder[Self <: RulesSourceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneratedRulesType(value: GeneratedRulesType): Self = StObject.set(x, "GeneratedRulesType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypes(value: TargetTypes): Self = StObject.set(x, "TargetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypesVarargs(value: TargetType*): Self = StObject.set(x, "TargetTypes", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: RuleTargets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
