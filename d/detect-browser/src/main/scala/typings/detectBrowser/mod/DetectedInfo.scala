package typings.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedInfo[N /* <: String */, O, V] extends js.Object {
  val name: N
  val os: O
  val version: V
}

object DetectedInfo {
  @scala.inline
  def apply[/* <: java.lang.String */ N, O, V](name: N, os: O, version: V): DetectedInfo[N, O, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedInfo[N, O, V]]
  }
}

