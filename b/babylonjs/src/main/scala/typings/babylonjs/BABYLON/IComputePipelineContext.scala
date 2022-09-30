package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComputePipelineContext extends StObject {
  
  /** @internal */
  def _getComputeShaderCode(): String | Null
  
  /** @internal */
  var _name: js.UndefOr[String] = js.undefined
  
  /** Releases the resources associated with the pipeline. */
  def dispose(): Unit
  
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  var isAsync: Boolean
  
  /**
    * Gets a boolean indicating that the context is ready to be used (like shader / pipeline are compiled and ready for instance)
    */
  var isReady: Boolean
}
object IComputePipelineContext {
  
  inline def apply(
    _getComputeShaderCode: () => String | Null,
    dispose: () => Unit,
    isAsync: Boolean,
    isReady: Boolean
  ): IComputePipelineContext = {
    val __obj = js.Dynamic.literal(_getComputeShaderCode = js.Any.fromFunction0(_getComputeShaderCode), dispose = js.Any.fromFunction0(dispose), isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComputePipelineContext]
  }
  
  extension [Self <: IComputePipelineContext](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def set_getComputeShaderCode(value: () => String | Null): Self = StObject.set(x, "_getComputeShaderCode", js.Any.fromFunction0(value))
    
    inline def set_name(value: String): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
