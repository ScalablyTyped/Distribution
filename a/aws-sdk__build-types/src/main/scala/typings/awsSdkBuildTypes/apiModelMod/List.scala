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
  
  @scala.inline
  def apply(member: Member): List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMember(value: Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
