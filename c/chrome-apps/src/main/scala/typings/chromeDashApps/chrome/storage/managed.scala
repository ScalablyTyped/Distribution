package typings.chromeDashApps.chrome.storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Items in the managed storage area are set by the domain administrator,
  * and are read-only for the extension; trying to modify this namespace
  * results in an error.
  * @since Chrome 33.
  */
@JSGlobal("chrome.storage.managed")
@js.native
object managed extends TopLevel[ManagedStorageArea]

