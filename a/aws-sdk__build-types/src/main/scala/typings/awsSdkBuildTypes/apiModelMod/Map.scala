package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
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
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: Member): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: map): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Member): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattened(value: scala.Boolean): Self = this.set("flattened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlattened: Self = this.set("flattened", js.undefined)
  }
}
