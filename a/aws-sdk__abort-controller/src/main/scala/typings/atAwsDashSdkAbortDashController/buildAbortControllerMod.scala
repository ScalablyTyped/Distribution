package typings.atAwsDashSdkAbortDashController

import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/abort-controller/build/AbortController", JSImport.Namespace)
@js.native
object buildAbortControllerMod extends js.Object {
  @js.native
  class AbortController ()
    extends typings.atAwsDashSdkTypes.buildAbortMod.AbortController {
    /**
      * An object that reports whether the action associated with this
      * {AbortController} has been cancelled.
      */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
    /**
      * Declares the operation associated with this AbortController to have been
      * cancelled.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
  }
  
}

