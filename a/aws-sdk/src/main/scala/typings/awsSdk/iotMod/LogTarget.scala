package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogTarget extends StObject {
  
  /**
    * The target name.
    */
  var targetName: js.UndefOr[LogTargetName] = js.undefined
  
  /**
    * The target type.
    */
  var targetType: LogTargetType
}
object LogTarget {
  
  inline def apply(targetType: LogTargetType): LogTarget = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTarget]
  }
  
  extension [Self <: LogTarget](x: Self) {
    
    inline def setTargetName(value: LogTargetName): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    
    inline def setTargetType(value: LogTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
