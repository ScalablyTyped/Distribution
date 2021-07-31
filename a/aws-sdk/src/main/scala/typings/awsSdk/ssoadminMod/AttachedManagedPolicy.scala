package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedManagedPolicy extends StObject {
  
  /**
    * The ARN of the IAM managed policy. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var Arn: js.UndefOr[ManagedPolicyArn] = js.undefined
  
  /**
    * The name of the IAM managed policy.
    */
  var Name: js.UndefOr[typings.awsSdk.ssoadminMod.Name] = js.undefined
}
object AttachedManagedPolicy {
  
  @scala.inline
  def apply(): AttachedManagedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedManagedPolicy]
  }
  
  @scala.inline
  implicit class AttachedManagedPolicyMutableBuilder[Self <: AttachedManagedPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ManagedPolicyArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
