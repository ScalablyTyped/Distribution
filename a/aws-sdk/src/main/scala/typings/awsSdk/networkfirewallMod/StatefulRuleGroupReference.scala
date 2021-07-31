package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRuleGroupReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stateful rule group.
    */
  var ResourceArn: typings.awsSdk.networkfirewallMod.ResourceArn
}
object StatefulRuleGroupReference {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): StatefulRuleGroupReference = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulRuleGroupReference]
  }
  
  @scala.inline
  implicit class StatefulRuleGroupReferenceMutableBuilder[Self <: StatefulRuleGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
