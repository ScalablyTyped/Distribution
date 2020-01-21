package typings.broccoliNodeApi.mod

import typings.broccoliNodeApi.AnonCachePath
import typings.broccoliNodeApi.broccoliNodeApiStrings.source
import typings.broccoliNodeApi.broccoliNodeApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.broccoliNodeApi.mod.SourceNodeInfo
  - typings.broccoliNodeApi.mod.TransformNodeInfo
*/
trait NodeInfo extends js.Object

object NodeInfo {
  @scala.inline
  def SourceNodeInfo(
    instantiationStack: String,
    name: String,
    nodeType: source,
    sourceDirectory: String,
    watched: Boolean,
    annotation: String = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], sourceDirectory = sourceDirectory.asInstanceOf[js.Any], watched = watched.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
  @scala.inline
  def TransformNodeInfo(
    getCallbackObject: () => CallbackObject,
    inputNodes: js.Array[InputNode],
    instantiationStack: String,
    name: String,
    needsCache: Boolean,
    nodeType: transform,
    persistentOutput: Boolean,
    setup: (FeatureSet, AnonCachePath) => Unit,
    trackInputChanges: Boolean,
    volatile: Boolean,
    annotation: String = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal(getCallbackObject = js.Any.fromFunction0(getCallbackObject), inputNodes = inputNodes.asInstanceOf[js.Any], instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsCache = needsCache.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], persistentOutput = persistentOutput.asInstanceOf[js.Any], setup = js.Any.fromFunction2(setup), trackInputChanges = trackInputChanges.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

