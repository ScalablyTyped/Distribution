package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSuggesterResponse extends js.Object {
  
  /**
    * The status of the suggester being deleted.
    */
  var Suggester: SuggesterStatus = js.native
}
object DeleteSuggesterResponse {
  
  @scala.inline
  def apply(Suggester: SuggesterStatus): DeleteSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuggesterResponse]
  }
  
  @scala.inline
  implicit class DeleteSuggesterResponseOps[Self <: DeleteSuggesterResponse] (val x: Self) extends AnyVal {
    
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
    def setSuggester(value: SuggesterStatus): Self = this.set("Suggester", value.asInstanceOf[js.Any])
  }
}
