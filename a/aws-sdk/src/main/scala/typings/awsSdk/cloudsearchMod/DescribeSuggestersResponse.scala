package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSuggestersResponse extends js.Object {
  
  /**
    * The suggesters configured for the domain specified in the request.
    */
  var Suggesters: SuggesterStatusList = js.native
}
object DescribeSuggestersResponse {
  
  @scala.inline
  def apply(Suggesters: SuggesterStatusList): DescribeSuggestersResponse = {
    val __obj = js.Dynamic.literal(Suggesters = Suggesters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersResponse]
  }
  
  @scala.inline
  implicit class DescribeSuggestersResponseOps[Self <: DescribeSuggestersResponse] (val x: Self) extends AnyVal {
    
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
    def setSuggestersVarargs(value: SuggesterStatus*): Self = this.set("Suggesters", js.Array(value :_*))
    
    @scala.inline
    def setSuggesters(value: SuggesterStatusList): Self = this.set("Suggesters", value.asInstanceOf[js.Any])
  }
}
