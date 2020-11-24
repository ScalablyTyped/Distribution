package typings.broadcastChannel.broadcastChannelMod

import typings.broadcastChannel.anon.FallbackInterval
import typings.broadcastChannel.anon.Ttl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastChannelOptions extends js.Object {
  
  var idb: js.UndefOr[FallbackInterval] = js.native
  
  var methods: js.UndefOr[js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]] = js.native
  
  var node: js.UndefOr[Ttl] = js.native
  
  var prepareDelay: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[MethodType] = js.native
  
  var webWorkerSupport: js.UndefOr[Boolean] = js.native
}
object BroadcastChannelOptions {
  
  @scala.inline
  def apply(): BroadcastChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastChannelOptions]
  }
  
  @scala.inline
  implicit class BroadcastChannelOptionsOps[Self <: BroadcastChannelOptions] (val x: Self) extends AnyVal {
    
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
    def setIdb(value: FallbackInterval): Self = this.set("idb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdb: Self = this.set("idb", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: BroadcastMethod[js.Object]*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setNode(value: Ttl): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setPrepareDelay(value: Double): Self = this.set("prepareDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepareDelay: Self = this.set("prepareDelay", js.undefined)
    
    @scala.inline
    def setType(value: MethodType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWebWorkerSupport(value: Boolean): Self = this.set("webWorkerSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebWorkerSupport: Self = this.set("webWorkerSupport", js.undefined)
  }
}
