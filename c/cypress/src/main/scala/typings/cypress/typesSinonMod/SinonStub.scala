package typings.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonStub[TArgs /* <: js.Array[Any] */, TReturnValue]
  extends StObject
     with SinonSpy[TArgs, TReturnValue] {
  
  /**
    * Causes the original method wrapped into the stub to be called when none of the conditional stubs are matched.
    */
  def callThrough(): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to call the argument at the provided index as a callback function.
    * stub.callsArg(0); causes the stub to call the first argument as a callback.
    * If the argument at the provided index is not available or is not a function, a TypeError will be thrown.
    */
  def callsArg(index: Double): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param index
    */
  def callsArgAsync(index: Double): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Like stub.callsArg(index); but with an additional parameter to pass the this context.
    * @param index
    * @param context
    */
  def callsArgOn(index: Double, context: Any): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param index
    * @param context
    */
  def callsArgOnAsync(index: Double, context: Any): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Like above but with an additional parameter to pass the this context.
    * @param index
    * @param context
    * @param args
    */
  def callsArgOnWith(index: Double, context: Any, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    */
  def callsArgOnWithAsync(index: Double, context: Any, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Like callsArg, but with arguments to pass to the callback.
    * @param index
    * @param args
    */
  def callsArgWith(index: Double, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    */
  def callsArgWithAsync(index: Double, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Makes the stub call the provided @param func when invoked.
    * @param func
    */
  def callsFake(func: js.Function1[/* args */ TArgs, TReturnValue]): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Replaces a new getter for this stub.
    */
  def get(func: js.Function0[Any]): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Defines the behavior of the stub on the @param n call. Useful for testing sequential interactions.
    * There are methods onFirstCall, onSecondCall,onThirdCall to make stub definitions read more naturally.
    * onCall can be combined with all of the behavior defining methods in this section. In particular, it can be used together with withArgs.
    * @param n
    */
  def onCall(n: Double): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Alias for stub.onCall(0);
    */
  def onFirstCall(): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Alias for stub.onCall(1);
    */
  def onSecondCall(): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Alias for stub.onCall(2);
    */
  def onThirdCall(): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to return a Promise which rejects with an exception (Error).
    * When constructing the Promise, sinon uses the Promise.reject method.
    * You are responsible for providing a polyfill in environments which do not provide Promise.
    * The Promise library can be overwritten using the usingPromise method.
    * Since sinon@2.0.0
    */
  def rejects(): SinonStub[TArgs, TReturnValue] = js.native
  /**
    * Causes the stub to return a Promise which rejects with an exception of the provided type.
    * Since sinon@2.0.0
    */
  def rejects(errorType: String): SinonStub[TArgs, TReturnValue] = js.native
  /**
    * Causes the stub to return a Promise which rejects with the provided exception object.
    * Since sinon@2.0.0
    */
  def rejects(value: Any): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Resets both behaviour and history of the stub.
    * This is equivalent to calling both stub.resetBehavior() and stub.resetHistory()
    * Updated in sinon@2.0.0
    * Since sinon@5.0.0
    * As a convenience, you can apply stub.reset() to all stubs using sinon.reset()
    */
  def reset(): Unit = js.native
  
  /**
    * Resets the stub’s behaviour to the default behaviour
    * You can reset behaviour of all stubs using sinon.resetBehavior()
    */
  def resetBehavior(): Unit = js.native
  
  /**
    * Causes the stub to return a Promise which resolves to the provided value.
    * When constructing the Promise, sinon uses the Promise.resolve method.
    * You are responsible for providing a polyfill in environments which do not provide Promise.
    * The Promise library can be overwritten using the usingPromise method.
    * Since sinon@2.0.0
    */
  def resolves(): SinonStub[TArgs, TReturnValue] = js.native
  def resolves(
    value: /* import warning: importer.ImportType#apply Failed type conversion: TReturnValue extends std.PromiseLike<infer TResolveValue> ? TResolveValue : any */ js.Any
  ): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to return a Promise which resolves to the argument at the provided index.
    * stub.resolvesArg(0); causes the stub to return a Promise which resolves to the first argument.
    * If the argument at the provided index is not available, a TypeError will be thrown.
    */
  def resolvesArg(index: Double): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to return a Promise which resolves to its this value.
    */
  def resolvesThis(): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Makes the stub return the provided @param obj value.
    * @param obj
    */
  def returns(obj: TReturnValue): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to return the argument at the provided @param index.
    * stub.returnsArg(0); causes the stub to return the first argument.
    * If the argument at the provided index is not available, prior to sinon@6.1.2, an undefined value will be returned;
    * starting from sinon@6.1.2, a TypeError will be thrown.
    * @param index
    */
  def returnsArg(index: Double): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to return its this value.
    * Useful for stubbing jQuery-style fluent APIs.
    */
  def returnsThis(): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Defines a new setter for this stub.
    * @param func
    */
  def set(func: js.Function1[/* v */ Any, Unit]): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to throw an exception (Error).
    * @param type
    */
  def throws(): SinonStub[TArgs, TReturnValue] = js.native
  /**
    * Causes the stub to throw the provided exception object.
    */
  def throws(obj: Any): SinonStub[TArgs, TReturnValue] = js.native
  def throws(`type`: String): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to throw the argument at the provided index.
    * stub.throwsArg(0); causes the stub to throw the first argument as the exception.
    * If the argument at the provided index is not available, a TypeError will be thrown.
    * Since sinon@2.3.0
    * @param index
    */
  def throwsArg(index: Double): SinonStub[TArgs, TReturnValue] = js.native
  
  def throwsException(): SinonStub[TArgs, TReturnValue] = js.native
  def throwsException(obj: Any): SinonStub[TArgs, TReturnValue] = js.native
  def throwsException(`type`: String): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the stub to return promises using a specific Promise library instead of the global one when using stub.rejects or stub.resolves.
    * Returns the stub to allow chaining.
    */
  def usingPromise(promiseLibrary: Any): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Defines a new value for this stub.
    * @param val
    */
  def value(`val`: Any): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Similar to callsArg.
    * Causes the stub to call the first callback it receives with the provided arguments (if any).
    * If a method accepts more than one callback, you need to use callsArg to have the stub invoke other callbacks than the first one.
    */
  def yields(args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param args
    */
  def yieldsAsync(args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Like above but with an additional parameter to pass the this context.
    */
  def yieldsOn(context: Any, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param context
    * @param args
    */
  def yieldsOnAsync(context: Any, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  def yieldsRight(args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Causes the spy to invoke a callback passed as a property of an object to the spy.
    * Like yields, yieldsTo grabs the first matching argument, finds the callback and calls it with the (optional) arguments.
    * @param property
    * @param args
    */
  def yieldsTo(property: String, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param property
    * @param args
    */
  def yieldsToAsync(property: String, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Like above but with an additional parameter to pass the this context.
    */
  def yieldsToOn(property: String, context: Any, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
  
  /**
    * Same as their corresponding non-Async counterparts, but with callback being deferred at called after all instructions in the current call stack are processed.
    * In Node environment the callback is deferred with process.nextTick.
    * In a browser the callback is deferred with setTimeout(callback, 0).
    * @param property
    * @param context
    * @param args
    */
  def yieldsToOnAsync(property: String, context: Any, args: Any*): SinonStub[TArgs, TReturnValue] = js.native
}
