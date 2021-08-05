package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListS3ResourcesResult extends StObject {
  
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of the associated S3 resources returned by the action.
    */
  var s3Resources: js.UndefOr[S3ResourcesClassification] = js.undefined
}
object ListS3ResourcesResult {
  
  inline def apply(): ListS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3ResourcesResult]
  }
  
  extension [Self <: ListS3ResourcesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setS3Resources(value: S3ResourcesClassification): Self = StObject.set(x, "s3Resources", value.asInstanceOf[js.Any])
    
    inline def setS3ResourcesUndefined: Self = StObject.set(x, "s3Resources", js.undefined)
    
    inline def setS3ResourcesVarargs(value: S3ResourceClassification*): Self = StObject.set(x, "s3Resources", js.Array(value :_*))
  }
}
