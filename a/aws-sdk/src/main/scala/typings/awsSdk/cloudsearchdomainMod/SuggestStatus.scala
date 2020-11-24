package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestStatus extends js.Object {
  
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.native
  
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.native
}
object SuggestStatus {
  
  @scala.inline
  def apply(): SuggestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestStatus]
  }
  
  @scala.inline
  implicit class SuggestStatusOps[Self <: SuggestStatus] (val x: Self) extends AnyVal {
    
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
    def setRid(value: String): Self = this.set("rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRid: Self = this.set("rid", js.undefined)
    
    @scala.inline
    def setTimems(value: Long): Self = this.set("timems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimems: Self = this.set("timems", js.undefined)
  }
}
