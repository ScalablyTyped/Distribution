package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement extends BaseNode {
  var block: BlockStatement
  var finalizer: BlockStatement | scala.Null
  var handler: CatchClause | scala.Null
  @JSName("type")
  var type_TryStatement: atBabelTypesLib.atBabelTypesLibStrings.TryStatement
}

