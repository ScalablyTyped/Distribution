package typings.broccoliPlugin

import typings.broccoliNodeApi.mod.CallbackObject
import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliNodeApi.mod.TransformNodeInfo
import typings.broccoliPlugin.interfacesMod.MapSeriesIterator
import typings.broccoliPlugin.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readCompatMod {
  
  @JSImport("broccoli-plugin/dist/read_compat", JSImport.Default)
  @js.native
  class default protected () extends ReadCompat {
    def this(plugin: PluginWithDescription) = this()
  }
  
  @js.native
  trait PluginWithDescription extends ^ {
    
    var description: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ReadCompat extends StObject {
    
    var _priorBuildInputNodeOutputPaths: js.Any = js.native
    
    var cachePath: js.UndefOr[String] = js.native
    
    var callbackObject: CallbackObject = js.native
    
    def cleanup(): Unit = js.native
    
    var inputBasePath: String = js.native
    
    var inputPaths: js.Array[String] = js.native
    
    var outputPath: String = js.native
    
    var pluginInterface: TransformNodeInfo = js.native
    
    def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String] = js.native
  }
  object ReadCompat {
    
    @scala.inline
    def apply(
      _priorBuildInputNodeOutputPaths: js.Any,
      callbackObject: CallbackObject,
      cleanup: () => Unit,
      inputBasePath: String,
      inputPaths: js.Array[String],
      outputPath: String,
      pluginInterface: TransformNodeInfo,
      read: MapSeriesIterator[InputNode] => js.Promise[String]
    ): ReadCompat = {
      val __obj = js.Dynamic.literal(_priorBuildInputNodeOutputPaths = _priorBuildInputNodeOutputPaths.asInstanceOf[js.Any], callbackObject = callbackObject.asInstanceOf[js.Any], cleanup = js.Any.fromFunction0(cleanup), inputBasePath = inputBasePath.asInstanceOf[js.Any], inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], pluginInterface = pluginInterface.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[ReadCompat]
    }
    
    @scala.inline
    implicit class ReadCompatMutableBuilder[Self <: ReadCompat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      @scala.inline
      def setCallbackObject(value: CallbackObject): Self = StObject.set(x, "callbackObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanup(value: () => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInputBasePath(value: String): Self = StObject.set(x, "inputBasePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPaths(value: js.Array[String]): Self = StObject.set(x, "inputPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPathsVarargs(value: String*): Self = StObject.set(x, "inputPaths", js.Array(value :_*))
      
      @scala.inline
      def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginInterface(value: TransformNodeInfo): Self = StObject.set(x, "pluginInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: MapSeriesIterator[InputNode] => js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_priorBuildInputNodeOutputPaths(value: js.Any): Self = StObject.set(x, "_priorBuildInputNodeOutputPaths", value.asInstanceOf[js.Any])
    }
  }
}
