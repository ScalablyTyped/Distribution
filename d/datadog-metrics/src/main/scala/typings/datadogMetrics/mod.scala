package typings.datadogMetrics

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datadog-metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("datadog-metrics", "BufferedMetricsLogger")
  @js.native
  class BufferedMetricsLogger protected () extends StObject {
    def this(options: BufferedMetricsLoggerOptions) = this()
    
    /**
      * Calling flush sends any buffered metrics to DataDog. Unless you set flushIntervalSeconds
      * to 0 it won't be necessary to call this function.
      * It can be useful to trigger a manual flush by calling if you want to make sure pending
      * metrics have been sent before you quit the application process, for example.
      */
    def flush(): Unit = js.native
    def flush(onSuccess: js.Function0[Unit]): Unit = js.native
    def flush(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def flush(onSuccess: Unit, onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /**
      * Record the current value of a metric. They most recent value in a given flush
      * interval will be recorded. Optionally, specify a set of tags to associate with
      * the metric. This should be used for sum values such as total hard disk space,
      * process uptime, total number of active users, or number of rows in a database table.
      */
    def gauge(key: String, value: Double): Unit = js.native
    def gauge(key: String, value: Double, tags: js.Array[String]): Unit = js.native
    def gauge(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
    def gauge(key: String, value: Double, tags: Unit, timestamp: Double): Unit = js.native
    
    /**
      * Sample a histogram value. Histograms will produce metrics that describe the distribution
      * of the recorded values, namely the minimum, maximum, average, count and the 75th, 85th,
      * 95th and 99th percentiles. Optionally, specify a list of tags to associate with the metric.
      */
    def histogram(key: String, value: Double): Unit = js.native
    def histogram(key: String, value: Double, tags: js.Array[String]): Unit = js.native
    def histogram(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
    def histogram(key: String, value: Double, tags: Unit, timestamp: Double): Unit = js.native
    
    /**
      * Increment the counter by the given value (or 1 by default). Optionally, specify a
      * list of tags to associate with the metric. This is useful for counting things such
      * as incrementing a counter each time a page is requested.
      */
    def increment(key: String): Unit = js.native
    def increment(key: String, value: Double): Unit = js.native
    def increment(key: String, value: Double, tags: js.Array[String]): Unit = js.native
    def increment(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
    def increment(key: String, value: Double, tags: Unit, timestamp: Double): Unit = js.native
    def increment(key: String, value: Unit, tags: js.Array[String]): Unit = js.native
    def increment(key: String, value: Unit, tags: js.Array[String], timestamp: Double): Unit = js.native
    def increment(key: String, value: Unit, tags: Unit, timestamp: Double): Unit = js.native
  }
  
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  inline def flush(onSuccess: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(onSuccess.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def flush(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flush(onSuccess: Unit, onError: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gauge(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gauge")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gauge(key: String, value: Double, tags: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gauge")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gauge(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gauge")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gauge(key: String, value: Double, tags: Unit, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gauge")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def histogram(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("histogram")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def histogram(key: String, value: Double, tags: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("histogram")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def histogram(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("histogram")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def histogram(key: String, value: Double, tags: Unit, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("histogram")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def increment(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def increment(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(key: String, value: Double, tags: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(key: String, value: Double, tags: Unit, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(key: String, value: Unit, tags: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(key: String, value: Unit, tags: js.Array[String], timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def increment(key: String, value: Unit, tags: Unit, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init(options: BufferedMetricsLoggerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BufferedMetricsLoggerOptions extends StObject {
    
    /**
      * Sets the DataDog API key.
      */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the DataDog APP key.
      */
    var appKey: js.UndefOr[String] = js.undefined
    
    /**
      * Default tags used for all metric reporting.
      */
    var defaultTags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * How often to send metrics to DataDog.
      */
    var flushIntervalSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the hostname reported with each metric.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Sets a default prefix for all metrics.
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object BufferedMetricsLoggerOptions {
    
    inline def apply(): BufferedMetricsLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferedMetricsLoggerOptions]
    }
    
    extension [Self <: BufferedMetricsLoggerOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
      
      inline def setAppKeyUndefined: Self = StObject.set(x, "appKey", js.undefined)
      
      inline def setDefaultTags(value: js.Array[String]): Self = StObject.set(x, "defaultTags", value.asInstanceOf[js.Any])
      
      inline def setDefaultTagsUndefined: Self = StObject.set(x, "defaultTags", js.undefined)
      
      inline def setDefaultTagsVarargs(value: String*): Self = StObject.set(x, "defaultTags", js.Array(value :_*))
      
      inline def setFlushIntervalSeconds(value: Double): Self = StObject.set(x, "flushIntervalSeconds", value.asInstanceOf[js.Any])
      
      inline def setFlushIntervalSecondsUndefined: Self = StObject.set(x, "flushIntervalSeconds", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
