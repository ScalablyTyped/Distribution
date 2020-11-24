package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClassifierRequest extends js.Object {
  
  /**
    * A CsvClassifier object specifying the classifier to create.
    */
  var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.native
  
  /**
    * A GrokClassifier object specifying the classifier to create.
    */
  var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.native
  
  /**
    * A JsonClassifier object specifying the classifier to create.
    */
  var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.native
  
  /**
    * An XMLClassifier object specifying the classifier to create.
    */
  var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.native
}
object CreateClassifierRequest {
  
  @scala.inline
  def apply(): CreateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClassifierRequest]
  }
  
  @scala.inline
  implicit class CreateClassifierRequestOps[Self <: CreateClassifierRequest] (val x: Self) extends AnyVal {
    
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
    def setCsvClassifier(value: CreateCsvClassifierRequest): Self = this.set("CsvClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvClassifier: Self = this.set("CsvClassifier", js.undefined)
    
    @scala.inline
    def setGrokClassifier(value: CreateGrokClassifierRequest): Self = this.set("GrokClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrokClassifier: Self = this.set("GrokClassifier", js.undefined)
    
    @scala.inline
    def setJsonClassifier(value: CreateJsonClassifierRequest): Self = this.set("JsonClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonClassifier: Self = this.set("JsonClassifier", js.undefined)
    
    @scala.inline
    def setXMLClassifier(value: CreateXMLClassifierRequest): Self = this.set("XMLClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMLClassifier: Self = this.set("XMLClassifier", js.undefined)
  }
}
