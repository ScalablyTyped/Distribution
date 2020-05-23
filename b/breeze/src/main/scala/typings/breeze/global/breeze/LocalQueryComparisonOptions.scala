package typings.breeze.global.breeze

import typings.breeze.anon.IsCaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.LocalQueryComparisonOptions")
@js.native
class LocalQueryComparisonOptions protected ()
  extends typings.breeze.breeze.LocalQueryComparisonOptions {
  def this(config: IsCaseSensitive) = this()
  /* CompleteClass */
  override def setAsDefault(): Unit = js.native
}

/* static members */
@JSGlobal("breeze.LocalQueryComparisonOptions")
@js.native
object LocalQueryComparisonOptions extends js.Object {
  var caseInsensitiveSQL: typings.breeze.breeze.LocalQueryComparisonOptions = js.native
  var defaultInstance: typings.breeze.breeze.LocalQueryComparisonOptions = js.native
}

