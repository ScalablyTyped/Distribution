package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * The data field of the trust anchor depending on its type. 
    */
  var sourceData: js.UndefOr[SourceData] = js.undefined
  
  /**
    * The type of the trust anchor. 
    */
  var sourceType: js.UndefOr[TrustAnchorType] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSourceData(value: SourceData): Self = StObject.set(x, "sourceData", value.asInstanceOf[js.Any])
    
    inline def setSourceDataUndefined: Self = StObject.set(x, "sourceData", js.undefined)
    
    inline def setSourceType(value: TrustAnchorType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
