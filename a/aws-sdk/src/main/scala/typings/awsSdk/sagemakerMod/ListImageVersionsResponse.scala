package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImageVersionsResponse extends StObject {
  
  /**
    * A list of versions and their properties.
    */
  var ImageVersions: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersions] = js.native
  
  /**
    * A token for getting the next set of versions, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListImageVersionsResponse {
  
  @scala.inline
  def apply(): ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageVersionsResponse]
  }
  
  @scala.inline
  implicit class ListImageVersionsResponseMutableBuilder[Self <: ListImageVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageVersions(value: ImageVersions): Self = StObject.set(x, "ImageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageVersionsUndefined: Self = StObject.set(x, "ImageVersions", js.undefined)
    
    @scala.inline
    def setImageVersionsVarargs(value: ImageVersion*): Self = StObject.set(x, "ImageVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
