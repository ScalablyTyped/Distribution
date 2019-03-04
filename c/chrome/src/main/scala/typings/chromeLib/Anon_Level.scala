package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  def releaseKeepAwake(): scala.Unit
  def requestKeepAwake(level: java.lang.String): scala.Unit
}

object Anon_Level {
  @scala.inline
  def apply(
    releaseKeepAwake: js.Function0[scala.Unit],
    requestKeepAwake: js.Function1[java.lang.String, scala.Unit]
  ): Anon_Level = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = releaseKeepAwake, requestKeepAwake = requestKeepAwake)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

