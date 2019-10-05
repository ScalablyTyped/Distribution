package typings.atAwsDashSdkAbortDashController

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/abort-controller/build/AbortSignal", JSImport.Namespace)
@js.native
object buildAbortSignalMod extends js.Object {
  @js.native
  class AbortSignal ()
    extends typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal {
    var _aborted: js.Any = js.native
    /**
      * Whether the action represented by this signal has been cancelled.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
  }
  
}

