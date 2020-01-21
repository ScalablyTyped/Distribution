package typings.browserHarness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object browserHarnessStrings {
  @js.native
  sealed trait consoleDoterror extends js.Object
  
  @js.native
  sealed trait consoleDotlog extends js.Object
  
  @js.native
  sealed trait consoleDotwarn extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait windowDotonerror extends js.Object
  
  @scala.inline
  def consoleDoterror: consoleDoterror = "console.error".asInstanceOf[consoleDoterror]
  @scala.inline
  def consoleDotlog: consoleDotlog = "console.log".asInstanceOf[consoleDotlog]
  @scala.inline
  def consoleDotwarn: consoleDotwarn = "console.warn".asInstanceOf[consoleDotwarn]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def windowDotonerror: windowDotonerror = "window.onerror".asInstanceOf[windowDotonerror]
}

