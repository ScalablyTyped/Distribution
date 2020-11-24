package typings.babylonjs.ipipelinecontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPipelineContext extends js.Object {
  
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
  implicit class IPipelineContextOps[Self <: IPipelineContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_getFragmentShaderCode(value: () => String | Null): Self = this.set("_getFragmentShaderCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_getVertexShaderCode(value: () => String | Null): Self = this.set("_getVertexShaderCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_handlesSpectorRebuildCallback(value: js.Function1[/* compiledObject */ js.Any, Unit] => Unit): Self = this.set("_handlesSpectorRebuildCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAsync(value: Boolean): Self = this.set("isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
  }
}
