package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSInterfaceBody extends Node {
  var body: js.Array[TSTypeElement] = js.native
  @JSName("type")
  var type_TSInterfaceBody: typings.babelTypes.babelTypesStrings.TSInterfaceBody = js.native
}

@JSImport("babel-types", "TSInterfaceBody")
@js.native
object TSInterfaceBody extends js.Object {
  def apply(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
}

