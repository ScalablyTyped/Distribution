package typings.datadogMetrics

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    def flush(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def flush(onSuccess: js.Function0[Unit]): Unit = js.native
    def flush(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    /**
      * Record the current value of a metric. They most recent value in a given flush
      * interval will be recorded. Optionally, specify a set of tags to associate with
      * the metric. This should be used for sum values such as total hard disk space,
      * process uptime, total number of active users, or number of rows in a database table.
      */
    def gauge(key: String, value: Double): Unit = js.native
    def gauge(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def gauge(key: String, value: Double, tags: js.Array[String]): Unit = js.native
    def gauge(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
    
    /**
      * Sample a histogram value. Histograms will produce metrics that describe the distribution
      * of the recorded values, namely the minimum, maximum, average, count and the 75th, 85th,
      * 95th and 99th percentiles. Optionally, specify a list of tags to associate with the metric.
      */
    def histogram(key: String, value: Double): Unit = js.native
    def histogram(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def histogram(key: String, value: Double, tags: js.Array[String]): Unit = js.native
    def histogram(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
    
    /**
      * Increment the counter by the given value (or 1 by default). Optionally, specify a
      * list of tags to associate with the metric. This is useful for counting things such
      * as incrementing a counter each time a page is requested.
      */
    def increment(key: String): Unit = js.native
    def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
    def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String], timestamp: Double): Unit = js.native
    def increment(key: String, value: Double): Unit = js.native
    def increment(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
    def increment(key: String, value: Double, tags: js.Array[String]): Unit = js.native
    def increment(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  }
  
  @JSImport("datadog-metrics", "flush")
  @js.native
  def flush(): Unit = js.native
  @JSImport("datadog-metrics", "flush")
  @js.native
  def flush(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  @JSImport("datadog-metrics", "flush")
  @js.native
  def flush(onSuccess: js.Function0[Unit]): Unit = js.native
  @JSImport("datadog-metrics", "flush")
  @js.native
  def flush(onSuccess: js.Function0[Unit], onError: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("datadog-metrics", "gauge")
  @js.native
  def gauge(key: String, value: Double): Unit = js.native
  @JSImport("datadog-metrics", "gauge")
  @js.native
  def gauge(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  @JSImport("datadog-metrics", "gauge")
  @js.native
  def gauge(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  @JSImport("datadog-metrics", "gauge")
  @js.native
  def gauge(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  
  @JSImport("datadog-metrics", "histogram")
  @js.native
  def histogram(key: String, value: Double): Unit = js.native
  @JSImport("datadog-metrics", "histogram")
  @js.native
  def histogram(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  @JSImport("datadog-metrics", "histogram")
  @js.native
  def histogram(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  @JSImport("datadog-metrics", "histogram")
  @js.native
  def histogram(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String]): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: js.UndefOr[scala.Nothing], tags: js.Array[String], timestamp: Double): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: Double): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: Double, tags: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: Double, tags: js.Array[String]): Unit = js.native
  @JSImport("datadog-metrics", "increment")
  @js.native
  def increment(key: String, value: Double, tags: js.Array[String], timestamp: Double): Unit = js.native
  
  @JSImport("datadog-metrics", "init")
  @js.native
  def init(options: BufferedMetricsLoggerOptions): Unit = js.native
  
  @js.native
  trait BufferedMetricsLoggerOptions extends StObject {
    
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
    implicit class BufferedMetricsLoggerOptionsMutableBuilder[Self <: BufferedMetricsLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setAppKey(value: String): Self = StObject.set(x, "appKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppKeyUndefined: Self = StObject.set(x, "appKey", js.undefined)
      
      @scala.inline
      def setDefaultTags(value: js.Array[String]): Self = StObject.set(x, "defaultTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTagsUndefined: Self = StObject.set(x, "defaultTags", js.undefined)
      
      @scala.inline
      def setDefaultTagsVarargs(value: String*): Self = StObject.set(x, "defaultTags", js.Array(value :_*))
      
      @scala.inline
      def setFlushIntervalSeconds(value: Double): Self = StObject.set(x, "flushIntervalSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushIntervalSecondsUndefined: Self = StObject.set(x, "flushIntervalSeconds", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
