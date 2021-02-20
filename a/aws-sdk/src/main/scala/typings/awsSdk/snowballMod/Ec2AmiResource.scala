package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ec2AmiResource extends StObject {
  
  /**
    * The ID of the AMI in Amazon EC2.
    */
  var AmiId: typings.awsSdk.snowballMod.AmiId = js.native
  
  /**
    * The ID of the AMI on the Snow device.
    */
  var SnowballAmiId: js.UndefOr[String] = js.native
}
object Ec2AmiResource {
  
  @scala.inline
  def apply(AmiId: AmiId): Ec2AmiResource = {
    val __obj = js.Dynamic.literal(AmiId = AmiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2AmiResource]
  }
  
  @scala.inline
  implicit class Ec2AmiResourceMutableBuilder[Self <: Ec2AmiResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmiId(value: AmiId): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballAmiId(value: String): Self = StObject.set(x, "SnowballAmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballAmiIdUndefined: Self = StObject.set(x, "SnowballAmiId", js.undefined)
  }
}
