package typings.broccoliNodeApi

import org.scalablytyped.runtime.StringDictionary
import typings.broccoliNodeApi.anon.CachePath
import typings.broccoliNodeApi.broccoliNodeApiStrings.source
import typings.broccoliNodeApi.broccoliNodeApiStrings.transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait BuildChangeObject extends StObject {
    
    var changedNodes: js.Array[Boolean]
  }
  object BuildChangeObject {
    
    inline def apply(changedNodes: js.Array[Boolean]): BuildChangeObject = {
      val __obj = js.Dynamic.literal(changedNodes = changedNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildChangeObject]
    }
    
    extension [Self <: BuildChangeObject](x: Self) {
      
      inline def setChangedNodes(value: js.Array[Boolean]): Self = StObject.set(x, "changedNodes", value.asInstanceOf[js.Any])
      
      inline def setChangedNodesVarargs(value: Boolean*): Self = StObject.set(x, "changedNodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CallbackObject extends StObject {
    
    def build(): js.Promise[Unit] | Unit = js.native
    def build(buildChangeObject: BuildChangeObject): js.Promise[Unit] | Unit = js.native
  }
  
  trait FeatureSet
    extends StObject
       with /* feature */ StringDictionary[js.UndefOr[Boolean]] {
    
    var needsCacheFlag: js.UndefOr[Boolean] = js.undefined
    
    var persistentOutputFlag: js.UndefOr[Boolean] = js.undefined
    
    var sourceDirectories: js.UndefOr[Boolean] = js.undefined
  }
  object FeatureSet {
    
    inline def apply(): FeatureSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureSet]
    }
    
    extension [Self <: FeatureSet](x: Self) {
      
      inline def setNeedsCacheFlag(value: Boolean): Self = StObject.set(x, "needsCacheFlag", value.asInstanceOf[js.Any])
      
      inline def setNeedsCacheFlagUndefined: Self = StObject.set(x, "needsCacheFlag", js.undefined)
      
      inline def setPersistentOutputFlag(value: Boolean): Self = StObject.set(x, "persistentOutputFlag", value.asInstanceOf[js.Any])
      
      inline def setPersistentOutputFlagUndefined: Self = StObject.set(x, "persistentOutputFlag", js.undefined)
      
      inline def setSourceDirectories(value: Boolean): Self = StObject.set(x, "sourceDirectories", value.asInstanceOf[js.Any])
      
      inline def setSourceDirectoriesUndefined: Self = StObject.set(x, "sourceDirectories", js.undefined)
    }
  }
  
  type InputNode = Node | String
  
  /* Inlined broccoli-node-api.broccoli-node-api.NodeMap[broccoli-node-api.broccoli-node-api.NodeType] */
  /* Rewritten from type alias, can be one of: 
    - typings.broccoliNodeApi.broccoliNodeApiStrings.__broccoliFeatures__
    - typings.broccoliNodeApi.broccoliNodeApiStrings.__broccoliGetInfo__
  */
  trait Node extends StObject
  object Node {
    
    inline def __broccoliFeatures__ : typings.broccoliNodeApi.broccoliNodeApiStrings.__broccoliFeatures__ = "__broccoliFeatures__".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.__broccoliFeatures__]
    
    inline def __broccoliGetInfo__ : typings.broccoliNodeApi.broccoliNodeApiStrings.__broccoliGetInfo__ = "__broccoliGetInfo__".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.__broccoliGetInfo__]
  }
  
  trait NodeCommon[T /* <: NodeInfo */] extends StObject {
    
    /**
      The node's feature set, indicating the API version
      */
    var __broccoliFeatures__ : FeatureSet
    
    /**
      A function to be called by the Builder, taking the Builder's feature set as
      an argument and returning a `NodeInfo` object
      */
    def __broccoliGetInfo__(builderFeatures: FeatureSet): T
  }
  object NodeCommon {
    
    inline def apply[T /* <: NodeInfo */](__broccoliFeatures__ : FeatureSet, __broccoliGetInfo__ : FeatureSet => T): NodeCommon[T] = {
      val __obj = js.Dynamic.literal(__broccoliFeatures__ = __broccoliFeatures__.asInstanceOf[js.Any], __broccoliGetInfo__ = js.Any.fromFunction1(__broccoliGetInfo__))
      __obj.asInstanceOf[NodeCommon[T]]
    }
    
    extension [Self <: NodeCommon[?], T /* <: NodeInfo */](x: Self & NodeCommon[T]) {
      
      inline def set__broccoliFeatures__(value: FeatureSet): Self = StObject.set(x, "__broccoliFeatures__", value.asInstanceOf[js.Any])
      
      inline def set__broccoliGetInfo__(value: FeatureSet => T): Self = StObject.set(x, "__broccoliGetInfo__", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined broccoli-node-api.broccoli-node-api.NodeInfoMap[broccoli-node-api.broccoli-node-api.NodeType] */
  /* Rewritten from type alias, can be one of: 
    - typings.broccoliNodeApi.broccoliNodeApiStrings.needsCache
    - typings.broccoliNodeApi.broccoliNodeApiStrings.setup
    - typings.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject
    - typings.broccoliNodeApi.broccoliNodeApiStrings.volatile
    - typings.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges
    - typings.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput
    - typings.broccoliNodeApi.broccoliNodeApiStrings.inputNodes
    - typings.broccoliNodeApi.broccoliNodeApiStrings.watched
    - typings.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory
  */
  trait NodeInfo extends StObject
  object NodeInfo {
    
    inline def getCallbackObject: typings.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject = "getCallbackObject".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.getCallbackObject]
    
    inline def inputNodes: typings.broccoliNodeApi.broccoliNodeApiStrings.inputNodes = "inputNodes".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.inputNodes]
    
    inline def needsCache: typings.broccoliNodeApi.broccoliNodeApiStrings.needsCache = "needsCache".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.needsCache]
    
    inline def persistentOutput: typings.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput = "persistentOutput".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.persistentOutput]
    
    inline def setup: typings.broccoliNodeApi.broccoliNodeApiStrings.setup = "setup".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.setup]
    
    inline def sourceDirectory: typings.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory = "sourceDirectory".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.sourceDirectory]
    
    inline def trackInputChanges: typings.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges = "trackInputChanges".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.trackInputChanges]
    
    inline def volatile: typings.broccoliNodeApi.broccoliNodeApiStrings.volatile = "volatile".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.volatile]
    
    inline def watched: typings.broccoliNodeApi.broccoliNodeApiStrings.watched = "watched".asInstanceOf[typings.broccoliNodeApi.broccoliNodeApiStrings.watched]
  }
  
  trait NodeInfoCommon[T /* <: NodeType */] extends StObject {
    
    /**
      A description of this particular node. Useful to tell multiple instances of
      the same plugin apart during debugging. Example: `'vendor directories'`
      */
    var annotation: js.UndefOr[String | Null] = js.undefined
    
    /**
      A stack trace generated when the node constructor ran. Useful for telling
      where a given node was instantiated during debugging. This is `(new
      Error).stack` without the first line.
      */
    var instantiationStack: String
    
    /**
      The name of the plugin that this node is an instance of. Example:
      `'BroccoliMergeTrees'`
      */
    var name: String
    
    /**
      Either `'transform'` or `'source'`, indicating the node type.
      */
    var nodeType: T
  }
  object NodeInfoCommon {
    
    inline def apply[T /* <: NodeType */](instantiationStack: String, name: String, nodeType: T): NodeInfoCommon[T] = {
      val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeInfoCommon[T]]
    }
    
    extension [Self <: NodeInfoCommon[?], T /* <: NodeType */](x: Self & NodeInfoCommon[T]) {
      
      inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationNull: Self = StObject.set(x, "annotation", null)
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setInstantiationStack(value: String): Self = StObject.set(x, "instantiationStack", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: T): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeInfoMap extends StObject {
    
    var source: SourceNodeInfo
    
    var transform: TransformNodeInfo
  }
  object NodeInfoMap {
    
    inline def apply(source: SourceNodeInfo, transform: TransformNodeInfo): NodeInfoMap = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeInfoMap]
    }
    
    extension [Self <: NodeInfoMap](x: Self) {
      
      inline def setSource(value: SourceNodeInfo): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: TransformNodeInfo): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeMap extends StObject {
    
    var source: SourceNode
    
    var transform: TransformNode
  }
  object NodeMap {
    
    inline def apply(source: SourceNode, transform: TransformNode): NodeMap = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMap]
    }
    
    extension [Self <: NodeMap](x: Self) {
      
      inline def setSource(value: SourceNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: TransformNode): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.broccoliNodeApi.broccoliNodeApiStrings.source
    - typings.broccoliNodeApi.broccoliNodeApiStrings.transform
  */
  trait NodeType extends StObject
  
  type SourceNode = NodeCommon[SourceNodeInfo]
  
  trait SourceNodeInfo
    extends StObject
       with NodeInfoCommon[source] {
    
    /**
      A path to an existing directory on disk, relative to the current working directory.
      */
    var sourceDirectory: String
    
    /**
      If false, changed files in the sourceDirectory will not trigger rebuilds
      (though they might still be picked up by subsequent rebuilds). If true,
      instructs the Broccoli file system watcher to watch the sourceDirectory
      recursively and trigger a rebuild whenever a file changes.
      */
    var watched: Boolean
  }
  object SourceNodeInfo {
    
    inline def apply(instantiationStack: String, name: String, sourceDirectory: String, watched: Boolean): SourceNodeInfo = {
      val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = "source", sourceDirectory = sourceDirectory.asInstanceOf[js.Any], watched = watched.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceNodeInfo]
    }
    
    extension [Self <: SourceNodeInfo](x: Self) {
      
      inline def setSourceDirectory(value: String): Self = StObject.set(x, "sourceDirectory", value.asInstanceOf[js.Any])
      
      inline def setWatched(value: Boolean): Self = StObject.set(x, "watched", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformNode = NodeCommon[TransformNodeInfo]
  
  trait TransformNodeInfo
    extends StObject
       with NodeInfoCommon[transform] {
    
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
    def getCallbackObject(): CallbackObject
    
    /**
      Zero or more Broccoli nodes to be used as input to this node.
      */
    var inputNodes: js.Array[InputNode]
    
    /**
      If false, a cache directory will not be created. If true, a cache directory
      will be created and its path will be available as this.cachePath.
      */
    var needsCache: Boolean
    
    /**
      If false, then between rebuilds, the Builder will delete the outputPath
      directory recursively and recreate it as an empty directory. If true,
      the Builder will do nothing.
      */
    var persistentOutput: Boolean
    
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
    def setup(features: FeatureSet, options: CachePath): Unit
    
    /**
      If true, a change object will be passed to the build method which contains
      information about which input has changed since the last build. Defaults to false.
      */
    var trackInputChanges: Boolean
    
    /**
      If true, memoization will not be applied and the build method will always be 
      called regardless if the inputNodes have changed. Defaults to false.
      */
    var volatile: Boolean
  }
  object TransformNodeInfo {
    
    inline def apply(
      getCallbackObject: () => CallbackObject,
      inputNodes: js.Array[InputNode],
      instantiationStack: String,
      name: String,
      needsCache: Boolean,
      persistentOutput: Boolean,
      setup: (FeatureSet, CachePath) => Unit,
      trackInputChanges: Boolean,
      volatile: Boolean
    ): TransformNodeInfo = {
      val __obj = js.Dynamic.literal(getCallbackObject = js.Any.fromFunction0(getCallbackObject), inputNodes = inputNodes.asInstanceOf[js.Any], instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needsCache = needsCache.asInstanceOf[js.Any], nodeType = "transform", persistentOutput = persistentOutput.asInstanceOf[js.Any], setup = js.Any.fromFunction2(setup), trackInputChanges = trackInputChanges.asInstanceOf[js.Any], volatile = volatile.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformNodeInfo]
    }
    
    extension [Self <: TransformNodeInfo](x: Self) {
      
      inline def setGetCallbackObject(value: () => CallbackObject): Self = StObject.set(x, "getCallbackObject", js.Any.fromFunction0(value))
      
      inline def setInputNodes(value: js.Array[InputNode]): Self = StObject.set(x, "inputNodes", value.asInstanceOf[js.Any])
      
      inline def setInputNodesVarargs(value: InputNode*): Self = StObject.set(x, "inputNodes", js.Array(value :_*))
      
      inline def setNeedsCache(value: Boolean): Self = StObject.set(x, "needsCache", value.asInstanceOf[js.Any])
      
      inline def setPersistentOutput(value: Boolean): Self = StObject.set(x, "persistentOutput", value.asInstanceOf[js.Any])
      
      inline def setSetup(value: (FeatureSet, CachePath) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      inline def setTrackInputChanges(value: Boolean): Self = StObject.set(x, "trackInputChanges", value.asInstanceOf[js.Any])
      
      inline def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
    }
  }
}
