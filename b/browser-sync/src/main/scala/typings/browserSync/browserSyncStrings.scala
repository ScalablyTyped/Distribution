package typings.browserSync

import typings.browserSync.mod.LogLevel
import typings.browserSync.mod.OpenOptions
import typings.browserSync.mod.WatchEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserSyncStrings {
  
  @js.native
  sealed trait add
    extends StObject
       with WatchEvents
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait addDir
    extends StObject
       with WatchEvents
  inline def addDir: addDir = "addDir".asInstanceOf[addDir]
  
  @js.native
  sealed trait change
    extends StObject
       with WatchEvents
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait external
    extends StObject
       with OpenOptions
  inline def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait local
    extends StObject
       with OpenOptions
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait tunnel
    extends StObject
       with OpenOptions
  inline def tunnel: tunnel = "tunnel".asInstanceOf[tunnel]
  
  @js.native
  sealed trait ui
    extends StObject
       with OpenOptions
  inline def ui: ui = "ui".asInstanceOf[ui]
  
  @js.native
  sealed trait `ui-external`
    extends StObject
       with OpenOptions
  inline def `ui-external`: `ui-external` = "ui-external".asInstanceOf[`ui-external`]
  
  @js.native
  sealed trait unlink
    extends StObject
       with WatchEvents
  inline def unlink: unlink = "unlink".asInstanceOf[unlink]
  
  @js.native
  sealed trait unlinkDir
    extends StObject
       with WatchEvents
  inline def unlinkDir: unlinkDir = "unlinkDir".asInstanceOf[unlinkDir]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
