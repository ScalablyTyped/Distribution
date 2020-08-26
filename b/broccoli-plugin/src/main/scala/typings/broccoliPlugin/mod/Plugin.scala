package typings.broccoliPlugin.mod

import typings.broccoliNodeApi.mod.CallbackObject
import typings.broccoliNodeApi.mod.FeatureSet
import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliNodeApi.mod.NodeCommon
import typings.broccoliNodeApi.mod.TransformNodeInfo
import typings.broccoliOutputWrapper.mod.FSOutput
import typings.broccoliPlugin.interfacesMod.MapSeriesIterator
import typings.fsMerger.mod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends NodeCommon[TransformNodeInfo] {
  var _annotation: js.Any = js.native
  var _baseConstructorCalled: js.Any = js.native
  var _checkOverrides: js.Any = js.native
  var _initializeReadCompat: js.Any = js.native
  var _inputNodes: js.Any = js.native
  var _instantiationStack: js.Any = js.native
  var _name: js.Any = js.native
  var _needsCache: js.Any = js.native
  var _persistentOutput: js.Any = js.native
  var _readCompat: js.Any = js.native
  var _readCompatError: js.Any = js.native
  var _setup: js.Any = js.native
  var _trackInputChanges: js.Any = js.native
  var _volatile: js.Any = js.native
  var builderFeatures: FeatureSet = js.native
  /**
    * The path on disk to an auxiliary cache directory.
    * Use this to store files that you want preserved between builds.
    * This directory will only be deleted when Broccoli exits. If a cache directory
    * is not needed, set needsCache to false when calling broccoli-plugin constructor.
    */
  var cachePath: js.UndefOr[String] = js.native
  var rebuild: js.Any = js.native
  def __broccoliGetInfo__(): TransformNodeInfo = js.native
  /**
    * Override this method in your subclass. It will be called on each (re-)build.
    *
    * This function will typically access the following read-only properties:
    *  this.inputPaths: An array of paths on disk corresponding to each node in inputNodes. Your plugin will read files from these paths.
    *  this.outputPath: The path on disk corresponding to this plugin instance (this node). Your plugin will write files to this path. This directory is emptied by Broccoli before each build, unless the persistentOutput options is true.
    *  this.cachePath: The path on disk to an auxiliary cache directory. Use this to store files that you want preserved between builds. This directory will only be deleted when Broccoli exits. If a cache directory is not needed, set needsCache to false when calling broccoli-plugin constructor.
    *
    * All paths stay the same between builds.
    * To perform asynchronous work, return a promise. The promise's eventual value is ignored (typically null).
    * To report a compile error, throw it or return a rejected promise.
    *
    * To help with displaying clear error messages for build errors, error objects may have the following optional properties in addition to the standard message property:
    *  file: Path of the file in which the error occurred, relative to one of the inputPaths directories
    *  treeDir: The path that file is relative to. Must be an element of this.inputPaths. (The name treeDir is for historical reasons.)
    *  line: Line in which the error occurred (one-indexed)
    *  column: Column in which the error occurred (zero-indexed)
    */
  def build(): js.Promise[Unit] | Unit = js.native
  def cleanup(): Unit = js.native
  /**
    * Return the object on which Broccoli will call obj.build(). Called once after instantiation.
    * By default, returns this. Plugins do not usually need to override this, but it can be useful
    * for base classes that other plugins in turn derive from, such as broccoli-caching-writer.
    *
    * @returns [[CallbackObject]]
    */
  def getCallbackObject(): CallbackObject = js.native
  def input: FS = js.native
  /**
    * An array of paths on disk corresponding to each node in inputNodes.
    * Your plugin will read files from these paths.
    */
  def inputPaths: js.Array[String] = js.native
  def output: FSOutput = js.native
  /**
    * The path on disk corresponding to this plugin instance (this node).
    * Your plugin will write files to this path. This directory is emptied by Broccoli before each build, unless the persistentOutput options is true.
    */
  def outputPath: String = js.native
  def read(readTree: MapSeriesIterator[InputNode]): js.UndefOr[js.Promise[String]] = js.native
}

