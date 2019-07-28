package typings.cfnDashResponse

import typings.cfnDashResponse.cfnDashResponseMod.ResponseStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cfnDashResponseStrings {
  @js.native
  sealed trait FAILED extends ResponseStatus
  
  @js.native
  sealed trait SUCCESS extends ResponseStatus
  
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
}

