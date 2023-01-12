package typings.azureMsalCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var Metadata: String
}
object Metadata {
  
  inline def apply(Metadata: String): Metadata = {
    val __obj = js.Dynamic.literal(Metadata = Metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: String): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
  }
}
