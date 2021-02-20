package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEntityTypesResult extends StObject {
  
  /**
    * An array of entity types.
    */
  var entityTypes: js.UndefOr[entityTypeList] = js.native
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetEntityTypesResult {
  
  @scala.inline
  def apply(): GetEntityTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEntityTypesResult]
  }
  
  @scala.inline
  implicit class GetEntityTypesResultMutableBuilder[Self <: GetEntityTypesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: entityTypeList): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
