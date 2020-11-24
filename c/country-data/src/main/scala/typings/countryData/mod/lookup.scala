package typings.countryData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("country-data", "lookup")
@js.native
object lookup extends js.Object {
  
  def countries(query: js.Any): js.Array[Country] = js.native
  
  def currencies(query: js.Any): js.Array[Currency] = js.native
  
  def languages(query: js.Any): js.Array[Language] = js.native
}
