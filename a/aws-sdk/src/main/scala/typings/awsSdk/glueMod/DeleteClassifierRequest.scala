package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClassifierRequest extends StObject {
  
  /**
    * Name of the classifier to remove.
    */
  var Name: NameString
}
object DeleteClassifierRequest {
  
  inline def apply(Name: NameString): DeleteClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClassifierRequest]
  }
  
  extension [Self <: DeleteClassifierRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
