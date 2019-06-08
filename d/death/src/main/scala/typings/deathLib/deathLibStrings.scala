package typings
package deathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object deathLibStrings {
  @js.native
  sealed trait SIGHUP extends js.Object
  
  @js.native
  sealed trait SIGINT extends js.Object
  
  @js.native
  sealed trait SIGQUIT extends js.Object
  
  @js.native
  sealed trait SIGTERM extends js.Object
  
  @js.native
  sealed trait uncaughtException extends js.Object
  
  @scala.inline
  def SIGHUP: SIGHUP = "SIGHUP".asInstanceOf[SIGHUP]
  @scala.inline
  def SIGINT: SIGINT = "SIGINT".asInstanceOf[SIGINT]
  @scala.inline
  def SIGQUIT: SIGQUIT = "SIGQUIT".asInstanceOf[SIGQUIT]
  @scala.inline
  def SIGTERM: SIGTERM = "SIGTERM".asInstanceOf[SIGTERM]
  @scala.inline
  def uncaughtException: uncaughtException = "uncaughtException".asInstanceOf[uncaughtException]
}

