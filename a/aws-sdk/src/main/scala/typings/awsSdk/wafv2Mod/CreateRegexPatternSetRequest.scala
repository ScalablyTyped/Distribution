package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRegexPatternSetRequest extends StObject {
  
  /**
    * A description of the set that helps with identification. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: EntityName
  
  /**
    * Array of regular expression strings. 
    */
  var RegularExpressionList: typings.awsSdk.wafv2Mod.RegularExpressionList
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRegexPatternSetRequest {
  
  @scala.inline
  def apply(Name: EntityName, RegularExpressionList: RegularExpressionList, Scope: Scope): CreateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegularExpressionList = RegularExpressionList.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexPatternSetRequest]
  }
  
  @scala.inline
  implicit class CreateRegexPatternSetRequestMutableBuilder[Self <: CreateRegexPatternSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularExpressionList(value: RegularExpressionList): Self = StObject.set(x, "RegularExpressionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularExpressionListVarargs(value: Regex*): Self = StObject.set(x, "RegularExpressionList", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
