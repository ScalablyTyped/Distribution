package typings.cfnResponse

import typings.cfnResponse.mod.ResponseStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfnResponseStrings {
  
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait FAILED extends ResponseStatus
  
  @js.native
  sealed trait SUCCESS extends ResponseStatus
}
