package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFilter extends js.Object {
  
  /**
    * A name of the tag filter.
    */
  var name: FilterName = js.native
  
  /**
    * Values for the tag filter.
    */
  var values: FilterValues = js.native
}
object TagFilter {
  
  @scala.inline
  def apply(name: FilterName, values: FilterValues): TagFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
  
  @scala.inline
  implicit class TagFilterOps[Self <: TagFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: FilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: FilterValues): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
