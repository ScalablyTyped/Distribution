package typings
package countryDashListLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("country-list", JSImport.Namespace)
@js.native
object countryDashListMod extends js.Object {
  def getCode(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getCodeList(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getCodes(): js.Array[java.lang.String] = js.native
  def getData(): js.Array[countryDashListLib.Anon_Code] = js.native
  def getName(code: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getNameList(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getNames(): js.Array[java.lang.String] = js.native
  def overwrite(countries: js.Array[countryDashListLib.Anon_Code]): scala.Unit = js.native
}

