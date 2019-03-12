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
  def apply(releaseKeepAwake: () => scala.Unit, requestKeepAwake: java.lang.String => scala.Unit): Anon_Level = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
  
    __obj.asInstanceOf[Anon_Level]
  }
}

