package typings.ddTrace.profileMod.perftools.profiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Location. */
@js.native
trait ILocation extends js.Object {
  
  /** Location address */
  var address: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Location id */
  var id: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  
  /** Location isFolded */
  var isFolded: js.UndefOr[Boolean | Null] = js.native
  
  /** Location line */
  var line: js.UndefOr[js.Array[ILine] | Null] = js.native
  
  /** Location mappingId */
  var mappingId: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}
object ILocation {
  
  @scala.inline
  def apply(): ILocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILocation]
  }
  
  @scala.inline
  implicit class ILocationOps[Self <: ILocation] (val x: Self) extends AnyVal {
    
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
    def setAddress(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setId(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setIsFolded(value: Boolean): Self = this.set("isFolded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFolded: Self = this.set("isFolded", js.undefined)
    
    @scala.inline
    def setIsFoldedNull: Self = this.set("isFolded", null)
    
    @scala.inline
    def setLineVarargs(value: ILine*): Self = this.set("line", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: js.Array[ILine]): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLineNull: Self = this.set("line", null)
    
    @scala.inline
    def setMappingId(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("mappingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappingId: Self = this.set("mappingId", js.undefined)
    
    @scala.inline
    def setMappingIdNull: Self = this.set("mappingId", null)
  }
}
