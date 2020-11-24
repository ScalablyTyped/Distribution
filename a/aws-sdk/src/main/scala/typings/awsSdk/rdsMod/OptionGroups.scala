package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionGroups extends js.Object {
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * List of option groups.
    */
  var OptionGroupsList: js.UndefOr[typings.awsSdk.rdsMod.OptionGroupsList] = js.native
}
object OptionGroups {
  
  @scala.inline
  def apply(): OptionGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroups]
  }
  
  @scala.inline
  implicit class OptionGroupsOps[Self <: OptionGroups] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setOptionGroupsListVarargs(value: OptionGroup*): Self = this.set("OptionGroupsList", js.Array(value :_*))
    
    @scala.inline
    def setOptionGroupsList(value: OptionGroupsList): Self = this.set("OptionGroupsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupsList: Self = this.set("OptionGroupsList", js.undefined)
  }
}
