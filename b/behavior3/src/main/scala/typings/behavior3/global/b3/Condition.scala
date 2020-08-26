package typings.behavior3.global.b3

import typings.behavior3.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition is the base class for all condition nodes. Thus, if you want to
  * create new custom condition nodes, you need to inherit from this class.
  *
  */
@JSGlobal("b3.Condition")
@js.native
/**
  * Creates an instance of Condition.
  */
class Condition ()
  extends typings.behavior3.b3.BaseNode {
  def this(hasNameTitleProperties: Name) = this()
}

