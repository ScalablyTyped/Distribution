package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.RDS.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRDS extends StObject {
  
  val Signer: Instantiable0[typings.awsSdk.mod.RDS.Signer]
  
  val Types: this.type
}
object TypeofRDS {
  
  inline def apply(Signer: Instantiable0[Signer], Types: TypeofRDS): TypeofRDS = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRDS]
  }
  
  extension [Self <: TypeofRDS](x: Self) {
    
    inline def setSigner(value: Instantiable0[Signer]): Self = StObject.set(x, "Signer", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeofRDS): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
