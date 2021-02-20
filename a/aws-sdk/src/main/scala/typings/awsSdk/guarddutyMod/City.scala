package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait City extends StObject {
  
  /**
    * The city name of the remote IP address.
    */
  var CityName: js.UndefOr[String] = js.native
}
object City {
  
  @scala.inline
  def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit class CityMutableBuilder[Self <: City] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCityName(value: String): Self = StObject.set(x, "CityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNameUndefined: Self = StObject.set(x, "CityName", js.undefined)
  }
}
