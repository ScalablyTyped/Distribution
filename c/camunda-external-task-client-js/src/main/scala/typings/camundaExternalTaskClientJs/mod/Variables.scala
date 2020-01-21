package typings.camundaExternalTaskClientJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camunda-external-task-client-js", "Variables")
@js.native
class Variables () extends js.Object {
  def get(variableName: String): Value = js.native
  def getAll(): js.Array[Value] = js.native
  def getAllTyped(): js.Array[TypedValue] = js.native
  def getTyped(variableName: String): TypedValue = js.native
  def set(variableName: String, value: Value): Variables = js.native
  def setAll(values: StringDictionary[Value]): Variables = js.native
  def setAllTyped(typedValues: StringDictionary[TypedValue]): Variables = js.native
  def setTyped(variableName: String, typedValue: TypedValue): Variables = js.native
}

