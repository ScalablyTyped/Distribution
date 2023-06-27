package typings.deferredAsyncIterator

import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Complete[NextValueType, ReturnValueType] extends StObject {
    
    /**
    	Provide a "done" value to the iterator which causes a [`for await...of`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of) loop to exit after all previous values have been iterated over. Any callback that was provided to `onCleanup` will be called. Returns a promise that resolves when all remaining values have been consumed.
    	*/
    def complete(): js.Promise[Unit] = js.native
    
    var iterator: AsyncIterator[NextValueType, ReturnValueType, NextValueType] = js.native
    
    /**
    	Provide the next value to the iterator. Returns a promise that resolves when the value is consumed.
    	*/
    def next(): js.Promise[Unit] = js.native
    def next(value: NextValueType): js.Promise[Unit] = js.native
    
    /**
    	Provide an error to the iterator. Returns a promise that resolves when the error is consumed.
    	*/
    def nextError(): js.Promise[Unit] = js.native
    def nextError(error: Any): js.Promise[Unit] = js.native
    
    /**
    	A promise that resolves when `.complete()` or `.return()` is called, or when `break` is called within a [`for await...of`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of) loop.
    	*/
    var onCleanup: js.Promise[Unit] = js.native
  }
}
