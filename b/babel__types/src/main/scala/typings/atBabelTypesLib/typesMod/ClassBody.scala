package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody extends BaseNode {
  var body: js.Array[
    ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
  ]
  @JSName("type")
  var type_ClassBody: atBabelTypesLib.atBabelTypesLibStrings.ClassBody
}

