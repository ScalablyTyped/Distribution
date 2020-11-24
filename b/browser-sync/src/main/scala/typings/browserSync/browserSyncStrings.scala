package typings.browserSync

import typings.browserSync.mod.LogLevel
import typings.browserSync.mod.OpenOptions
import typings.browserSync.mod.WatchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserSyncStrings {
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def addDir: addDir = "addDir".asInstanceOf[addDir]
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def external: external = "external".asInstanceOf[external]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  
  @scala.inline
  def tunnel: tunnel = "tunnel".asInstanceOf[tunnel]
  
  @scala.inline
  def ui: ui = "ui".asInstanceOf[ui]
  
  @scala.inline
  def `ui-external`: `ui-external` = "ui-external".asInstanceOf[`ui-external`]
  
  @scala.inline
  def unlink: unlink = "unlink".asInstanceOf[unlink]
  
  @scala.inline
  def unlinkDir: unlinkDir = "unlinkDir".asInstanceOf[unlinkDir]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait add extends WatchEvents
  
  @js.native
  sealed trait addDir extends WatchEvents
  
  @js.native
  sealed trait change extends WatchEvents
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait external extends OpenOptions
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait local extends OpenOptions
  
  @js.native
  sealed trait silent extends LogLevel
  
  @js.native
  sealed trait tunnel extends OpenOptions
  
  @js.native
  sealed trait ui extends OpenOptions
  
  @js.native
  sealed trait `ui-external` extends OpenOptions
  
  @js.native
  sealed trait unlink extends WatchEvents
  
  @js.native
  sealed trait unlinkDir extends WatchEvents
  
  @js.native
  sealed trait warn extends LogLevel
}
