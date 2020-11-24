package typings.broccoliNodeApi.mod

import typings.broccoliNodeApi.anon.CachePath
import typings.broccoliNodeApi.broccoliNodeApiStrings.transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformNodeInfo extends NodeInfoCommon[transform] {
  
  /**
    The Builder will call this function once after it has called `setup`. This
    function will not be called more than once throughout the lifetime of the
    node. The object returned must have a `build` property, which is the
    function that the builder will call on each rebuild:
    ```js
    var callbackObject = nodeInfo.getCallbackObject()
    // For each rebuild:
    callbackObject.build() // => promise
    ```
    Properties other than `.build` will be ignored.
    The `build` function is responsible for performing the node's main work. It
    may throw an exception, which will be reported as a build error by Broccoli.
    If the `build` function performs asynchronous work, it must return a promise
    that is resolved on completion of the asynchronous work, or rejected if
    there is an error. Return values other than promises are ignored.
    */
  def getCallbackObject(): CallbackObject = js.native
  
  /**
    Zero or more Broccoli nodes to be used as input to this node.
    */
  var inputNodes: js.Array[InputNode] = js.native
  
  /**
    If false, a cache directory will not be created. If true, a cache directory
    will be created and its path will be available as this.cachePath.
    */
  var needsCache: Boolean = js.native
  
  /**
    If false, then between rebuilds, the Builder will delete the outputPath
    directory recursively and recreate it as an empty directory. If true,
    the Builder will do nothing.
    */
  var persistentOutput: Boolean = js.native
  
  /**
    The `Builder` will call this function once before the first build. This
    function will not be called more than once throughout the lifetime of the
    node.
    @param features builder features
    @param options.inputPaths An array of paths corresponding to `NodeInfo.inputNodes`. When building,
    the node may read from these paths, but must never write to them.
    @param options.outputPath A path to an empty directory for the node to write its output to when
    building.
    @param options.cachePath A path to an empty directory for the node to store files it wants to
    keep around between builds. This directory will only be deleted when the
    Broccoli process terminates (for example, when the Broccoli server is
    restarted).
    If a `cachePath` is not needed/desired, a plugin can opt-out of its creation
    via the `needsCache` flag metioned below.
    */
  def setup(features: FeatureSet, options: CachePath): Unit = js.native
  
  /**
    If true, a change object will be passed to the build method which contains
    information about which input has changed since the last build. Defaults to false.
    */
  var trackInputChanges: Boolean = js.native
  
  /**
    If true, memoization will not be applied and the build method will always be 
    called regardless if the inputNodes have changed. Defaults to false.
    */
  var volatile: Boolean = js.native
}
object TransformNodeInfo {
  
  @scala.inline
  def apply(
    getCallbackObject: () => CallbackObject,
    inputNodes: js.Array[InputNode],
    instantiationStack: String,
    name: String,
    needsCache: Boolean,
    nodeType: transform,
    persistentOutput: Boolean,
    setup: (FeatureSet, CachePath) => Unit,
    trackInputChanges: Boolean,
    volatile: Boolean
  ): TransformNodeInfo = {
    val __obj = js.Dynamic.literal(getCallbackObject = js.Any.fromFunction0(getCallbackObject), inputNodes = inputNodes.asInstanceOf[js.Any], instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsCache = needsCache.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], persistentOutput = persistentOutput.asInstanceOf[js.Any], setup = js.Any.fromFunction2(setup), trackInputChanges = trackInputChanges.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformNodeInfo]
  }
  
  @scala.inline
  implicit class TransformNodeInfoOps[Self <: TransformNodeInfo] (val x: Self) extends AnyVal {
    
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
    def setGetCallbackObject(value: () => CallbackObject): Self = this.set("getCallbackObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputNodesVarargs(value: InputNode*): Self = this.set("inputNodes", js.Array(value :_*))
    
    @scala.inline
    def setInputNodes(value: js.Array[InputNode]): Self = this.set("inputNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsCache(value: Boolean): Self = this.set("needsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentOutput(value: Boolean): Self = this.set("persistentOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup(value: (FeatureSet, CachePath) => Unit): Self = this.set("setup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrackInputChanges(value: Boolean): Self = this.set("trackInputChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolatile(value: Boolean): Self = this.set("volatile", value.asInstanceOf[js.Any])
  }
}
