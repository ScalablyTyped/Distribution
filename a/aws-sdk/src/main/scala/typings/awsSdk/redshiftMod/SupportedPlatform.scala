package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedPlatform extends StObject {
  
  /**
    * 
    */
  var Name: js.UndefOr[String] = js.undefined
}
object SupportedPlatform {
  
  inline def apply(): SupportedPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedPlatform]
  }
  
  extension [Self <: SupportedPlatform](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
