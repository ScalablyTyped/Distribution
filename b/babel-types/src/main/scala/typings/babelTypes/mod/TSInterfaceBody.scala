package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceBody extends Node {
  var body: js.Array[TSTypeElement]
  @JSName("type")
  var type_TSInterfaceBody: typings.babelTypes.babelTypesStrings.TSInterfaceBody
}

@JSImport("babel-types", "TSInterfaceBody")
@js.native
object TSInterfaceBody extends js.Object {
  def apply(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
}

