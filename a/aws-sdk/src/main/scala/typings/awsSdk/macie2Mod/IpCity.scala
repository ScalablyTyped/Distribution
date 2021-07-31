package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpCity extends StObject {
  
  /**
    * The name of the city.
    */
  var name: js.UndefOr[string] = js.undefined
}
object IpCity {
  
  @scala.inline
  def apply(): IpCity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpCity]
  }
  
  @scala.inline
  implicit class IpCityMutableBuilder[Self <: IpCity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
