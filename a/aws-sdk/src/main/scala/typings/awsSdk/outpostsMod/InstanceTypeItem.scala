package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeItem extends StObject {
  
  var InstanceType: js.UndefOr[typings.awsSdk.outpostsMod.InstanceType] = js.undefined
}
object InstanceTypeItem {
  
  inline def apply(): InstanceTypeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeItem]
  }
  
  extension [Self <: InstanceTypeItem](x: Self) {
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
  }
}
