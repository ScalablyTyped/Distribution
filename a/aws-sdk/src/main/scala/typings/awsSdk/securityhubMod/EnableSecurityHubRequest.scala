package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableSecurityHubRequest extends StObject {
  
  /**
    * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not provide a value for EnableDefaultStandards, it is set to true. To not enable the automatically enabled standards, set EnableDefaultStandards to false.
    */
  var EnableDefaultStandards: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags to add to the hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object EnableSecurityHubRequest {
  
  @scala.inline
  def apply(): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
  
  @scala.inline
  implicit class EnableSecurityHubRequestMutableBuilder[Self <: EnableSecurityHubRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDefaultStandards(value: Boolean): Self = StObject.set(x, "EnableDefaultStandards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDefaultStandardsUndefined: Self = StObject.set(x, "EnableDefaultStandards", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
