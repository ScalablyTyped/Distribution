package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainControllersResult extends js.Object {
  
  /**
    * List of the DomainController objects that were retrieved.
    */
  var DomainControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.DomainControllers] = js.native
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object DescribeDomainControllersResult {
  
  @scala.inline
  def apply(): DescribeDomainControllersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainControllersResult]
  }
  
  @scala.inline
  implicit class DescribeDomainControllersResultOps[Self <: DescribeDomainControllersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainControllersVarargs(value: DomainController*): Self = this.set("DomainControllers", js.Array(value :_*))
    
    @scala.inline
    def setDomainControllers(value: DomainControllers): Self = this.set("DomainControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainControllers: Self = this.set("DomainControllers", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
