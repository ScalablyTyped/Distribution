package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferRxNormResponse extends js.Object {
  
  /**
    * The medication entities detected in the text linked to RxNorm concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: RxNormEntityList = js.native
  
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  
  /**
    * If the result of the previous request to InferRxNorm was truncated, include the PaginationToken to fetch the next page of medication entities.
    */
  var PaginationToken: js.UndefOr[String] = js.native
}
object InferRxNormResponse {
  
  @scala.inline
  def apply(Entities: RxNormEntityList): InferRxNormResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferRxNormResponse]
  }
  
  @scala.inline
  implicit class InferRxNormResponseOps[Self <: InferRxNormResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntitiesVarargs(value: RxNormEntity*): Self = this.set("Entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: RxNormEntityList): Self = this.set("Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersion(value: String): Self = this.set("ModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVersion: Self = this.set("ModelVersion", js.undefined)
    
    @scala.inline
    def setPaginationToken(value: String): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
  }
}
