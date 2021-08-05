package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpCountry extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from. For example, US for the United States.
    */
  var code: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the country that the IP address originated from.
    */
  var name: js.UndefOr[string] = js.undefined
}
object IpCountry {
  
  inline def apply(): IpCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpCountry]
  }
  
  extension [Self <: IpCountry](x: Self) {
    
    inline def setCode(value: string): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
