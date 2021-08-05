package typings.cfnResponse

import typings.cfnResponse.mod.ResponseStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfnResponseStrings {
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ResponseStatus
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with ResponseStatus
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
}
