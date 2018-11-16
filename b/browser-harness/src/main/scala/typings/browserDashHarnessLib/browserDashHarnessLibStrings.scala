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
  
  def consoleDOTerror: consoleDOTerror = "console.error".asInstanceOf[consoleDOTerror]
  def consoleDOTlog: consoleDOTlog = "console.log".asInstanceOf[consoleDOTlog]
  def consoleDOTwarn: consoleDOTwarn = "console.warn".asInstanceOf[consoleDOTwarn]
  def ready: ready = "ready".asInstanceOf[ready]
  def windowDOTonerror: windowDOTonerror = "window.onerror".asInstanceOf[windowDOTonerror]
}

