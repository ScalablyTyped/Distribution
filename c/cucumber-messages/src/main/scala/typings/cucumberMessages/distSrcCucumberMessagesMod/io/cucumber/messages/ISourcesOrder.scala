package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourcesOrder. */
trait ISourcesOrder extends StObject {
  
  /** SourcesOrder seed */
  var seed: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
  ] = js.undefined
  
  /** SourcesOrder type */
  var `type`: js.UndefOr[SourcesOrderType | Null] = js.undefined
}
object ISourcesOrder {
  
  inline def apply(): ISourcesOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesOrder]
  }
  
  extension [Self <: ISourcesOrder](x: Self) {
    
    inline def setSeed(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedNull: Self = StObject.set(x, "seed", null)
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setType(value: SourcesOrderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
