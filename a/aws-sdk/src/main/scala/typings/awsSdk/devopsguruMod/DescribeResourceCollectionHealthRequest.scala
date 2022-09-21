package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceCollectionHealthRequest extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  An Amazon Web Services resource collection type. This type specifies how analyzed Amazon Web Services resources are defined. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  var ResourceCollectionType: typings.awsSdk.devopsguruMod.ResourceCollectionType
}
object DescribeResourceCollectionHealthRequest {
  
  inline def apply(ResourceCollectionType: ResourceCollectionType): DescribeResourceCollectionHealthRequest = {
    val __obj = js.Dynamic.literal(ResourceCollectionType = ResourceCollectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceCollectionHealthRequest]
  }
  
  extension [Self <: DescribeResourceCollectionHealthRequest](x: Self) {
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceCollectionType(value: ResourceCollectionType): Self = StObject.set(x, "ResourceCollectionType", value.asInstanceOf[js.Any])
  }
}
