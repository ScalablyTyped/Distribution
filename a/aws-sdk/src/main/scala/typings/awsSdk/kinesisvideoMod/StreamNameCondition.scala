package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamNameCondition extends StObject {
  
  /**
    * A comparison operator. Currently, you can specify only the BEGINS_WITH operator, which finds streams whose names start with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.kinesisvideoMod.ComparisonOperator] = js.native
  
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[StreamName] = js.native
}
object StreamNameCondition {
  
  @scala.inline
  def apply(): StreamNameCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamNameCondition]
  }
  
  @scala.inline
  implicit class StreamNameConditionMutableBuilder[Self <: StreamNameCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: StreamName): Self = StObject.set(x, "ComparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonValueUndefined: Self = StObject.set(x, "ComparisonValue", js.undefined)
  }
}
