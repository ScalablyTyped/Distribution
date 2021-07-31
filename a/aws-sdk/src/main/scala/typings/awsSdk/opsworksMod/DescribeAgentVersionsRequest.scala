package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentVersionsRequest extends StObject {
  
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeAgentVersionsRequest {
  
  @scala.inline
  def apply(): DescribeAgentVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentVersionsRequest]
  }
  
  @scala.inline
  implicit class DescribeAgentVersionsRequestMutableBuilder[Self <: DescribeAgentVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationManager(value: StackConfigurationManager): Self = StObject.set(x, "ConfigurationManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationManagerUndefined: Self = StObject.set(x, "ConfigurationManager", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
