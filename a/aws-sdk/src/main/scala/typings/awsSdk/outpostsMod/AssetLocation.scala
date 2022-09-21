package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetLocation extends StObject {
  
  /**
    *  The position of an asset in a rack measured in rack units. 
    */
  var RackElevation: js.UndefOr[typings.awsSdk.outpostsMod.RackElevation] = js.undefined
}
object AssetLocation {
  
  inline def apply(): AssetLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetLocation]
  }
  
  extension [Self <: AssetLocation](x: Self) {
    
    inline def setRackElevation(value: RackElevation): Self = StObject.set(x, "RackElevation", value.asInstanceOf[js.Any])
    
    inline def setRackElevationUndefined: Self = StObject.set(x, "RackElevation", js.undefined)
  }
}
