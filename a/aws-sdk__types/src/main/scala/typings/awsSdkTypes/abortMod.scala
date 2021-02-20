package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortMod {
  
  @js.native
  trait AbortController extends StObject {
    
    /**
      * Declares the operation associated with this AbortController to have been
      * cancelled.
      */
    def abort(): Unit = js.native
    
    /**
      * An object that reports whether the action associated with this
      * {AbortController} has been cancelled.
      */
    val signal: AbortSignal = js.native
  }
  object AbortController {
    
    @scala.inline
    def apply(abort: () => Unit, signal: AbortSignal): AbortController = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortController]
    }
    
    @scala.inline
    implicit class AbortControllerMutableBuilder[Self <: AbortController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type AbortHandler = js.ThisFunction1[/* this */ AbortSignal, /* ev */ js.Any, js.Any]
  
  @js.native
  trait AbortSignal extends StObject {
    
    /**
      * Whether the action represented by this signal has been cancelled.
      */
    val aborted: Boolean = js.native
    
    /**
      * A function to be invoked when the action represented by this signal has
      * been cancelled.
      */
    var onabort: AbortHandler | Null = js.native
  }
  object AbortSignal {
    
    @scala.inline
    def apply(aborted: Boolean): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortSignal]
    }
    
    @scala.inline
    implicit class AbortSignalMutableBuilder[Self <: AbortSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabort(value: AbortHandler): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnabortNull: Self = StObject.set(x, "onabort", null)
    }
  }
}
