package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetOutpost extends StObject {
  
  /**
    * The outpost ARN of the subnet.
    */
  var SubnetOutpostArn: js.UndefOr[String] = js.undefined
}
object SubnetOutpost {
  
  @scala.inline
  def apply(): SubnetOutpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetOutpost]
  }
  
  @scala.inline
  implicit class SubnetOutpostMutableBuilder[Self <: SubnetOutpost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetOutpostArn(value: String): Self = StObject.set(x, "SubnetOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetOutpostArnUndefined: Self = StObject.set(x, "SubnetOutpostArn", js.undefined)
  }
}
