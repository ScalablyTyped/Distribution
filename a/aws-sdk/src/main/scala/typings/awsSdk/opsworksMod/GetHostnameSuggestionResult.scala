package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostnameSuggestionResult extends js.Object {
  
  /**
    * The generated host name.
    */
  var Hostname: js.UndefOr[String] = js.native
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
}
object GetHostnameSuggestionResult {
  
  @scala.inline
  def apply(): GetHostnameSuggestionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostnameSuggestionResult]
  }
  
  @scala.inline
  implicit class GetHostnameSuggestionResultOps[Self <: GetHostnameSuggestionResult] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerId: Self = this.set("LayerId", js.undefined)
  }
}
