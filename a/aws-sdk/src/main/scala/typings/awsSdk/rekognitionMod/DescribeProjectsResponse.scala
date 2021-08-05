package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectsResponse extends StObject {
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
  
  /**
    * A list of project descriptions. The list is sorted by the date and time the projects are created.
    */
  var ProjectDescriptions: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectDescriptions] = js.undefined
}
object DescribeProjectsResponse {
  
  inline def apply(): DescribeProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectsResponse]
  }
  
  extension [Self <: DescribeProjectsResponse](x: Self) {
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectDescriptions(value: ProjectDescriptions): Self = StObject.set(x, "ProjectDescriptions", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionsUndefined: Self = StObject.set(x, "ProjectDescriptions", js.undefined)
    
    inline def setProjectDescriptionsVarargs(value: ProjectDescription*): Self = StObject.set(x, "ProjectDescriptions", js.Array(value :_*))
  }
}
