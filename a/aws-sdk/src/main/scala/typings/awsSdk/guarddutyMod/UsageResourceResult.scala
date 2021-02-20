package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageResourceResult extends StObject {
  
  /**
    * The AWS resource that generated usage.
    */
  var Resource: js.UndefOr[String] = js.native
  
  /**
    * Represents the sum total of usage for the specified resource type.
    */
  var Total: js.UndefOr[typings.awsSdk.guarddutyMod.Total] = js.native
}
object UsageResourceResult {
  
  @scala.inline
  def apply(): UsageResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageResourceResult]
  }
  
  @scala.inline
  implicit class UsageResourceResultMutableBuilder[Self <: UsageResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    @scala.inline
    def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
