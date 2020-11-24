package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModelsResult extends js.Object {
  
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
  implicit class GetModelsResultOps[Self <: GetModelsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelsVarargs(value: Model*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: modelList): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
