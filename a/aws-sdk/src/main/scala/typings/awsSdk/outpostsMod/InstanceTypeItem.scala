package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTypeItem extends StObject {
  
  var InstanceType: js.UndefOr[typings.awsSdk.outpostsMod.InstanceType] = js.native
}
object InstanceTypeItem {
  
  @scala.inline
  def apply(): InstanceTypeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeItem]
  }
  
  @scala.inline
  implicit class InstanceTypeItemMutableBuilder[Self <: InstanceTypeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
  }
}
