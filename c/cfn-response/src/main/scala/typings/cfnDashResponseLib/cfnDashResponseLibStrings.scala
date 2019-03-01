package typings
package cfnDashResponseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cfnDashResponseLibStrings {
  @js.native
  sealed trait FAILED
    extends cfnDashResponseLib.cfnDashResponseMod.ResponseStatus
  
  @js.native
  sealed trait SUCCESS
    extends cfnDashResponseLib.cfnDashResponseMod.ResponseStatus
  
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
}

