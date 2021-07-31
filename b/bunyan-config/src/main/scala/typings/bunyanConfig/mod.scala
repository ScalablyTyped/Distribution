package typings.bunyanConfig

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.LoggerOptions
import typings.bunyanConfig.anon.Host
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Constructor.
    * @param {Configuration} [jsonConfig] A JSON configuration.
    * @return {LoggerOptions} A logger options.
    */
  @scala.inline
  def apply(): LoggerOptions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LoggerOptions]
  @scala.inline
  def apply(jsonConfig: Configuration): LoggerOptions = ^.asInstanceOf[js.Dynamic].apply(jsonConfig.asInstanceOf[js.Any]).asInstanceOf[LoggerOptions]
  
  @JSImport("bunyan-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Configuration.
    * @interface
    */
  trait Configuration extends StObject {
    
    var level: js.UndefOr[String | Double] = js.undefined
    
    var name: String
    
    var serializers: js.UndefOr[js.Object] = js.undefined
    
    var src: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    var streams: js.UndefOr[js.Array[Stream]] = js.undefined
  }
  object Configuration {
    
    @scala.inline
    def apply(name: String): Configuration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String | Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializers(value: js.Object): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      @scala.inline
      def setSrc(value: Boolean): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      @scala.inline
      def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  trait Stream extends StObject {
    
    var closeOnExit: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var period: js.UndefOr[String] = js.undefined
    
    var stream: js.UndefOr[String | StreamConfiguration] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Stream {
    
    @scala.inline
    def apply(): Stream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOnExit(value: Boolean): Self = StObject.set(x, "closeOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnExitUndefined: Self = StObject.set(x, "closeOnExit", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setStream(value: String | StreamConfiguration): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StreamConfiguration extends StObject {
    
    var name: String
    
    var params: js.UndefOr[Host] = js.undefined
  }
  object StreamConfiguration {
    
    @scala.inline
    def apply(name: String): StreamConfiguration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamConfiguration]
    }
    
    @scala.inline
    implicit class StreamConfigurationMutableBuilder[Self <: StreamConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Host): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
}
