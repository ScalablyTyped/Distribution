package typings.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOptions extends js.Object {
  
  /**
    * Limits the number of documents returned.
    *
    * @type {number}
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Find all or no references.
    * Pass an array of field names to only populate the specified references.
    *
    * @type {(boolean | string[])}
    */
  var populate: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Skips the given number of documents and returns the rest.
    *
    * @type {number}
    */
  var skip: js.UndefOr[Double] = js.native
  
  /**
    * Sort the documents by the given field(s).
    *
    * @type {TypeOrArrayOfType<string>}
    */
  var sort: js.UndefOr[TypeOrArrayOfType[String]] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply(): FindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions]
  }
  
  @scala.inline
  implicit class FindOptionsOps[Self <: FindOptions] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPopulateVarargs(value: String*): Self = this.set("populate", js.Array(value :_*))
    
    @scala.inline
    def setPopulate(value: Boolean | js.Array[String]): Self = this.set("populate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: String*): Self = this.set("sort", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: TypeOrArrayOfType[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
