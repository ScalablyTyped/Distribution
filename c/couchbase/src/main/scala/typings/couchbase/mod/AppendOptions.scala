package typings.couchbase.mod

import typings.couchbase.mod.Bucket.CAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendOptions extends js.Object {
  
  /**
    * The CAS value to check. If the item on the server contains a different CAS value, the operation will fail. Note that if this option is undefined, no comparison will be performed.
    */
  var cas: js.UndefOr[CAS] = js.native
  
  /**
    * Ensures this operation is persisted to this many nodes.
    */
  var persist_to: js.UndefOr[Double] = js.native
  
  /**
    *     Ensures this operation is replicated to this many nodes.
    */
  var replicate_to: js.UndefOr[Double] = js.native
}
object AppendOptions {
  
  @scala.inline
  def apply(): AppendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendOptions]
  }
  
  @scala.inline
  implicit class AppendOptionsOps[Self <: AppendOptions] (val x: Self) extends AnyVal {
    
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
    def setCas(value: CAS): Self = this.set("cas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCas: Self = this.set("cas", js.undefined)
    
    @scala.inline
    def setPersist_to(value: Double): Self = this.set("persist_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist_to: Self = this.set("persist_to", js.undefined)
    
    @scala.inline
    def setReplicate_to(value: Double): Self = this.set("replicate_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicate_to: Self = this.set("replicate_to", js.undefined)
  }
}
