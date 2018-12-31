package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceDeclaration extends BaseNode {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | scala.Null
  var id: Identifier
  var implements: js.Array[ClassImplements] | scala.Null
  var mixins: js.Array[InterfaceExtends] | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_InterfaceDeclaration: atBabelTypesLib.atBabelTypesLibStrings.InterfaceDeclaration
}

