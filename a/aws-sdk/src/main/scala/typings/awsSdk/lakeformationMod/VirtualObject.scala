package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualObject extends StObject {
  
  /**
    * The ETag of the Amazon S3 object.
    */
  var ETag: js.UndefOr[ETagString] = js.undefined
  
  /**
    * The path to the Amazon S3 object. Must start with s3://
    */
  var Uri: URI
}
object VirtualObject {
  
  inline def apply(Uri: URI): VirtualObject = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualObject]
  }
  
  extension [Self <: VirtualObject](x: Self) {
    
    inline def setETag(value: ETagString): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setUri(value: URI): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
