package typings.cometd

import typings.cometd.mod.ConnectionType
import typings.cometd.mod.ReconnectAdvice
import typings.cometd.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cometdStrings {
  @js.native
  sealed trait `callback-polling` extends ConnectionType
  
  @js.native
  sealed trait connected extends Status
  
  @js.native
  sealed trait connecting extends Status
  
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait disconnected extends Status
  
  @js.native
  sealed trait disconnecting extends Status
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait flash extends ConnectionType
  
  @js.native
  sealed trait handshake extends ReconnectAdvice
  
  @js.native
  sealed trait handshaking extends Status
  
  @js.native
  sealed trait iframe extends ConnectionType
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait `long-polling` extends ConnectionType
  
  @js.native
  sealed trait none extends ReconnectAdvice
  
  @js.native
  sealed trait retry extends ReconnectAdvice
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def `callback-polling`: `callback-polling` = "callback-polling".asInstanceOf[`callback-polling`]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def flash: flash = "flash".asInstanceOf[flash]
  @scala.inline
  def handshake: handshake = "handshake".asInstanceOf[handshake]
  @scala.inline
  def handshaking: handshaking = "handshaking".asInstanceOf[handshaking]
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def `long-polling`: `long-polling` = "long-polling".asInstanceOf[`long-polling`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def retry: retry = "retry".asInstanceOf[retry]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

