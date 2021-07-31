package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetHealthOutput extends StObject {
  
  /**
    * Information about the health of the targets.
    */
  var TargetHealthDescriptions: js.UndefOr[typings.awsSdk.elbv2Mod.TargetHealthDescriptions] = js.undefined
}
object DescribeTargetHealthOutput {
  
  @scala.inline
  def apply(): DescribeTargetHealthOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetHealthOutput]
  }
  
  @scala.inline
  implicit class DescribeTargetHealthOutputMutableBuilder[Self <: DescribeTargetHealthOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetHealthDescriptions(value: TargetHealthDescriptions): Self = StObject.set(x, "TargetHealthDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHealthDescriptionsUndefined: Self = StObject.set(x, "TargetHealthDescriptions", js.undefined)
    
    @scala.inline
    def setTargetHealthDescriptionsVarargs(value: TargetHealthDescription*): Self = StObject.set(x, "TargetHealthDescriptions", js.Array(value :_*))
  }
}
