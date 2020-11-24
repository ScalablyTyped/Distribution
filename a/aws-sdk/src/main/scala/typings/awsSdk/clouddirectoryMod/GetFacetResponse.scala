package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFacetResponse extends js.Object {
  
  /**
    * The Facet structure that is associated with the facet.
    */
  var Facet: js.UndefOr[typings.awsSdk.clouddirectoryMod.Facet] = js.native
}
object GetFacetResponse {
  
  @scala.inline
  def apply(): GetFacetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFacetResponse]
  }
  
  @scala.inline
  implicit class GetFacetResponseOps[Self <: GetFacetResponse] (val x: Self) extends AnyVal {
    
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
    def setFacet(value: Facet): Self = this.set("Facet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacet: Self = this.set("Facet", js.undefined)
  }
}
