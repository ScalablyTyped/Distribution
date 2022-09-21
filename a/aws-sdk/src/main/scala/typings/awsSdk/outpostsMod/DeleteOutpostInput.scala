package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutpostInput extends StObject {
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost.   In requests, Amazon Web Services Outposts accepts the Amazon Resource Name (ARN) or an ID for Outposts and sites throughout the Outposts Query API. To address backwards compatibility, the parameter names OutpostID or SiteID remain in use. Despite the parameter name, you can make the request with an ARN. 
    */
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId
}
object DeleteOutpostInput {
  
  inline def apply(OutpostId: OutpostId): DeleteOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutpostInput]
  }
  
  extension [Self <: DeleteOutpostInput](x: Self) {
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
