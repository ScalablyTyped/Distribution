package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionRequest extends StObject {
  
  /**
    * The name of the connection to retrieve.
    */
  var Name: ConnectionName
}
object DescribeConnectionRequest {
  
  inline def apply(Name: ConnectionName): DescribeConnectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionRequest]
  }
  
  extension [Self <: DescribeConnectionRequest](x: Self) {
    
    inline def setName(value: ConnectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
