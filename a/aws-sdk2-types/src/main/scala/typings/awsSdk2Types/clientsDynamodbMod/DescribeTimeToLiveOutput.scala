package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeToLiveOutput extends StObject {
  
  /**
    * 
    */
  var TimeToLiveDescription: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TimeToLiveDescription] = js.undefined
}
object DescribeTimeToLiveOutput {
  
  inline def apply(): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTimeToLiveOutput] (val x: Self) extends AnyVal {
    
    inline def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
  }
}
