package typings
package coreDashObjectLib.coreDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreObject extends js.Object {
  // TODO restrict to `Record<string, unknown>` once we can restrict to 3.0+ on DT
  def init(): scala.Unit = js.native
  def init(options: stdLib.Record[java.lang.String, _]): scala.Unit = js.native
}

