package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNamespaceRequest extends StObject {
  
  /**
    * The ID for the AWS account that contains the QuickSight namespace that you want to describe.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The namespace that you want to describe.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace
}
object DescribeNamespaceRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
  
  extension [Self <: DescribeNamespaceRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
