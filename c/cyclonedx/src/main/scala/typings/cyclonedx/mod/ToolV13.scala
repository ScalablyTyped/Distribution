package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolV13
  extends StObject
     with ToolV12 {
  
  var externalReferences: js.UndefOr[js.Array[ExternalReference]] = js.undefined
}
object ToolV13 {
  
  inline def apply(): ToolV13 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolV13]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolV13] (val x: Self) extends AnyVal {
    
    inline def setExternalReferences(value: js.Array[ExternalReference]): Self = StObject.set(x, "externalReferences", value.asInstanceOf[js.Any])
    
    inline def setExternalReferencesUndefined: Self = StObject.set(x, "externalReferences", js.undefined)
    
    inline def setExternalReferencesVarargs(value: ExternalReference*): Self = StObject.set(x, "externalReferences", js.Array(value*))
  }
}
