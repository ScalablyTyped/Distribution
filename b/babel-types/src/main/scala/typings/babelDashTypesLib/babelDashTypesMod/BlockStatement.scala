package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement extends Node {
  var body: js.Array[Statement]
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  @JSName("type")
  var type_BlockStatement: babelDashTypesLib.babelDashTypesLibStrings.BlockStatement
}

