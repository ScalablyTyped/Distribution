package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusionPreview extends StObject {
  
  /**
    * The system-defined attributes for the exclusion preview.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  
  /**
    * The description of the exclusion preview.
    */
  var description: Text = js.native
  
  /**
    * The recommendation for the exclusion preview.
    */
  var recommendation: Text = js.native
  
  /**
    * The AWS resources for which the exclusion preview pertains.
    */
  var scopes: ScopeList = js.native
  
  /**
    * The name of the exclusion preview.
    */
  var title: Text = js.native
}
object ExclusionPreview {
  
  @scala.inline
  def apply(description: Text, recommendation: Text, scopes: ScopeList, title: Text): ExclusionPreview = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionPreview]
  }
  
  @scala.inline
  implicit class ExclusionPreviewMutableBuilder[Self <: ExclusionPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendation(value: Text): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: ScopeList): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
