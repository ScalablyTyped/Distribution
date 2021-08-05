package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyPartResult extends StObject {
  
  /**
    * Entity tag of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.undefined
  
  /**
    * Date and time at which the object was uploaded.
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.undefined
}
object CopyPartResult {
  
  inline def apply(): CopyPartResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPartResult]
  }
  
  extension [Self <: CopyPartResult](x: Self) {
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: LastModified): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
  }
}
