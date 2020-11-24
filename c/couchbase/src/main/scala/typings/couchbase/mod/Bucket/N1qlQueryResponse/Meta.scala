package typings.couchbase.mod.Bucket.N1qlQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The meta-information available from a view query response.
  */
@js.native
trait Meta extends js.Object {
  
  /**
    * The identifier for this query request.
    */
  var requestID: Double = js.native
}
object Meta {
  
  @scala.inline
  def apply(requestID: Double): Meta = {
    val __obj = js.Dynamic.literal(requestID = requestID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setRequestID(value: Double): Self = this.set("requestID", value.asInstanceOf[js.Any])
  }
}
