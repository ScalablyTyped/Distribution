package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsMap extends StObject {
  
  /**
    * A resource share ARN for a catalog resource shared through RAM.
    */
  var ResourceShare: js.UndefOr[ResourceShareList] = js.undefined
}
object DetailsMap {
  
  inline def apply(): DetailsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsMap]
  }
  
  extension [Self <: DetailsMap](x: Self) {
    
    inline def setResourceShare(value: ResourceShareList): Self = StObject.set(x, "ResourceShare", value.asInstanceOf[js.Any])
    
    inline def setResourceShareUndefined: Self = StObject.set(x, "ResourceShare", js.undefined)
    
    inline def setResourceShareVarargs(value: RAMResourceShareArn*): Self = StObject.set(x, "ResourceShare", js.Array(value*))
  }
}
