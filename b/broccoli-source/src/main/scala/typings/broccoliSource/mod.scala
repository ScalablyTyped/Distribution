package typings.broccoliSource

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.broccoliNodeApi.mod.FeatureSet
import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliNodeApi.mod.NodeCommon
import typings.broccoliNodeApi.mod.SourceNode
import typings.broccoliNodeApi.mod.SourceNodeInfo
import typings.broccoliNodeApi.mod.TransformNode
import typings.broccoliSource.interfacesMod.ConstructorOptions
import typings.broccoliSource.interfacesMod.MapSeriesIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("broccoli-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Directory
    extends StObject
       with NodeCommon[SourceNodeInfo] {
    
    def __broccoliGetInfo__(): SourceNodeInfo = js.native
    
    /* private */ var _annotation: Any = js.native
    
    /* private */ var _directoryPath: Any = js.native
    
    /* private */ var _instantiationError: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _watched: Any = js.native
    
    def cleanup(): Unit = js.native
    
    def read(readTree: MapSeriesIterator[InputNode]): String | SourceNode | TransformNode | js.Promise[InputNode] = js.native
  }
  @JSImport("broccoli-source", "Directory")
  @js.native
  def Directory: Instantiable3[
    /* directoryPath */ String, 
    /* watched */ Boolean | String, 
    /* options */ js.UndefOr[ConstructorOptions], 
    Directory
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("broccoli-source", "Directory")
  @js.native
  open class DirectoryCls protected ()
    extends StObject
       with Directory {
    def this(directoryPath: String, watched: String) = this()
    def this(directoryPath: String, watched: Boolean) = this()
    def this(directoryPath: String, watched: String, options: ConstructorOptions) = this()
    def this(directoryPath: String, watched: Boolean, options: ConstructorOptions) = this()
    
    /**
      The node's feature set, indicating the API version
      */
    /* CompleteClass */
    var __broccoliFeatures__ : FeatureSet = js.native
    
    /**
      A function to be called by the Builder, taking the Builder's feature set as
      an argument and returning a `NodeInfo` object
      */
    /* CompleteClass */
    override def __broccoliGetInfo__(builderFeatures: FeatureSet): SourceNodeInfo = js.native
  }
  
  inline def Directory_=(
    x: Instantiable3[
      /* directoryPath */ String, 
      /* watched */ Boolean | String, 
      /* options */ js.UndefOr[ConstructorOptions], 
      Directory
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Directory")(x.asInstanceOf[js.Any])
  
  @JSImport("broccoli-source", "UnwatchedDir")
  @js.native
  def UnwatchedDir: Instantiable2[
    /* directoryPath */ String, 
    /* options */ js.UndefOr[ConstructorOptions], 
    UnwatchedDir
  ] = js.native
  type UnwatchedDir = Directory
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("broccoli-source", "UnwatchedDir")
  @js.native
  open class UnwatchedDirCls protected ()
    extends StObject
       with Directory {
    /**
      * Create a Broccoli node referring to a directory on disk.
      * The Broccoli watcher used by broccoli serve will not watch the directory
      * or any subdirectories, and will not trigger a rebuild whenever something changes.
      *
      * @param directoryPath
      * A path to a directory, absolute or relative, to the working directory.
      * @param options.annotation
      * A human-readable description for this node.
      * @param options.name
      * A human-readable name for this node.
      */
    def this(directoryPath: String) = this()
    def this(directoryPath: String, options: ConstructorOptions) = this()
    
    /**
      The node's feature set, indicating the API version
      */
    /* CompleteClass */
    var __broccoliFeatures__ : FeatureSet = js.native
    
    /**
      A function to be called by the Builder, taking the Builder's feature set as
      an argument and returning a `NodeInfo` object
      */
    /* CompleteClass */
    override def __broccoliGetInfo__(builderFeatures: FeatureSet): SourceNodeInfo = js.native
  }
  
  inline def UnwatchedDir_=(
    x: Instantiable2[
      /* directoryPath */ String, 
      /* options */ js.UndefOr[ConstructorOptions], 
      UnwatchedDir
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnwatchedDir")(x.asInstanceOf[js.Any])
  
  @JSImport("broccoli-source", "WatchedDir")
  @js.native
  def WatchedDir: Instantiable2[/* directoryPath */ String, /* options */ js.UndefOr[ConstructorOptions], WatchedDir] = js.native
  type WatchedDir = Directory
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("broccoli-source", "WatchedDir")
  @js.native
  open class WatchedDirCls protected ()
    extends StObject
       with Directory {
    /**
      * Create a Broccoli node referring to a directory on disk.
      * The Broccoli watcher used by broccoli serve will watch the directory
      * and all subdirectories, and trigger a rebuild whenever something changes.
      *
      * @param directoryPath
      * A path to a directory, either absolute, or relative to the working directory.
      * @param options.annotation
      * A human-readable description for this node.
      * @param options.name
      * A human-readable name for this node.
      */
    def this(directoryPath: String) = this()
    def this(directoryPath: String, options: ConstructorOptions) = this()
    
    /**
      The node's feature set, indicating the API version
      */
    /* CompleteClass */
    var __broccoliFeatures__ : FeatureSet = js.native
    
    /**
      A function to be called by the Builder, taking the Builder's feature set as
      an argument and returning a `NodeInfo` object
      */
    /* CompleteClass */
    override def __broccoliGetInfo__(builderFeatures: FeatureSet): SourceNodeInfo = js.native
  }
  
  inline def WatchedDir_=(
    x: Instantiable2[/* directoryPath */ String, /* options */ js.UndefOr[ConstructorOptions], WatchedDir]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WatchedDir")(x.asInstanceOf[js.Any])
}
