package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolFunctionInstanceMetadata extends StObject {
  
  /**
    * When the network function instance was created.
    */
  var createdAt: js.Date
  
  /**
    * When the network function instance was last modified.
    */
  var lastModified: js.Date
}
object ListSolFunctionInstanceMetadata {
  
  inline def apply(createdAt: js.Date, lastModified: js.Date): ListSolFunctionInstanceMetadata = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolFunctionInstanceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolFunctionInstanceMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
  }
}
