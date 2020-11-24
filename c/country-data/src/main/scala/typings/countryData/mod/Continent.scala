package typings.countryData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Continent extends js.Object {
  
  val countries: js.Array[Country] = js.native
  
  val name: String = js.native
  
  val regions: js.Array[String] = js.native
}
object Continent {
  
  @scala.inline
  def apply(countries: js.Array[Country], name: String, regions: js.Array[String]): Continent = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continent]
  }
  
  @scala.inline
  implicit class ContinentOps[Self <: Continent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountriesVarargs(value: Country*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[Country]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
  }
}
