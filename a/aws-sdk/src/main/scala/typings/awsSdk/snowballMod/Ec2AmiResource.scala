package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2AmiResource extends StObject {
  
  /**
    * The ID of the AMI in Amazon EC2.
    */
  var AmiId: typings.awsSdk.snowballMod.AmiId
  
  /**
    * The ID of the AMI on the Snow device.
    */
  var SnowballAmiId: js.UndefOr[String] = js.undefined
}
object Ec2AmiResource {
  
  inline def apply(AmiId: AmiId): Ec2AmiResource = {
    val __obj = js.Dynamic.literal(AmiId = AmiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2AmiResource]
  }
  
  extension [Self <: Ec2AmiResource](x: Self) {
    
    inline def setAmiId(value: AmiId): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    inline def setSnowballAmiId(value: String): Self = StObject.set(x, "SnowballAmiId", value.asInstanceOf[js.Any])
    
    inline def setSnowballAmiIdUndefined: Self = StObject.set(x, "SnowballAmiId", js.undefined)
  }
}
