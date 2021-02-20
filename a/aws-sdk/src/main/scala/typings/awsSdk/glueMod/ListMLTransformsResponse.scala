package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMLTransformsResponse extends StObject {
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The identifiers of all the machine learning transforms in the account, or the machine learning transforms with the specified tags.
    */
  var TransformIds: TransformIdList = js.native
}
object ListMLTransformsResponse {
  
  @scala.inline
  def apply(TransformIds: TransformIdList): ListMLTransformsResponse = {
    val __obj = js.Dynamic.literal(TransformIds = TransformIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMLTransformsResponse]
  }
  
  @scala.inline
  implicit class ListMLTransformsResponseMutableBuilder[Self <: ListMLTransformsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransformIds(value: TransformIdList): Self = StObject.set(x, "TransformIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformIdsVarargs(value: HashString*): Self = StObject.set(x, "TransformIds", js.Array(value :_*))
  }
}
