package typings.broccoliPlugin.readCompatMod

import typings.broccoliNodeApi.mod.CallbackObject
import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliNodeApi.mod.TransformNodeInfo
import typings.broccoliPlugin.interfacesMod.MapSeriesIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadCompat extends js.Object {
  var _priorBuildInputNodeOutputPaths: js.Any = js.native
  var cachePath: js.UndefOr[String] = js.native
  var callbackObject: CallbackObject = js.native
  var inputBasePath: String = js.native
  var inputPaths: js.Array[String] = js.native
  var outputPath: String = js.native
  var pluginInterface: TransformNodeInfo = js.native
  def cleanup(): Unit = js.native
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
  implicit class ReadCompatOps[Self <: ReadCompat] (val x: Self) extends AnyVal {
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
    def set_priorBuildInputNodeOutputPaths(value: js.Any): Self = this.set("_priorBuildInputNodeOutputPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackObject(value: CallbackObject): Self = this.set("callbackObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleanup(value: () => Unit): Self = this.set("cleanup", js.Any.fromFunction0(value))
    @scala.inline
    def setInputBasePath(value: String): Self = this.set("inputBasePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputPathsVarargs(value: String*): Self = this.set("inputPaths", js.Array(value :_*))
    @scala.inline
    def setInputPaths(value: js.Array[String]): Self = this.set("inputPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginInterface(value: TransformNodeInfo): Self = this.set("pluginInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: MapSeriesIterator[InputNode] => js.Promise[String]): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setCachePath(value: String): Self = this.set("cachePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePath: Self = this.set("cachePath", js.undefined)
  }
  
}

