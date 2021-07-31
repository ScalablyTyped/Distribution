package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map
  extends StObject
     with ShapeDef
     with ComplexShape
     with Shape {
  
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  
  var key: Member
  
  @JSName("type")
  val type_Map: map
  
  var value: Member
}
object Map {
  
  @scala.inline
  def apply(key: Member, value: Member): Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("map")
    __obj.asInstanceOf[Map]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    @scala.inline
    def setKey(value: Member): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: map): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Member): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
