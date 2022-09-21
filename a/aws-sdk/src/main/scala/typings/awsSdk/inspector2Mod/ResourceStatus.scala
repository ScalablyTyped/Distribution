package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceStatus extends StObject {
  
  /**
    * The status of Amazon Inspector scanning for Amazon EC2 resources.
    */
  var ec2: Status
  
  /**
    * The status of Amazon Inspector scanning for Amazon ECR resources.
    */
  var ecr: Status
}
object ResourceStatus {
  
  inline def apply(ec2: Status, ecr: Status): ResourceStatus = {
    val __obj = js.Dynamic.literal(ec2 = ec2.asInstanceOf[js.Any], ecr = ecr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceStatus]
  }
  
  extension [Self <: ResourceStatus](x: Self) {
    
    inline def setEc2(value: Status): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEcr(value: Status): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
  }
}
