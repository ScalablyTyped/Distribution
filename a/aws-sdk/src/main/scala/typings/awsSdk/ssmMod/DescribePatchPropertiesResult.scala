package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchPropertiesResult extends StObject {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * A list of the properties for patches matching the filter request parameters.
    */
  var Properties: js.UndefOr[PatchPropertiesList] = js.undefined
}
object DescribePatchPropertiesResult {
  
  @scala.inline
  def apply(): DescribePatchPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchPropertiesResult]
  }
  
  @scala.inline
  implicit class DescribePatchPropertiesResultMutableBuilder[Self <: DescribePatchPropertiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProperties(value: PatchPropertiesList): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: PatchPropertyEntry*): Self = StObject.set(x, "Properties", js.Array(value :_*))
  }
}
