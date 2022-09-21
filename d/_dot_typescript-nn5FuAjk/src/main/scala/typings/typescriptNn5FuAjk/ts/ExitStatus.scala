package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExitStatus extends StObject
@JSGlobal("ts.ExitStatus")
@js.native
object ExitStatus extends StObject {
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated
    extends StObject
       with ExitStatus
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped
    extends StObject
       with ExitStatus
  
  @js.native
  sealed trait InvalidProject_OutputsSkipped
    extends StObject
       with ExitStatus
  
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkipped
    extends StObject
       with ExitStatus
  
  /** @deprecated Use ProjectReferenceCycle_OutputsSkipped instead. */
  @js.native
  sealed trait ProjectReferenceCycle_OutputsSkupped
    extends StObject
       with ExitStatus
  
  @js.native
  sealed trait Success
    extends StObject
       with ExitStatus
}
