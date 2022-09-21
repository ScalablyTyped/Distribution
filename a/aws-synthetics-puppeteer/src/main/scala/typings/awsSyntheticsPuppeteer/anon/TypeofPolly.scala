package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.Polly.Presigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPolly extends StObject {
  
  val Presigner: Instantiable0[typings.awsSdk.mod.Polly.Presigner]
  
  val Types: this.type
}
object TypeofPolly {
  
  inline def apply(Presigner: Instantiable0[Presigner], Types: TypeofPolly): TypeofPolly = {
    val __obj = js.Dynamic.literal(Presigner = Presigner.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPolly]
  }
  
  extension [Self <: TypeofPolly](x: Self) {
    
    inline def setPresigner(value: Instantiable0[Presigner]): Self = StObject.set(x, "Presigner", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeofPolly): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
