package typings.crittersWebpackPlugin

import typings.crittersWebpackPlugin.mod.Critters.KeyframeStrategy
import typings.crittersWebpackPlugin.mod.Critters.LogLevel
import typings.crittersWebpackPlugin.mod.Critters.PreloadStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object crittersWebpackPluginStrings {
  @js.native
  sealed trait all extends KeyframeStrategy
  
  @js.native
  sealed trait body extends PreloadStrategy
  
  @js.native
  sealed trait critical extends KeyframeStrategy
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait `js-lazy` extends PreloadStrategy
  
  @js.native
  sealed trait js_ extends PreloadStrategy
  
  @js.native
  sealed trait media extends PreloadStrategy
  
  @js.native
  sealed trait none extends KeyframeStrategy
  
  @js.native
  sealed trait silent extends LogLevel
  
  @js.native
  sealed trait swap extends PreloadStrategy
  
  @js.native
  sealed trait trace extends LogLevel
  
  @js.native
  sealed trait warn extends LogLevel
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def `js-lazy`: `js-lazy` = "js-lazy".asInstanceOf[`js-lazy`]
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def swap: swap = "swap".asInstanceOf[swap]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

