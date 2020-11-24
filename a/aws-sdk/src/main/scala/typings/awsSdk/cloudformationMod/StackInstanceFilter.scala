package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstanceFilter extends js.Object {
  
  /**
    * The type of filter to apply.
    */
  var Name: js.UndefOr[StackInstanceFilterName] = js.native
  
  /**
    * The status to filter by.
    */
  var Values: js.UndefOr[StackInstanceFilterValues] = js.native
}
object StackInstanceFilter {
  
  @scala.inline
  def apply(): StackInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstanceFilter]
  }
  
  @scala.inline
  implicit class StackInstanceFilterOps[Self <: StackInstanceFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: StackInstanceFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValues(value: StackInstanceFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
