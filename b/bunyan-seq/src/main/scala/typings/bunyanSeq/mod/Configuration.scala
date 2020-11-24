package typings.bunyanSeq.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var batchSizeLimit: js.UndefOr[Double] = js.native
  
  var eventSizeLimit: js.UndefOr[Double] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var maxBatchingTime: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
  
  var reemitErrorEvents: js.UndefOr[Boolean] = js.native
  
  var serverUrl: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setBatchSizeLimit(value: Double): Self = this.set("batchSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSizeLimit: Self = this.set("batchSizeLimit", js.undefined)
    
    @scala.inline
    def setEventSizeLimit(value: Double): Self = this.set("eventSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSizeLimit: Self = this.set("eventSizeLimit", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMaxBatchingTime(value: Double): Self = this.set("maxBatchingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBatchingTime: Self = this.set("maxBatchingTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnError(value: /* e */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setReemitErrorEvents(value: Boolean): Self = this.set("reemitErrorEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReemitErrorEvents: Self = this.set("reemitErrorEvents", js.undefined)
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerUrl: Self = this.set("serverUrl", js.undefined)
  }
}
