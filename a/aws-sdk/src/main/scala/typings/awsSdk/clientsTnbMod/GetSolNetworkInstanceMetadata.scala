package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkInstanceMetadata extends StObject {
  
  /**
    * The date that the resource was created.
    */
  var createdAt: js.Date
  
  /**
    * The date that the resource was last modified.
    */
  var lastModified: js.Date
}
object GetSolNetworkInstanceMetadata {
  
  inline def apply(createdAt: js.Date, lastModified: js.Date): GetSolNetworkInstanceMetadata = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkInstanceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkInstanceMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
  }
}
