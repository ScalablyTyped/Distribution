package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression extends Node {
  var left: LVal
  var operator: babelDashTypesLib.babelDashTypesLibStrings.`=` | babelDashTypesLib.babelDashTypesLibStrings.`+=` | babelDashTypesLib.babelDashTypesLibStrings.`-=` | babelDashTypesLib.babelDashTypesLibStrings.`*=` | babelDashTypesLib.babelDashTypesLibStrings.`/=` | babelDashTypesLib.babelDashTypesLibStrings.`%=` | babelDashTypesLib.babelDashTypesLibStrings.`<<=` | babelDashTypesLib.babelDashTypesLibStrings.`>>=` | babelDashTypesLib.babelDashTypesLibStrings.`>>>=` | babelDashTypesLib.babelDashTypesLibStrings.`|=` | babelDashTypesLib.babelDashTypesLibStrings.`^=` | babelDashTypesLib.babelDashTypesLibStrings.`&=`
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: babelDashTypesLib.babelDashTypesLibStrings.AssignmentExpression
}

