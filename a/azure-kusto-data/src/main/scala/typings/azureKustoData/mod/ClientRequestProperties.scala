package typings.azureKustoData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-kusto-data", "ClientRequestProperties")
@js.native
class ClientRequestProperties () extends js.Object {
  def this(options: js.Any) = this()
  def this(options: js.UndefOr[scala.Nothing], parameters: js.Any) = this()
  def this(options: js.Any, parameters: js.Any) = this()
  def clearOptions(): Unit = js.native
  def clearParameters(): Unit = js.native
  def getOption(name: String, defaultValue: js.Any): js.Any = js.native
  def getParameter(name: String, defaultValue: js.Any): js.Any = js.native
  def getTimeout(): js.Any = js.native
  def setOption(name: String, value: js.Any): Unit = js.native
  def setParameter(name: String, value: js.Any): Unit = js.native
  def setTimeout(timeoutMillis: js.Any): Unit = js.native
  def toJson(): js.Any = js.native
}

