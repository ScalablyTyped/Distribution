package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLTransformsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of machine learning transforms.
    */
  var Transforms: TransformList
}
object GetMLTransformsResponse {
  
  inline def apply(Transforms: TransformList): GetMLTransformsResponse = {
    val __obj = js.Dynamic.literal(Transforms = Transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformsResponse]
  }
  
  extension [Self <: GetMLTransformsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransforms(value: TransformList): Self = StObject.set(x, "Transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsVarargs(value: MLTransform*): Self = StObject.set(x, "Transforms", js.Array(value :_*))
  }
}
