package typings.crittersWebpackPlugin.mod.Critters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls log level of the plugin.
  * Specifies the level the logger should use. A logger will
  * not produce output for any log level beneath the specified level.
  * Available levels and order are:
  * - **"info"** _(default)_
  * - **"warn"**
  * - **"error"**
  * - **"trace"**
  * - **"debug"**
  * - **"silent"**
  */
/* Rewritten from type alias, can be one of: 
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.info
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.warn
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.error
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.trace
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.debug
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.silent
*/
trait LogLevel extends js.Object
object LogLevel {
  
  @scala.inline
  def debug: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.debug = "debug".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.debug]
  
  @scala.inline
  def error: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.error = "error".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.error]
  
  @scala.inline
  def info: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.info = "info".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.info]
  
  @scala.inline
  def silent: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.silent = "silent".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.silent]
  
  @scala.inline
  def trace: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.trace = "trace".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.trace]
  
  @scala.inline
  def warn: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.warn = "warn".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.warn]
}
