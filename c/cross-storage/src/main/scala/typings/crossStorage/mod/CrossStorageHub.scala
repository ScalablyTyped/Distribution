package typings.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-storage", "CrossStorageHub")
@js.native
class CrossStorageHub () extends js.Object

/* static members */
@JSImport("cross-storage", "CrossStorageHub")
@js.native
object CrossStorageHub extends js.Object {
  /**
    * Accepts an array of objects with two keys: origin and allow. The value of origin is expected to be 
    * a RegExp, and allow, an array of strings. The cross storage hub is then initialized to accept requests 
    * from any of the matching origins, allowing access to the associated lists of methods. Methods may 
    * include any of: get, set, del, getKeys and clear. A 'ready' message is sent to the parent window once 
    * complete.
    */
  def init(subdomains: js.Array[SubDomain]): Unit = js.native
}

