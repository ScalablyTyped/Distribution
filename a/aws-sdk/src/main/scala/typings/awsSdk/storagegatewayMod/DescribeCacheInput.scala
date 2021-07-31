package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCacheInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object DescribeCacheInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeCacheInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheInput]
  }
  
  @scala.inline
  implicit class DescribeCacheInputMutableBuilder[Self <: DescribeCacheInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
