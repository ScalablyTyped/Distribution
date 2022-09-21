package typings.baseui.anon

import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.small_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Large extends StObject {
  
  val large: large_
  
  val medium: medium_
  
  val small: small_
}
object Large {
  
  inline def apply(): Large = {
    val __obj = js.Dynamic.literal(large = "large", medium = "medium", small = "small")
    __obj.asInstanceOf[Large]
  }
  
  extension [Self <: Large](x: Self) {
    
    inline def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: medium_): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: small_): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
