package typings.csvDashStringify

import typings.csvDashStringify.csvDashStringifyMod._RecordDelimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object csvDashStringifyStrings {
  @js.native
  sealed trait ascii extends _RecordDelimiter
  
  @js.native
  sealed trait auto extends _RecordDelimiter
  
  @js.native
  sealed trait mac extends _RecordDelimiter
  
  @js.native
  sealed trait unicode extends _RecordDelimiter
  
  @js.native
  sealed trait unix extends _RecordDelimiter
  
  @js.native
  sealed trait windows extends _RecordDelimiter
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
  @scala.inline
  def unix: unix = "unix".asInstanceOf[unix]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

