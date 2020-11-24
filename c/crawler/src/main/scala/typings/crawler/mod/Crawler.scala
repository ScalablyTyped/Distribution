package typings.crawler.mod

import typings.crawler.anon.OmitCrawlerRequestOptions
import typings.crawler.crawlerStrings.drain
import typings.crawler.crawlerStrings.limiterChange
import typings.crawler.crawlerStrings.request
import typings.crawler.crawlerStrings.schedule
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crawler extends EventEmitter {
  
  def direct(options: OmitCrawlerRequestOptions): Unit = js.native
  
  @JSName("on")
  def on_drain(channel: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_limiterChange(
    channel: limiterChange,
    listener: js.Function2[/* options */ CrawlerRequestOptions, /* limiter */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(channel: request, listener: js.Function1[/* options */ CrawlerRequestOptions, Unit]): this.type = js.native
  @JSName("on")
  def on_schedule(channel: schedule, listener: js.Function1[/* options */ CrawlerRequestOptions, Unit]): this.type = js.native
  
  def queue(urisOrOptions: String): Unit = js.native
  def queue(urisOrOptions: js.Array[CrawlerRequestOptions | String]): Unit = js.native
  def queue(urisOrOptions: CrawlerRequestOptions): Unit = js.native
  
  val queueSize: Double = js.native
  
  def setLimiterProperty(limiter: String): Unit = js.native
  def setLimiterProperty(limiter: String, property: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def setLimiterProperty(limiter: String, property: String): Unit = js.native
  def setLimiterProperty(limiter: String, property: String, value: js.Any): Unit = js.native
}
