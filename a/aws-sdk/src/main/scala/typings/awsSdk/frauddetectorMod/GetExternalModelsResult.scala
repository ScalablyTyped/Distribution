package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExternalModelsResult extends js.Object {
  
  /**
    * Gets the Amazon SageMaker models.
    */
  var externalModels: js.UndefOr[ExternalModelList] = js.native
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetExternalModelsResult {
  
  @scala.inline
  def apply(): GetExternalModelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsResult]
  }
  
  @scala.inline
  implicit class GetExternalModelsResultOps[Self <: GetExternalModelsResult] (val x: Self) extends AnyVal {
    
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
    def setExternalModelsVarargs(value: ExternalModel*): Self = this.set("externalModels", js.Array(value :_*))
    
    @scala.inline
    def setExternalModels(value: ExternalModelList): Self = this.set("externalModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalModels: Self = this.set("externalModels", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
