package typings.blueprintjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "AbstractComponent")
@js.native
abstract class AbstractComponent[P, S] ()
  extends typings.blueprintjsCore.commonMod.AbstractComponent[P, S] {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
  def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
}

