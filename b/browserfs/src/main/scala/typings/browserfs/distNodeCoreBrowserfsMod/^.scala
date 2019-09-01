package typings.browserfs.distNodeCoreBrowserfsMod

import typings.browserfs.TypeofBFSUtils
import typings.browserfs.Typeofbuffer
import typings.browserfs.Typeofpath
import typings.browserfs.browserfsStrings.bfs_utils
import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.fs
import typings.browserfs.browserfsStrings.path
import typings.browserfs.browserfsStrings.process
import typings.browserfs.distNodeCoreFSMod.FSModule
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemConstructor
import typings.node.NodeJSNs.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var setImmediate: js.Function1[/* cb */ js.Function, js.Any] = js.native
  def BFSRequire(module: String): js.Any = js.native
  @JSName("BFSRequire")
  def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = js.native
  @JSName("BFSRequire")
  def BFSRequire_buffer(module: buffer): Typeofbuffer = js.native
  @JSName("BFSRequire")
  def BFSRequire_fs(module: fs): FSModule = js.native
  @JSName("BFSRequire")
  def BFSRequire_path(module: path): Typeofpath = js.native
  @JSName("BFSRequire")
  def BFSRequire_process(module: process): Process = js.native
  def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
  def getFileSystem(
    config: FileSystemConfiguration,
    cb: BFSCallback[typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem]
  ): Unit = js.native
  def initialize(rootfs: typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem): typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem = js.native
  def install(obj: js.Any): Unit = js.native
  def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = js.native
}

