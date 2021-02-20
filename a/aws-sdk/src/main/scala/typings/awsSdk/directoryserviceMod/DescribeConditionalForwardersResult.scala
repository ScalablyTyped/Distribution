package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConditionalForwardersResult extends StObject {
  
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[typings.awsSdk.directoryserviceMod.ConditionalForwarders] = js.native
}
object DescribeConditionalForwardersResult {
  
  @scala.inline
  def apply(): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
  
  @scala.inline
  implicit class DescribeConditionalForwardersResultMutableBuilder[Self <: DescribeConditionalForwardersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionalForwarders(value: ConditionalForwarders): Self = StObject.set(x, "ConditionalForwarders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalForwardersUndefined: Self = StObject.set(x, "ConditionalForwarders", js.undefined)
    
    @scala.inline
    def setConditionalForwardersVarargs(value: ConditionalForwarder*): Self = StObject.set(x, "ConditionalForwarders", js.Array(value :_*))
  }
}
