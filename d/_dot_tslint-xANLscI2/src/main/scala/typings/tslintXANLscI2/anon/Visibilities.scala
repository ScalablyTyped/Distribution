package typings.tslintXANLscI2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visibilities extends StObject {
  
  var overloads: Type
  
  var tags: Properties
  
  var visibilities: Enum
}
object Visibilities {
  
  inline def apply(overloads: Type, tags: Properties, visibilities: Enum): Visibilities = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], visibilities = visibilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibilities]
  }
  
  extension [Self <: Visibilities](x: Self) {
    
    inline def setOverloads(value: Type): Self = StObject.set(x, "overloads", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Properties): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setVisibilities(value: Enum): Self = StObject.set(x, "visibilities", value.asInstanceOf[js.Any])
  }
}
