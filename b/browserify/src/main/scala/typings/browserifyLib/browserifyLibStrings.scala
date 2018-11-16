package typings
package browserifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object browserifyLibStrings {
  @js.native
  sealed trait PACKAGE extends js.Object
  
  @js.native
  sealed trait bundle extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait transform extends js.Object
  
  def PACKAGE: PACKAGE = "package".asInstanceOf[PACKAGE]
  def bundle: bundle = "bundle".asInstanceOf[bundle]
  def file: file = "file".asInstanceOf[file]
  def reset: reset = "reset".asInstanceOf[reset]
  def transform: transform = "transform".asInstanceOf[transform]
}

