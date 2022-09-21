package typings.bunyanConfig

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.LoggerOptions
import typings.bunyanConfig.anon.Host
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Constructor.
    * @param {Configuration} [jsonConfig] A JSON configuration.
    * @return {LoggerOptions} A logger options.
    */
  inline def apply(): LoggerOptions = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[LoggerOptions]
  inline def apply(jsonConfig: Configuration): LoggerOptions = ^.asInstanceOf[js.Dynamic].apply(jsonConfig.asInstanceOf[js.Any]).asInstanceOf[LoggerOptions]
  
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
    
    var stream: js.UndefOr[WritableStream[Any]] = js.undefined
    
    var streams: js.UndefOr[js.Array[Stream]] = js.undefined
  }
  object Configuration {
    
    inline def apply(name: String): Configuration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setLevel(value: String | Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSerializers(value: js.Object): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setSrc(value: Boolean): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStream(value: WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value*))
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
    
    inline def apply(): Stream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setCloseOnExit(value: Boolean): Self = StObject.set(x, "closeOnExit", value.asInstanceOf[js.Any])
      
      inline def setCloseOnExitUndefined: Self = StObject.set(x, "closeOnExit", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setStream(value: String | StreamConfiguration): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StreamConfiguration extends StObject {
    
    var name: String
    
    var params: js.UndefOr[Host] = js.undefined
  }
  object StreamConfiguration {
    
    inline def apply(name: String): StreamConfiguration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamConfiguration]
    }
    
    extension [Self <: StreamConfiguration](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Host): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
}
