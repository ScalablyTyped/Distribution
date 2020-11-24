package typings.datadogMetrics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferedMetricsLoggerOptions extends js.Object {
  
  /**
    * Sets the DataDog API key.
    */
  var apiKey: js.UndefOr[String] = js.native
  
  /**
    * Sets the DataDog APP key.
    */
  var appKey: js.UndefOr[String] = js.native
  
  /**
    * Default tags used for all metric reporting.
    */
  var defaultTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * How often to send metrics to DataDog.
    */
  var flushIntervalSeconds: js.UndefOr[Double] = js.native
  
  /**
    * Sets the hostname reported with each metric.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Sets a default prefix for all metrics.
    */
  var prefix: js.UndefOr[String] = js.native
}
object BufferedMetricsLoggerOptions {
  
  @scala.inline
  def apply(): BufferedMetricsLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferedMetricsLoggerOptions]
  }
  
  @scala.inline
  implicit class BufferedMetricsLoggerOptionsOps[Self <: BufferedMetricsLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppKey: Self = this.set("appKey", js.undefined)
    
    @scala.inline
    def setDefaultTagsVarargs(value: String*): Self = this.set("defaultTags", js.Array(value :_*))
    
    @scala.inline
    def setDefaultTags(value: js.Array[String]): Self = this.set("defaultTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTags: Self = this.set("defaultTags", js.undefined)
    
    @scala.inline
    def setFlushIntervalSeconds(value: Double): Self = this.set("flushIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushIntervalSeconds: Self = this.set("flushIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
