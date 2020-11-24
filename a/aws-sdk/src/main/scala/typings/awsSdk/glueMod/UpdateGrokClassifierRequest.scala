package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGrokClassifierRequest extends js.Object {
  
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
    */
  var Classification: js.UndefOr[typings.awsSdk.glueMod.Classification] = js.native
  
  /**
    * Optional custom grok patterns used by this classifier.
    */
  var CustomPatterns: js.UndefOr[typings.awsSdk.glueMod.CustomPatterns] = js.native
  
  /**
    * The grok pattern used by this classifier.
    */
  var GrokPattern: js.UndefOr[typings.awsSdk.glueMod.GrokPattern] = js.native
  
  /**
    * The name of the GrokClassifier.
    */
  var Name: NameString = js.native
}
object UpdateGrokClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): UpdateGrokClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGrokClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateGrokClassifierRequestOps[Self <: UpdateGrokClassifierRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassification(value: Classification): Self = this.set("Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassification: Self = this.set("Classification", js.undefined)
    
    @scala.inline
    def setCustomPatterns(value: CustomPatterns): Self = this.set("CustomPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPatterns: Self = this.set("CustomPatterns", js.undefined)
    
    @scala.inline
    def setGrokPattern(value: GrokPattern): Self = this.set("GrokPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrokPattern: Self = this.set("GrokPattern", js.undefined)
  }
}
