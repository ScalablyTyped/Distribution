package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolCidrBlock extends StObject {
  
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.native
}
object PoolCidrBlock {
  
  @scala.inline
  def apply(): PoolCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolCidrBlock]
  }
  
  @scala.inline
  implicit class PoolCidrBlockMutableBuilder[Self <: PoolCidrBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}
