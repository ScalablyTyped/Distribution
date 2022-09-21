package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensInput extends StObject {
  
  var LensAlias: typings.awsSdk.wellarchitectedMod.LensAlias
  
  /**
    * The lens version to be retrieved.
    */
  var LensVersion: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensVersion] = js.undefined
}
object GetLensInput {
  
  inline def apply(LensAlias: LensAlias): GetLensInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLensInput]
  }
  
  extension [Self <: GetLensInput](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
    
    inline def setLensVersionUndefined: Self = StObject.set(x, "LensVersion", js.undefined)
  }
}
