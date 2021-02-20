package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootNodeNameString extends StObject {
  
  var rootNodeName: String = js.native
}
object RootNodeNameString {
  
  @scala.inline
  def apply(rootNodeName: String): RootNodeNameString = {
    val __obj = js.Dynamic.literal(rootNodeName = rootNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeNameString]
  }
  
  @scala.inline
  implicit class RootNodeNameStringMutableBuilder[Self <: RootNodeNameString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
  }
}
