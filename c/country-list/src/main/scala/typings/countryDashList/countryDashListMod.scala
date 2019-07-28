package typings.countryDashList

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("country-list", JSImport.Namespace)
@js.native
object countryDashListMod extends js.Object {
  def getCode(name: String): js.UndefOr[String] = js.native
  def getCodeList(): StringDictionary[String] = js.native
  def getCodes(): js.Array[String] = js.native
  def getData(): js.Array[Anon_Code] = js.native
  def getName(code: String): js.UndefOr[String] = js.native
  def getNameList(): StringDictionary[String] = js.native
  def getNames(): js.Array[String] = js.native
  def overwrite(countries: js.Array[Anon_Code]): Unit = js.native
}

