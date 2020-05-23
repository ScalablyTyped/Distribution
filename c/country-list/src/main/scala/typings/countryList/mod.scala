package typings.countryList

import org.scalablytyped.runtime.StringDictionary
import typings.countryList.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("country-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCode(name: String): js.UndefOr[String] = js.native
  def getCodeList(): StringDictionary[String] = js.native
  def getCodes(): js.Array[String] = js.native
  def getData(): js.Array[Code] = js.native
  def getName(code: String): js.UndefOr[String] = js.native
  def getNameList(): StringDictionary[String] = js.native
  def getNames(): js.Array[String] = js.native
  def overwrite(countries: js.Array[Code]): Unit = js.native
}

