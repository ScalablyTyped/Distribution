package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendIsoFSMod.IsoFS
import typings.browserfs.distNodeBackendIsoFSMod.IsoFSOptions
import typings.browserfs.distNodeBackendIsoFSMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassIsoFS
  extends Instantiable1[/* data */ Buffer, default]
     with Instantiable2[/* data */ Buffer, /* name */ String, default]
     with Instantiable3[/* data */ Buffer, /* name */ String, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an IsoFS instance with the given options.
    */
  def Create(opts: IsoFSOptions, cb: BFSCallback[IsoFS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

