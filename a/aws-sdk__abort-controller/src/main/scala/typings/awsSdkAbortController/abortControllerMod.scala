package typings.awsSdkAbortController

import typings.awsSdkTypes.abortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortControllerMod {
  
  @JSImport("@aws-sdk/abort-controller/dist/cjs/AbortController", "AbortController")
  @js.native
  class AbortController ()
    extends StObject
       with typings.awsSdkTypes.abortMod.AbortController {
    
    /**
      * Declares the operation associated with this AbortController to have been
      * cancelled.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * An object that reports whether the action associated with this
      * {AbortController} has been cancelled.
      */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
  }
}
