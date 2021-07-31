package typings.awsSdkAbortController

import typings.awsSdkTypes.abortMod.AbortHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortSignalMod {
  
  @JSImport("@aws-sdk/abort-controller/dist/cjs/AbortSignal", "AbortSignal")
  @js.native
  class AbortSignal ()
    extends StObject
       with typings.awsSdkTypes.abortMod.AbortSignal {
    
    var _aborted: js.Any = js.native
    
    /**
      * Whether the action represented by this signal has been cancelled.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
    
    /**
      * A function to be invoked when the action represented by this signal has
      * been cancelled.
      */
    /* CompleteClass */
    var onabort: AbortHandler | Null = js.native
  }
}
