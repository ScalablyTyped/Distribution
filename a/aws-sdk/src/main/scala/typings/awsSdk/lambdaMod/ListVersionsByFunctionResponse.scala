package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVersionsByFunctionResponse extends StObject {
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * A list of Lambda function versions.
    */
  var Versions: js.UndefOr[FunctionList] = js.native
}
object ListVersionsByFunctionResponse {
  
  @scala.inline
  def apply(): ListVersionsByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsByFunctionResponse]
  }
  
  @scala.inline
  implicit class ListVersionsByFunctionResponseMutableBuilder[Self <: ListVersionsByFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setVersions(value: FunctionList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: FunctionConfiguration*): Self = StObject.set(x, "Versions", js.Array(value :_*))
  }
}
