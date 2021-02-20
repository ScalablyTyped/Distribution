package typings.bunyanSeq

import typings.bunyan.mod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-seq", "createStream")
  @js.native
  def createStream(config: Configuration): Stream = js.native
  
  @js.native
  trait Configuration extends StObject {
    
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
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setBatchSizeLimit(value: Double): Self = StObject.set(x, "batchSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeLimitUndefined: Self = StObject.set(x, "batchSizeLimit", js.undefined)
      
      @scala.inline
      def setEventSizeLimit(value: Double): Self = StObject.set(x, "eventSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSizeLimitUndefined: Self = StObject.set(x, "eventSizeLimit", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaxBatchingTime(value: Double): Self = StObject.set(x, "maxBatchingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBatchingTimeUndefined: Self = StObject.set(x, "maxBatchingTime", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnError(value: /* e */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setReemitErrorEvents(value: Boolean): Self = StObject.set(x, "reemitErrorEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReemitErrorEventsUndefined: Self = StObject.set(x, "reemitErrorEvents", js.undefined)
      
      @scala.inline
      def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    }
  }
}
