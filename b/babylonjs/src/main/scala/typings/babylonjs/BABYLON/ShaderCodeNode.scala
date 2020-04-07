package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ShaderCodeNode")
@js.native
class ShaderCodeNode () extends js.Object {
  var additionalDefineKey: js.UndefOr[String] = js.native
  var additionalDefineValue: js.UndefOr[String] = js.native
  var children: js.Array[ShaderCodeNode] = js.native
  var line: String = js.native
  def isValid(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  def process(preprocessors: org.scalablytyped.runtime.StringDictionary[String], options: ProcessingOptions): String = js.native
}

