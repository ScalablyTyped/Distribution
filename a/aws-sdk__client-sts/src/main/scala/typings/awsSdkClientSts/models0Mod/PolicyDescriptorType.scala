package typings.awsSdkClientSts.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDescriptorType extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the IAM managed policy to use as a session policy
    *          for the role. For more information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
    *             Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.</p>
    */
  var arn: js.UndefOr[String] = js.undefined
}
object PolicyDescriptorType {
  
  inline def apply(): PolicyDescriptorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescriptorType]
  }
  
  extension [Self <: PolicyDescriptorType](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
