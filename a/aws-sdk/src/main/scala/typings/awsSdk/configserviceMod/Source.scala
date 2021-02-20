package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  /**
    * Indicates whether AWS or the customer owns and manages the AWS Config rule.
    */
  var Owner: typings.awsSdk.configserviceMod.Owner = js.native
  
  /**
    * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
    */
  var SourceDetails: js.UndefOr[typings.awsSdk.configserviceMod.SourceDetails] = js.native
  
  /**
    * For AWS Config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using AWS Managed Config Rules. For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name.
    */
  var SourceIdentifier: StringWithCharLimit256 = js.native
}
object Source {
  
  @scala.inline
  def apply(Owner: Owner, SourceIdentifier: StringWithCharLimit256): Source = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any], SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDetails(value: SourceDetails): Self = StObject.set(x, "SourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDetailsUndefined: Self = StObject.set(x, "SourceDetails", js.undefined)
    
    @scala.inline
    def setSourceDetailsVarargs(value: SourceDetail*): Self = StObject.set(x, "SourceDetails", js.Array(value :_*))
    
    @scala.inline
    def setSourceIdentifier(value: StringWithCharLimit256): Self = StObject.set(x, "SourceIdentifier", value.asInstanceOf[js.Any])
  }
}
