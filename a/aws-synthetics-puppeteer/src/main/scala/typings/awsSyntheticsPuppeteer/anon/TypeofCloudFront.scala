package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCloudFront extends StObject {
  
  val Signer: Any
  
  val Types: this.type
}
object TypeofCloudFront {
  
  inline def apply(Signer: Any, Types: TypeofCloudFront): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudFront]
  }
  
  extension [Self <: TypeofCloudFront](x: Self) {
    
    inline def setSigner(value: Any): Self = StObject.set(x, "Signer", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeofCloudFront): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
