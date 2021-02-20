package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModelsResult extends StObject {
  
  /**
    * The array of models.
    */
  var models: js.UndefOr[modelList] = js.native
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetModelsResult {
  
  @scala.inline
  def apply(): GetModelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelsResult]
  }
  
  @scala.inline
  implicit class GetModelsResultMutableBuilder[Self <: GetModelsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: modelList): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
