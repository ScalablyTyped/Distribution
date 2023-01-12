package typings.classTransformer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesTargetMapDotinterfaceMod {
  
  trait TargetMap extends StObject {
    
    /**
      * List of properties and their Types.
      */
    var properties: StringDictionary[js.Function]
    
    /**
      * Target which Types are being specified.
      */
    var target: js.Function
  }
  object TargetMap {
    
    inline def apply(properties: StringDictionary[js.Function], target: js.Function): TargetMap = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetMap] (val x: Self) extends AnyVal {
      
      inline def setProperties(value: StringDictionary[js.Function]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
