package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with ShapeDef
     with ComplexShape
     with Shape {
  
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  
  var max: js.UndefOr[scala.Double] = js.undefined
  
  var member: Member
  
  var min: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("type")
  val type_List: list
}
object List {
  
  inline def apply(member: Member): List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[List]
  }
  
  extension [Self <: List](x: Self) {
    
    inline def setFlattened(value: scala.Boolean): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    inline def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMember(value: Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
