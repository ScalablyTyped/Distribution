package typings.cordovaPluginOuralabs

import typings.cordovaPluginOuralabs.anon.DEBUG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("OuralabsPlugin")
@js.native
object OuralabsPlugin extends js.Object {
  
  @js.native
  trait OuralabsStatic extends js.Object {
    
    /**
      * Log levels designate the severity of the log; used with the log() function.
      * Log levels are ordered from least severe to most severe.
      */
    var LogLevel: DEBUG = js.native
    
    /**
      * Initialize the Ourlabs plugin with the given channel ID string value.
      * You can obtain your channel ID from the Ouralabs dashboard.
      *
      * @param channelId The ID of the channel that logs will be written to.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def init(channelId: String): Unit = js.native
    def init(
      channelId: String,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def init(channelId: String, successCallback: js.Function0[Unit]): Unit = js.native
    def init(
      channelId: String,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a message with the given information.
      *
      * @param logLevel The level of the log; see OuralabsPlugin.LogLevels for possible values.
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def log(logLevel: Double, tag: String, message: String): Unit = js.native
    def log(
      logLevel: Double,
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def log(
      logLevel: Double,
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def log(
      logLevel: Double,
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def log(logLevel: Double, tag: String, message: String, metadata: js.Any): Unit = js.native
    def log(
      logLevel: Double,
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def log(
      logLevel: Double,
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def log(
      logLevel: Double,
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a log message of level DEBUG with the given information.
      *
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def logDebug(tag: String, message: String): Unit = js.native
    def logDebug(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logDebug(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def logDebug(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logDebug(tag: String, message: String, metadata: js.Any): Unit = js.native
    def logDebug(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logDebug(tag: String, message: String, metadata: js.Any, successCallback: js.Function0[Unit]): Unit = js.native
    def logDebug(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a log message of level ERROR with the given information.
      *
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def logError(tag: String, message: String): Unit = js.native
    def logError(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logError(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def logError(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logError(tag: String, message: String, metadata: js.Any): Unit = js.native
    def logError(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logError(tag: String, message: String, metadata: js.Any, successCallback: js.Function0[Unit]): Unit = js.native
    def logError(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a log message of level FATAL with the given information.
      *
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def logFatal(tag: String, message: String): Unit = js.native
    def logFatal(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logFatal(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def logFatal(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logFatal(tag: String, message: String, metadata: js.Any): Unit = js.native
    def logFatal(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logFatal(tag: String, message: String, metadata: js.Any, successCallback: js.Function0[Unit]): Unit = js.native
    def logFatal(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a log message of level INFO with the given information.
      *
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def logInfo(tag: String, message: String): Unit = js.native
    def logInfo(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logInfo(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def logInfo(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logInfo(tag: String, message: String, metadata: js.Any): Unit = js.native
    def logInfo(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logInfo(tag: String, message: String, metadata: js.Any, successCallback: js.Function0[Unit]): Unit = js.native
    def logInfo(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a log message of level TRACE with the given information.
      *
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def logTrace(tag: String, message: String): Unit = js.native
    def logTrace(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logTrace(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def logTrace(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logTrace(tag: String, message: String, metadata: js.Any): Unit = js.native
    def logTrace(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logTrace(tag: String, message: String, metadata: js.Any, successCallback: js.Function0[Unit]): Unit = js.native
    def logTrace(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Logs a log message of level WARN with the given information.
      *
      * @param tag The tag for the log entry.
      * @param message The body of the log message.
      * @param metadata An optional object to be appended to the log message in JSON format. If the object cannot be serialized into JSON it will be flattened into key/value pairs.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def logWarn(tag: String, message: String): Unit = js.native
    def logWarn(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logWarn(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def logWarn(
      tag: String,
      message: String,
      metadata: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logWarn(tag: String, message: String, metadata: js.Any): Unit = js.native
    def logWarn(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logWarn(tag: String, message: String, metadata: js.Any, successCallback: js.Function0[Unit]): Unit = js.native
    def logWarn(
      tag: String,
      message: String,
      metadata: js.Any,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Allows setting of the three arbitrary attribute values that are stored with the device information.
      *
      * @param [string] attribute1 - The (optional) attribute value to set for the first attribute.
      * @param [string] attribute2 - The (optional) attribute value to set for the first attribute.
      * @param [string] attribute3 - The (optional) attribute value to set for the first attribute.
      * @param [function] successCallback - The success callback for this asynchronous function.
      * @param [function] failureCallback - The failure callback for this asynchronous function; receives an error string.
      */
    def setAttributes(): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: js.UndefOr[scala.Nothing], attribute2: js.UndefOr[scala.Nothing], attribute3: String): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: String,
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: String,
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: String,
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: js.UndefOr[scala.Nothing], attribute2: String): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: String,
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: String,
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: String,
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: js.UndefOr[scala.Nothing], attribute2: String, attribute3: String): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: String,
      attribute3: String,
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: String,
      attribute3: String,
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: js.UndefOr[scala.Nothing],
      attribute2: String,
      attribute3: String,
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: String): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: String, attribute2: js.UndefOr[scala.Nothing], attribute3: String): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: String,
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: String,
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: js.UndefOr[scala.Nothing],
      attribute3: String,
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: String, attribute2: String): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: String,
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: String,
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit]
    ): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: String,
      attribute3: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: String, attribute2: String, attribute3: String): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: String,
      attribute3: String,
      successCallback: js.UndefOr[scala.Nothing],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def setAttributes(attribute1: String, attribute2: String, attribute3: String, successCallback: js.Function0[Unit]): Unit = js.native
    def setAttributes(
      attribute1: String,
      attribute2: String,
      attribute3: String,
      successCallback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Used to enable hooking of the browser's console logging functions (eg console.log,
      * console.error, etc) to ensure that these logs get logged via Ouralabs.
      *
      * @param enable True to enable hooking of the console log functions, false to disable.
      */
    def setHookBrowserConsole(enable: Boolean): Unit = js.native
    
    /**
      * Used to ensure values logged via the plugin are also displayed in the browser's console.
      *
      * @param enable True to enable logs to show up in the browser's console, false  to disable.
      */
    def setLogToBrowserConsole(enable: Boolean): Unit = js.native
  }
}
