package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPipelineContext extends StObject {
  
  /** @hidden */
  def _getFragmentShaderCode(): String | Null
  
  /** @hidden */
  def _getVertexShaderCode(): String | Null
  
  /** @hidden */
  def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit
  
  /**
    * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
    */
  var isAsync: Boolean
  
  /**
    * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
    */
  var isReady: Boolean
}
object IPipelineContext {
  
  inline def apply(
    _getFragmentShaderCode: () => String | Null,
    _getVertexShaderCode: () => String | Null,
    _handlesSpectorRebuildCallback: js.Function1[/* compiledObject */ js.Any, Unit] => Unit,
    isAsync: Boolean,
    isReady: Boolean
  ): IPipelineContext = {
    val __obj = js.Dynamic.literal(_getFragmentShaderCode = js.Any.fromFunction0(_getFragmentShaderCode), _getVertexShaderCode = js.Any.fromFunction0(_getVertexShaderCode), _handlesSpectorRebuildCallback = js.Any.fromFunction1(_handlesSpectorRebuildCallback), isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPipelineContext]
  }
  
  extension [Self <: IPipelineContext](x: Self) {
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def set_getFragmentShaderCode(value: () => String | Null): Self = StObject.set(x, "_getFragmentShaderCode", js.Any.fromFunction0(value))
    
    inline def set_getVertexShaderCode(value: () => String | Null): Self = StObject.set(x, "_getVertexShaderCode", js.Any.fromFunction0(value))
    
    inline def set_handlesSpectorRebuildCallback(value: js.Function1[/* compiledObject */ js.Any, Unit] => Unit): Self = StObject.set(x, "_handlesSpectorRebuildCallback", js.Any.fromFunction1(value))
  }
}
