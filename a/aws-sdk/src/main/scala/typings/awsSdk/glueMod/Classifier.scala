package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classifier extends js.Object {
  
  /**
    * A classifier for comma-separated values (CSV).
    */
  var CsvClassifier: js.UndefOr[typings.awsSdk.glueMod.CsvClassifier] = js.native
  
  /**
    * A classifier that uses grok.
    */
  var GrokClassifier: js.UndefOr[typings.awsSdk.glueMod.GrokClassifier] = js.native
  
  /**
    * A classifier for JSON content.
    */
  var JsonClassifier: js.UndefOr[typings.awsSdk.glueMod.JsonClassifier] = js.native
  
  /**
    * A classifier for XML content.
    */
  var XMLClassifier: js.UndefOr[typings.awsSdk.glueMod.XMLClassifier] = js.native
}
object Classifier {
  
  @scala.inline
  def apply(): Classifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classifier]
  }
  
  @scala.inline
  implicit class ClassifierOps[Self <: Classifier] (val x: Self) extends AnyVal {
    
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
    def setCsvClassifier(value: CsvClassifier): Self = this.set("CsvClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvClassifier: Self = this.set("CsvClassifier", js.undefined)
    
    @scala.inline
    def setGrokClassifier(value: GrokClassifier): Self = this.set("GrokClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrokClassifier: Self = this.set("GrokClassifier", js.undefined)
    
    @scala.inline
    def setJsonClassifier(value: JsonClassifier): Self = this.set("JsonClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonClassifier: Self = this.set("JsonClassifier", js.undefined)
    
    @scala.inline
    def setXMLClassifier(value: XMLClassifier): Self = this.set("XMLClassifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMLClassifier: Self = this.set("XMLClassifier", js.undefined)
  }
}
