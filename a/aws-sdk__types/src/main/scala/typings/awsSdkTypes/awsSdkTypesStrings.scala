package typings.awsSdkTypes

import typings.awsSdkTypes.loggerMod.LogLevel
import typings.awsSdkTypes.middlewareMod.Priority
import typings.awsSdkTypes.middlewareMod.Relation
import typings.awsSdkTypes.middlewareMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkTypesStrings {
  
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def build: build = "build".asInstanceOf[build]
  
  @scala.inline
  def byte: byte = "byte".asInstanceOf[byte]
  
  @scala.inline
  def deserialize: deserialize = "deserialize".asInstanceOf[deserialize]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def finalizeRequest: finalizeRequest = "finalizeRequest".asInstanceOf[finalizeRequest]
  
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def initialize: initialize = "initialize".asInstanceOf[initialize]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def serialize: serialize = "serialize".asInstanceOf[serialize]
  
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @scala.inline
  def uuid: uuid = "uuid".asInstanceOf[uuid]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait after extends Relation
  
  @js.native
  sealed trait all extends LogLevel
  
  @js.native
  sealed trait ascii extends js.Object
  
  @js.native
  sealed trait before extends Relation
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait boolean extends js.Object
  
  @js.native
  sealed trait build extends Step
  
  @js.native
  sealed trait byte extends js.Object
  
  @js.native
  sealed trait deserialize extends Step
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait finalizeRequest extends Step
  
  @js.native
  sealed trait high extends Priority
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait initialize extends Step
  
  @js.native
  sealed trait integer extends js.Object
  
  @js.native
  sealed trait latin1 extends js.Object
  
  @js.native
  sealed trait log extends LogLevel
  
  @js.native
  sealed trait long extends js.Object
  
  @js.native
  sealed trait low extends Priority
  
  @js.native
  sealed trait normal extends Priority
  
  @js.native
  sealed trait off extends LogLevel
  
  @js.native
  sealed trait serialize extends Step
  
  @js.native
  sealed trait short extends js.Object
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait timestamp extends js.Object
  
  @js.native
  sealed trait utf8 extends js.Object
  
  @js.native
  sealed trait uuid extends js.Object
  
  @js.native
  sealed trait warn extends LogLevel
}
