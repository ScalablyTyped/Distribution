package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends Node {
  var body: js.Array[Statement | ModuleDeclaration]
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var sourceType: babelDashTypesLib.babelDashTypesLibStrings.script | babelDashTypesLib.babelDashTypesLibStrings.module
  @JSName("type")
  var type_Program: babelDashTypesLib.babelDashTypesLibStrings.Program
}

