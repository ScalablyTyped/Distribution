package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends ShapeDef
     with ComplexShape
     with Shape {
  
  var flattened: js.UndefOr[scala.Boolean] = js.native
  
  var key: Member = js.native
  
  @JSName("type")
  val type_Map: map = js.native
  
  var value: Member = js.native
}
object Map {
  
  @scala.inline
  def apply(key: Member, `type`: map, value: Member): Map = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
