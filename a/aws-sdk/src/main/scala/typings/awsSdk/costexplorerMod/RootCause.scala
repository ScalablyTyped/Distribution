package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootCause extends StObject {
  
  /**
    *  The linked account value associated with the cost anomaly. 
    */
  var LinkedAccount: js.UndefOr[GenericString] = js.native
  
  /**
    *  The AWS Region associated with the cost anomaly. 
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    *  The AWS service name associated with the cost anomaly. 
    */
  var Service: js.UndefOr[GenericString] = js.native
  
  /**
    *  The UsageType value associated with the cost anomaly. 
    */
  var UsageType: js.UndefOr[GenericString] = js.native
}
object RootCause {
  
  @scala.inline
  def apply(): RootCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootCause]
  }
  
  @scala.inline
  implicit class RootCauseMutableBuilder[Self <: RootCause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkedAccount(value: GenericString): Self = StObject.set(x, "LinkedAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedAccountUndefined: Self = StObject.set(x, "LinkedAccount", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setService(value: GenericString): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    @scala.inline
    def setUsageType(value: GenericString): Self = StObject.set(x, "UsageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageTypeUndefined: Self = StObject.set(x, "UsageType", js.undefined)
  }
}
