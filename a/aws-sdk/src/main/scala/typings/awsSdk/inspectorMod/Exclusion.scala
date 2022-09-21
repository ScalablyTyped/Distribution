package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclusion extends StObject {
  
  /**
    * The ARN that specifies the exclusion.
    */
  var arn: Arn
  
  /**
    * The system-defined attributes for the exclusion.
    */
  var attributes: js.UndefOr[AttributeList] = js.undefined
  
  /**
    * The description of the exclusion.
    */
  var description: Text
  
  /**
    * The recommendation for the exclusion.
    */
  var recommendation: Text
  
  /**
    * The AWS resources for which the exclusion pertains.
    */
  var scopes: ScopeList
  
  /**
    * The name of the exclusion.
    */
  var title: Text
}
object Exclusion {
  
  inline def apply(arn: Arn, description: Text, recommendation: Text, scopes: ScopeList, title: Text): Exclusion = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  
  extension [Self <: Exclusion](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setRecommendation(value: Text): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: ScopeList): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
