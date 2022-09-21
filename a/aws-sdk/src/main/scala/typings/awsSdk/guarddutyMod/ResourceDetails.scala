package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * InstanceArn that was scanned in the scan entry.
    */
  var InstanceArn: js.UndefOr[typings.awsSdk.guarddutyMod.InstanceArn] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  extension [Self <: ResourceDetails](x: Self) {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnUndefined: Self = StObject.set(x, "InstanceArn", js.undefined)
  }
}
