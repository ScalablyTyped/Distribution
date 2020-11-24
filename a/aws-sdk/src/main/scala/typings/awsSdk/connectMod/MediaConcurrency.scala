package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConcurrency extends js.Object {
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP).
    */
  var Channel: typings.awsSdk.connectMod.Channel = js.native
  
  /**
    * The number of contacts an agent can have on a channel simultaneously.
    */
  var Concurrency: typings.awsSdk.connectMod.Concurrency = js.native
}
object MediaConcurrency {
  
  @scala.inline
  def apply(Channel: Channel, Concurrency: Concurrency): MediaConcurrency = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], Concurrency = Concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConcurrency]
  }
  
  @scala.inline
  implicit class MediaConcurrencyOps[Self <: MediaConcurrency] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrency(value: Concurrency): Self = this.set("Concurrency", value.asInstanceOf[js.Any])
  }
}
