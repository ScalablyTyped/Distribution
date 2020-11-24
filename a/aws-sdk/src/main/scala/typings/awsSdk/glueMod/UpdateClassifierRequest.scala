package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClassifierRequest extends js.Object {
  
  /**
    * A CsvClassifier object with updated fields.
    */
  var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.native
  
  /**
    * A GrokClassifier object with updated fields.
    */
  var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.native
  
  /**
    * A JsonClassifier object with updated fields.
    */
  var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.native
  
  /**
    * An XMLClassifier object with updated fields.
    */
  var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.native
}
object UpdateClassifierRequest {
  
  @scala.inline
  def apply(): UpdateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateClassifierRequestOps[Self <: UpdateClassifierRequest] (val x: Self) extends AnyVal {
    
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
    def setCsvClassifier(value: UpdateCsvClassifierRequest): Self = this.set("CsvClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvClassifier: Self = this.set("CsvClassifier", js.undefined)
    
    @scala.inline
    def setGrokClassifier(value: UpdateGrokClassifierRequest): Self = this.set("GrokClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrokClassifier: Self = this.set("GrokClassifier", js.undefined)
    
    @scala.inline
    def setJsonClassifier(value: UpdateJsonClassifierRequest): Self = this.set("JsonClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonClassifier: Self = this.set("JsonClassifier", js.undefined)
    
    @scala.inline
    def setXMLClassifier(value: UpdateXMLClassifierRequest): Self = this.set("XMLClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMLClassifier: Self = this.set("XMLClassifier", js.undefined)
  }
}
