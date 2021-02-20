package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogTarget extends StObject {
  
  /**
    * The target name.
    */
  var targetName: js.UndefOr[LogTargetName] = js.native
  
  /**
    * The target type.
    */
  var targetType: LogTargetType = js.native
}
object LogTarget {
  
  @scala.inline
  def apply(targetType: LogTargetType): LogTarget = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogTarget]
  }
  
  @scala.inline
  implicit class LogTargetMutableBuilder[Self <: LogTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetName(value: LogTargetName): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    
    @scala.inline
    def setTargetType(value: LogTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
