package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePatchPropertiesResult extends js.Object {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * A list of the properties for patches matching the filter request parameters.
    */
  var Properties: js.UndefOr[PatchPropertiesList] = js.native
}
object DescribePatchPropertiesResult {
  
  @scala.inline
  def apply(): DescribePatchPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchPropertiesResult]
  }
  
  @scala.inline
  implicit class DescribePatchPropertiesResultOps[Self <: DescribePatchPropertiesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: PatchPropertyEntry*): Self = this.set("Properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PatchPropertiesList): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
  }
}
