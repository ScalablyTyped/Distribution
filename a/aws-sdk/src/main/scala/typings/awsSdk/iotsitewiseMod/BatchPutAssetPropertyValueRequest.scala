package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutAssetPropertyValueRequest extends js.Object {
  
  /**
    * The list of asset property value entries for the batch put request. You can specify up to 10 entries per request.
    */
  var entries: PutAssetPropertyValueEntries = js.native
}
object BatchPutAssetPropertyValueRequest {
  
  @scala.inline
  def apply(entries: PutAssetPropertyValueEntries): BatchPutAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyValueRequest]
  }
  
  @scala.inline
  implicit class BatchPutAssetPropertyValueRequestOps[Self <: BatchPutAssetPropertyValueRequest] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: PutAssetPropertyValueEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: PutAssetPropertyValueEntries): Self = this.set("entries", value.asInstanceOf[js.Any])
  }
}
