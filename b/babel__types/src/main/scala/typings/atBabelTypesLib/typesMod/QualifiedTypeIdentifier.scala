package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QualifiedTypeIdentifier extends BaseNode {
  var id: Identifier
  var qualification: Identifier | QualifiedTypeIdentifier
  @JSName("type")
  var type_QualifiedTypeIdentifier: atBabelTypesLib.atBabelTypesLibStrings.QualifiedTypeIdentifier
}

