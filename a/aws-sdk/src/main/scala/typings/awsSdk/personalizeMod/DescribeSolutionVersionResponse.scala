package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSolutionVersionResponse extends js.Object {
  
  /**
    * The solution version.
    */
  var solutionVersion: js.UndefOr[SolutionVersion] = js.native
}
object DescribeSolutionVersionResponse {
  
  @scala.inline
  def apply(): DescribeSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSolutionVersionResponse]
  }
  
  @scala.inline
  implicit class DescribeSolutionVersionResponseOps[Self <: DescribeSolutionVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setSolutionVersion(value: SolutionVersion): Self = this.set("solutionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionVersion: Self = this.set("solutionVersion", js.undefined)
  }
}
