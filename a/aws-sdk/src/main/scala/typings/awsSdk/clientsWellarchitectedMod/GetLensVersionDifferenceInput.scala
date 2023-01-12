package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensVersionDifferenceInput extends StObject {
  
  /**
    * The base version of the lens.
    */
  var BaseLensVersion: js.UndefOr[LensVersion] = js.undefined
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The lens version to target a difference for.
    */
  var TargetLensVersion: js.UndefOr[LensVersion] = js.undefined
}
object GetLensVersionDifferenceInput {
  
  inline def apply(LensAlias: LensAlias): GetLensVersionDifferenceInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLensVersionDifferenceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLensVersionDifferenceInput] (val x: Self) extends AnyVal {
    
    inline def setBaseLensVersion(value: LensVersion): Self = StObject.set(x, "BaseLensVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseLensVersionUndefined: Self = StObject.set(x, "BaseLensVersion", js.undefined)
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setTargetLensVersion(value: LensVersion): Self = StObject.set(x, "TargetLensVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetLensVersionUndefined: Self = StObject.set(x, "TargetLensVersion", js.undefined)
  }
}
