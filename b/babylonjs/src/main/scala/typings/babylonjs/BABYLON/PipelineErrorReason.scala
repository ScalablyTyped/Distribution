package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipelineErrorReason extends StObject
@JSGlobal("BABYLON.PipelineErrorReason")
@js.native
object PipelineErrorReason extends StObject {
  
  @js.native
  sealed trait Internal
    extends StObject
       with PipelineErrorReason
  
  @js.native
  sealed trait Validation
    extends StObject
       with PipelineErrorReason
}
