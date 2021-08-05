package typings.crittersWebpackPlugin

import typings.crittersWebpackPlugin.mod.Critters.KeyframeStrategy
import typings.crittersWebpackPlugin.mod.Critters.LogLevel
import typings.crittersWebpackPlugin.mod.Critters.PreloadStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crittersWebpackPluginStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with KeyframeStrategy
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait body
    extends StObject
       with PreloadStrategy
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait critical
    extends StObject
       with KeyframeStrategy
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `js-lazy`
    extends StObject
       with PreloadStrategy
  inline def `js-lazy`: `js-lazy` = "js-lazy".asInstanceOf[`js-lazy`]
  
  @js.native
  sealed trait js_
    extends StObject
       with PreloadStrategy
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait media
    extends StObject
       with PreloadStrategy
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait none
    extends StObject
       with KeyframeStrategy
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait swap
    extends StObject
       with PreloadStrategy
  inline def swap: swap = "swap".asInstanceOf[swap]
  
  @js.native
  sealed trait trace
    extends StObject
       with LogLevel
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
