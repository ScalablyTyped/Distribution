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
  
  @scala.inline
  def PACKAGE: PACKAGE = "package".asInstanceOf[PACKAGE]
  @scala.inline
  def bundle: bundle = "bundle".asInstanceOf[bundle]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def transform: transform = "transform".asInstanceOf[transform]
}

