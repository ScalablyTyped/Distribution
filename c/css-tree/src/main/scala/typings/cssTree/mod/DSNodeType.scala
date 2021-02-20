package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeType
  extends DSNode
     with DSNodeMultiplied {
  
  var name: String = js.native
  
  var opts: DSNodeTypeOpts | Null = js.native
  
  var `type`: Type = js.native
}
object DSNodeType {
  
  @scala.inline
  def apply(name: String, `type`: Type): DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeType]
  }
  
  @scala.inline
  implicit class DSNodeTypeMutableBuilder[Self <: DSNodeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: DSNodeTypeOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptsNull: Self = StObject.set(x, "opts", null)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
