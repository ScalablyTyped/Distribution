package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchTemplatesResult extends StObject {
  
  /**
    * Information about the launch templates.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLaunchTemplatesResult {
  
  @scala.inline
  def apply(): DescribeLaunchTemplatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplatesResult]
  }
  
  @scala.inline
  implicit class DescribeLaunchTemplatesResultMutableBuilder[Self <: DescribeLaunchTemplatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplates(value: LaunchTemplateSet): Self = StObject.set(x, "LaunchTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplatesUndefined: Self = StObject.set(x, "LaunchTemplates", js.undefined)
    
    @scala.inline
    def setLaunchTemplatesVarargs(value: LaunchTemplate*): Self = StObject.set(x, "LaunchTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
