package typings
package browserDashHarnessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object browserDashHarnessLibStrings {
  @js.native
  sealed trait consoleDOTerror extends js.Object
  
  @js.native
  sealed trait consoleDOTlog extends js.Object
  
  @js.native
  sealed trait consoleDOTwarn extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait windowDOTonerror extends js.Object
  
  @scala.inline
  def consoleDOTerror: consoleDOTerror = "console.error".asInstanceOf[consoleDOTerror]
  @scala.inline
  def consoleDOTlog: consoleDOTlog = "console.log".asInstanceOf[consoleDOTlog]
  @scala.inline
  def consoleDOTwarn: consoleDOTwarn = "console.warn".asInstanceOf[consoleDOTwarn]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def windowDOTonerror: windowDOTonerror = "window.onerror".asInstanceOf[windowDOTonerror]
}

