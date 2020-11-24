package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoversBodyPart extends js.Object {
  
  /**
    * The confidence that Amazon Rekognition has in the value of Value.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * True if the PPE covers the corresponding body part, otherwise false.
    */
  var Value: js.UndefOr[Boolean] = js.native
}
object CoversBodyPart {
  
  @scala.inline
  def apply(): CoversBodyPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoversBodyPart]
  }
  
  @scala.inline
  implicit class CoversBodyPartOps[Self <: CoversBodyPart] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
