package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkTileMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClamp extends js.Object {
  var Clamp: SkTileMode
  var Decal: SkTileMode
  var Mirror: SkTileMode
  var Repeat: SkTileMode
}

object AnonClamp {
  @scala.inline
  def apply(Clamp: SkTileMode, Decal: SkTileMode, Mirror: SkTileMode, Repeat: SkTileMode): AnonClamp = {
    val __obj = js.Dynamic.literal(Clamp = Clamp.asInstanceOf[js.Any], Decal = Decal.asInstanceOf[js.Any], Mirror = Mirror.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClamp]
  }
}

