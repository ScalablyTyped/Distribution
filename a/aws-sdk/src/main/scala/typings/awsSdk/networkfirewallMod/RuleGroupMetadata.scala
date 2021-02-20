package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group.
    */
  var Arn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}
object RuleGroupMetadata {
  
  @scala.inline
  def apply(): RuleGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupMetadata]
  }
  
  @scala.inline
  implicit class RuleGroupMetadataMutableBuilder[Self <: RuleGroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
