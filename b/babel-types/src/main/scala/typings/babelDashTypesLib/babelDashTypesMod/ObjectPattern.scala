package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectPattern extends Node {
  var properties: js.Array[AssignmentProperty | RestProperty]
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ObjectPattern: babelDashTypesLib.babelDashTypesLibStrings.ObjectPattern
}

