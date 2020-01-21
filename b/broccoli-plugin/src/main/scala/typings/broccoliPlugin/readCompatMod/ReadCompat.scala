package typings.broccoliPlugin.readCompatMod

import typings.broccoliNodeApi.mod.CallbackObject
import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliNodeApi.mod.TransformNodeInfo
import typings.broccoliPlugin.interfacesMod.MapSeriesIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadCompat extends js.Object {
  var _priorBuildInputNodeOutputPaths: js.Any
  var cachePath: js.UndefOr[String] = js.undefined
  var callbackObject: CallbackObject
  var inputBasePath: String
  var inputPaths: js.Array[String]
  var outputPath: String
  var pluginInterface: TransformNodeInfo
  def cleanup(): Unit
  def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String]
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
    read: MapSeriesIterator[InputNode] => js.Promise[String],
    cachePath: String = null
  ): ReadCompat = {
    val __obj = js.Dynamic.literal(_priorBuildInputNodeOutputPaths = _priorBuildInputNodeOutputPaths.asInstanceOf[js.Any], callbackObject = callbackObject.asInstanceOf[js.Any], cleanup = js.Any.fromFunction0(cleanup), inputBasePath = inputBasePath.asInstanceOf[js.Any], inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], pluginInterface = pluginInterface.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadCompat]
  }
}

