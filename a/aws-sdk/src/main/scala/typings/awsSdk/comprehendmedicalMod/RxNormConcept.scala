package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RxNormConcept extends js.Object {
  
  /**
    * RxNorm concept ID, also known as the RxCUI.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The description of the RxNorm concept.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported RxNorm concept.
    */
  var Score: js.UndefOr[Float] = js.native
}
object RxNormConcept {
  
  @scala.inline
  def apply(): RxNormConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormConcept]
  }
  
  @scala.inline
  implicit class RxNormConceptOps[Self <: RxNormConcept] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
  }
}
