package typings.cyclonedx.mod

import typings.cyclonedx.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceV14
  extends StObject
     with ServiceBase {
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var releaseNotes: js.UndefOr[ReleaseNotes] = js.undefined
  
  var services: js.UndefOr[js.Array[ServiceV14]] = js.undefined
  
  var signature: js.UndefOr[Signature] = js.undefined
}
object ServiceV14 {
  
  inline def apply(name: String): ServiceV14 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceV14]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceV14] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Name*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setReleaseNotes(value: ReleaseNotes): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
    inline def setServices(value: js.Array[ServiceV14]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: ServiceV14*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
