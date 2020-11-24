package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suggester extends js.Object {
  
  var DocumentSuggesterOptions: typings.awsSdk.cloudsearchMod.DocumentSuggesterOptions = js.native
  
  var SuggesterName: StandardName = js.native
}
object Suggester {
  
  @scala.inline
  def apply(DocumentSuggesterOptions: DocumentSuggesterOptions, SuggesterName: StandardName): Suggester = {
    val __obj = js.Dynamic.literal(DocumentSuggesterOptions = DocumentSuggesterOptions.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggester]
  }
  
  @scala.inline
  implicit class SuggesterOps[Self <: Suggester] (val x: Self) extends AnyVal {
    
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
    def setDocumentSuggesterOptions(value: DocumentSuggesterOptions): Self = this.set("DocumentSuggesterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggesterName(value: StandardName): Self = this.set("SuggesterName", value.asInstanceOf[js.Any])
  }
}
