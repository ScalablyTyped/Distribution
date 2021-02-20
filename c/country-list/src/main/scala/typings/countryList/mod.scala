package typings.countryList

import org.scalablytyped.runtime.StringDictionary
import typings.countryList.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-list", "getCode")
  @js.native
  def getCode(name: String): js.UndefOr[String] = js.native
  
  @JSImport("country-list", "getCodeList")
  @js.native
  def getCodeList(): StringDictionary[String] = js.native
  
  @JSImport("country-list", "getCodes")
  @js.native
  def getCodes(): js.Array[String] = js.native
  
  @JSImport("country-list", "getData")
  @js.native
  def getData(): js.Array[Code] = js.native
  
  @JSImport("country-list", "getName")
  @js.native
  def getName(code: String): js.UndefOr[String] = js.native
  
  @JSImport("country-list", "getNameList")
  @js.native
  def getNameList(): StringDictionary[String] = js.native
  
  @JSImport("country-list", "getNames")
  @js.native
  def getNames(): js.Array[String] = js.native
  
  @JSImport("country-list", "overwrite")
  @js.native
  def overwrite(countries: js.Array[Code]): Unit = js.native
}
