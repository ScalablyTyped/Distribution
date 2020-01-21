package typings.awsSdkAbortController

import typings.awsSdkTypes.abortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/abort-controller/build/AbortController", JSImport.Namespace)
@js.native
object abortControllerMod extends js.Object {
  @js.native
  class AbortController ()
    extends typings.awsSdkTypes.abortMod.AbortController {
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

