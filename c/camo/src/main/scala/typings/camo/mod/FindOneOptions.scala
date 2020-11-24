package typings.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOneOptions extends js.Object {
  
  /**
    * Find all or no references.
    * Pass an array of field names to only populate the specified references.
    *
    * @type {(boolean | string[])}
    */
  var populate: js.UndefOr[Boolean | js.Array[String]] = js.native
}
object FindOneOptions {
  
  @scala.inline
  def apply(): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneOptions]
  }
  
  @scala.inline
  implicit class FindOneOptionsOps[Self <: FindOneOptions] (val x: Self) extends AnyVal {
    
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
    def setPopulateVarargs(value: String*): Self = this.set("populate", js.Array(value :_*))
    
    @scala.inline
    def setPopulate(value: Boolean | js.Array[String]): Self = this.set("populate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
  }
}
