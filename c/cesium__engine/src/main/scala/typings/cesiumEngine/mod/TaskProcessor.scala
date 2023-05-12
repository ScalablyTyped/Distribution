package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.FallbackModulePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "TaskProcessor")
@js.native
open class TaskProcessor protected () extends StObject {
  def this(workerPath: String) = this()
  def this(workerPath: String, maximumActiveTasks: Double) = this()
  
  /**
    * Destroys this object.  This will immediately terminate the Worker.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    */
  def destroy(): Unit = js.native
  
  /**
    * Posts a message to a web worker with configuration to initialize loading
    * and compiling a web assembly module asychronously, as well as an optional
    * fallback JavaScript module to use if Web Assembly is not supported.
    * @param [webAssemblyOptions] - An object with the following properties:
    * @param [webAssemblyOptions.modulePath] - The path of the web assembly JavaScript wrapper module.
    * @param [webAssemblyOptions.wasmBinaryFile] - The path of the web assembly binary file.
    * @param [webAssemblyOptions.fallbackModulePath] - The path of the fallback JavaScript module to use if web assembly is not supported.
    * @returns A promise that resolves to the result when the web worker has loaded and compiled the web assembly module and is ready to process tasks.
    */
  def initWebAssemblyModule(): js.Promise[js.Object] = js.native
  def initWebAssemblyModule(webAssemblyOptions: FallbackModulePath): js.Promise[js.Object] = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Schedule a task to be processed by the web worker asynchronously.  If there are currently more
    * tasks active than the maximum set by the constructor, will immediately return undefined.
    * Otherwise, returns a promise that will resolve to the result posted back by the worker when
    * finished.
    * @example
    * const taskProcessor = new Cesium.TaskProcessor('myWorkerPath');
    * const promise = taskProcessor.scheduleTask({
    *     someParameter : true,
    *     another : 'hello'
    * });
    * if (!Cesium.defined(promise)) {
    *     // too many active tasks - try again later
    * } else {
    *     promise.then(function(result) {
    *         // use the result of the task
    *     });
    * }
    * @param parameters - Any input data that will be posted to the worker.
    * @param [transferableObjects] - An array of objects contained in parameters that should be
    *                                      transferred to the worker instead of copied.
    * @returns Either a promise that will resolve to the result when available, or undefined
    *                    if there are too many active tasks,
    */
  def scheduleTask(parameters: Any): js.UndefOr[js.Promise[js.Object]] = js.native
  def scheduleTask(parameters: Any, transferableObjects: js.Array[js.Object]): js.UndefOr[js.Promise[js.Object]] = js.native
}
