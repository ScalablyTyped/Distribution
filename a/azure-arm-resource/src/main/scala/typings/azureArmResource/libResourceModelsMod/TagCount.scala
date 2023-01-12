package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagCount extends StObject {
  
  /**
    * Type of count.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Value of count.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object TagCount {
  
  inline def apply(): TagCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagCount] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
