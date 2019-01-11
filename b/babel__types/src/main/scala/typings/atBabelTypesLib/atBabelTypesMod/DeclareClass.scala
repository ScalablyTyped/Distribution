package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareClass extends BaseNode {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | scala.Null
  var id: Identifier
  var implements: js.Array[ClassImplements] | scala.Null
  var mixins: js.Array[InterfaceExtends] | scala.Null
  var typeParameters: TypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_DeclareClass: atBabelTypesLib.atBabelTypesLibStrings.DeclareClass
}

