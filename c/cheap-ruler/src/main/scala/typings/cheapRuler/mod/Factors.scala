package typings.cheapRuler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factors extends js.Object {
  
  var feet: Double = js.native
  
  var inches: Double = js.native
  
  var kilometers: Double = js.native
  
  var meters: Double = js.native
  
  var metres: Double = js.native
  
  var miles: Double = js.native
  
  var nauticalmiles: Double = js.native
  
  var yards: Double = js.native
}
object Factors {
  
  @scala.inline
  def apply(
    feet: Double,
    inches: Double,
    kilometers: Double,
    meters: Double,
    metres: Double,
    miles: Double,
    nauticalmiles: Double,
    yards: Double
  ): Factors = {
    val __obj = js.Dynamic.literal(feet = feet.asInstanceOf[js.Any], inches = inches.asInstanceOf[js.Any], kilometers = kilometers.asInstanceOf[js.Any], meters = meters.asInstanceOf[js.Any], metres = metres.asInstanceOf[js.Any], miles = miles.asInstanceOf[js.Any], nauticalmiles = nauticalmiles.asInstanceOf[js.Any], yards = yards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factors]
  }
  
  @scala.inline
  implicit class FactorsOps[Self <: Factors] (val x: Self) extends AnyVal {
    
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
    def setFeet(value: Double): Self = this.set("feet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInches(value: Double): Self = this.set("inches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKilometers(value: Double): Self = this.set("kilometers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeters(value: Double): Self = this.set("meters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetres(value: Double): Self = this.set("metres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiles(value: Double): Self = this.set("miles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNauticalmiles(value: Double): Self = this.set("nauticalmiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYards(value: Double): Self = this.set("yards", value.asInstanceOf[js.Any])
  }
}
