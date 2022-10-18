package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCustomFieldItemParams extends StObject {
  
  var name: String
}
object PostCustomFieldItemParams {
  
  inline def apply(name: String): PostCustomFieldItemParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldItemParams]
  }
  
  extension [Self <: PostCustomFieldItemParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
