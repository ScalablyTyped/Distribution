package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTransformsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of machine learning transforms.
    */
  var Transforms: TransformList = js.native
}
object GetMLTransformsResponse {
  
  @scala.inline
  def apply(Transforms: TransformList): GetMLTransformsResponse = {
    val __obj = js.Dynamic.literal(Transforms = Transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformsResponse]
  }
  
  @scala.inline
  implicit class GetMLTransformsResponseMutableBuilder[Self <: GetMLTransformsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransforms(value: TransformList): Self = StObject.set(x, "Transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsVarargs(value: MLTransform*): Self = StObject.set(x, "Transforms", js.Array(value :_*))
  }
}
