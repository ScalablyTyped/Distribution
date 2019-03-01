package typings
package atBabelTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelTypesMod {
  type Node = _Node | NumberLiteral | RegexLiteral | RestProperty | SpreadProperty
  type NumberLiteral = NumericLiteral
  type RegexLiteral = RegExpLiteral
  type RestProperty = RestElement
  type SpreadProperty = SpreadElement
  type TraversalAncestors = js.Array[atBabelTypesLib.Anon_Index]
  type TraversalHandler[T] = js.Function3[/* node */ Node, /* parent */ TraversalAncestors, /* type */ T, scala.Unit]
}
