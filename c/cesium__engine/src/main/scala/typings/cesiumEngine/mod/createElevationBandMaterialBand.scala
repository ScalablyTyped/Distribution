package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait createElevationBandMaterialBand extends StObject {
  
  var entries: js.Array[createElevationBandMaterialEntry]
  
  var extendDownwards: js.UndefOr[Boolean] = js.undefined
  
  var extendUpwards: js.UndefOr[Boolean] = js.undefined
}
object createElevationBandMaterialBand {
  
  inline def apply(entries: js.Array[createElevationBandMaterialEntry]): createElevationBandMaterialBand = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[createElevationBandMaterialBand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: createElevationBandMaterialBand] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[createElevationBandMaterialEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: createElevationBandMaterialEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setExtendDownwards(value: Boolean): Self = StObject.set(x, "extendDownwards", value.asInstanceOf[js.Any])
    
    inline def setExtendDownwardsUndefined: Self = StObject.set(x, "extendDownwards", js.undefined)
    
    inline def setExtendUpwards(value: Boolean): Self = StObject.set(x, "extendUpwards", value.asInstanceOf[js.Any])
    
    inline def setExtendUpwardsUndefined: Self = StObject.set(x, "extendUpwards", js.undefined)
  }
}
