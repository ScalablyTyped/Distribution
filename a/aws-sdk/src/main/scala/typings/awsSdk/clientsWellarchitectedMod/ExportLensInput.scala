package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportLensInput extends StObject {
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The lens version to be exported.
    */
  var LensVersion: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensVersion] = js.undefined
}
object ExportLensInput {
  
  inline def apply(LensAlias: LensAlias): ExportLensInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportLensInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportLensInput] (val x: Self) extends AnyVal {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensVersion(value: LensVersion): Self = StObject.set(x, "LensVersion", value.asInstanceOf[js.Any])
    
    inline def setLensVersionUndefined: Self = StObject.set(x, "LensVersion", js.undefined)
  }
}
