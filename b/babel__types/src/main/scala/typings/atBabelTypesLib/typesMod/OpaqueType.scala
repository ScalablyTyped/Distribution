package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpaqueType extends BaseNode {
  var id: Identifier
  var impltype: FlowType
  var supertype: FlowType | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_OpaqueType: atBabelTypesLib.atBabelTypesLibStrings.OpaqueType
}

