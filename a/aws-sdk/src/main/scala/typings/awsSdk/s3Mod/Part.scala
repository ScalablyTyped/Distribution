package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part extends StObject {
  
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.undefined
  
  /**
    * Date and time at which the part was uploaded.
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.undefined
  
  /**
    * Part number identifying the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.undefined
  
  /**
    * Size in bytes of the uploaded part data.
    */
  var Size: js.UndefOr[typings.awsSdk.s3Mod.Size] = js.undefined
}
object Part {
  
  inline def apply(): Part = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Part]
  }
  
  extension [Self <: Part](x: Self) {
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: LastModified): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setPartNumber(value: PartNumber): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
    
    inline def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
