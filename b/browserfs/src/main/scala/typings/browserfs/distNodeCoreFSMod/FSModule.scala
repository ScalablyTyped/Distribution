package typings.browserfs.distNodeCoreFSMod

import typings.browserfs.TypeofClassFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSModule extends FS {
  /**
    * The FS constructor.
    */
  var FS: TypeofClassFS = js.native
  /**
    * Set the FS object backing the fs module.
    */
  def changeFSModule(newFs: FS): Unit = js.native
  /**
    * Retrieve the FS object backing the fs module.
    */
  def getFSModule(): FS = js.native
}

