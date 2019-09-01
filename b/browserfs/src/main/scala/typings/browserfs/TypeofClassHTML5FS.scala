package typings.browserfs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendHTML5FSMod.HTML5FS
import typings.browserfs.distNodeBackendHTML5FSMod.HTML5FSOptions
import typings.browserfs.distNodeBackendHTML5FSMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassHTML5FS
  extends Instantiable0[default]
     with Instantiable1[/* size */ Double, default]
     with Instantiable2[/* size */ Double, /* type */ Double, default]
     with Instantiable3[/* size */ Double, /* type */ Double, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an HTML5FS instance with the given options.
    */
  def Create(opts: HTML5FSOptions, cb: BFSCallback[HTML5FS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

