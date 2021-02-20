package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipipelinecontextMod {
  
  @js.native
  trait IPipelineContext extends StObject {
    
    /** @hidden */
    def _getFragmentShaderCode(): String | Null = js.native
    
    /** @hidden */
    def _getVertexShaderCode(): String | Null = js.native
    
    /** @hidden */
    def _handlesSpectorRebuildCallback(onCompiled: js.Function1[/* compiledObject */ js.Any, Unit]): Unit = js.native
    
    /**
      * Gets a boolean indicating that this pipeline context is supporting asynchronous creating
      */
    var isAsync: Boolean = js.native
    
    /**
      * Gets a boolean indicating that the context is ready to be used (like shaders / pipelines are compiled and ready for instance)
      */
    var isReady: Boolean = js.native
  }
  object IPipelineContext {
    
    @scala.inline
    def apply(
      _getFragmentShaderCode: () => String | Null,
      _getVertexShaderCode: () => String | Null,
      _handlesSpectorRebuildCallback: js.Function1[/* compiledObject */ js.Any, Unit] => Unit,
      isAsync: Boolean,
      isReady: Boolean
    ): IPipelineContext = {
      val __obj = js.Dynamic.literal(_getFragmentShaderCode = js.Any.fromFunction0(_getFragmentShaderCode), _getVertexShaderCode = js.Any.fromFunction0(_getVertexShaderCode), _handlesSpectorRebuildCallback = js.Any.fromFunction1(_handlesSpectorRebuildCallback), isAsync = isAsync.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPipelineContext]
    }
    
    @scala.inline
    implicit class IPipelineContextMutableBuilder[Self <: IPipelineContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getFragmentShaderCode(value: () => String | Null): Self = StObject.set(x, "_getFragmentShaderCode", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_getVertexShaderCode(value: () => String | Null): Self = StObject.set(x, "_getVertexShaderCode", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_handlesSpectorRebuildCallback(value: js.Function1[/* compiledObject */ js.Any, Unit] => Unit): Self = StObject.set(x, "_handlesSpectorRebuildCallback", js.Any.fromFunction1(value))
    }
  }
}
