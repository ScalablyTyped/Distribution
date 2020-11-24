package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectPiiEntitiesResponse extends js.Object {
  
  /**
    * A collection of PII entities identified in the input text. For each entity, the response provides the entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection.
    */
  var Entities: js.UndefOr[ListOfPiiEntities] = js.native
}
object DetectPiiEntitiesResponse {
  
  @scala.inline
  def apply(): DetectPiiEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectPiiEntitiesResponse]
  }
  
  @scala.inline
  implicit class DetectPiiEntitiesResponseOps[Self <: DetectPiiEntitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setEntitiesVarargs(value: PiiEntity*): Self = this.set("Entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: ListOfPiiEntities): Self = this.set("Entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("Entities", js.undefined)
  }
}
