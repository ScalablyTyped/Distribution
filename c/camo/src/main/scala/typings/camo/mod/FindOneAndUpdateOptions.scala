package typings.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOneAndUpdateOptions extends js.Object {
  
  /**
    * Return a new document if one is not found with the given query.
    *
    * @type {boolean}
    */
  var upsert: js.UndefOr[Boolean] = js.native
}
object FindOneAndUpdateOptions {
  
  @scala.inline
  def apply(): FindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndUpdateOptions]
  }
  
  @scala.inline
  implicit class FindOneAndUpdateOptionsOps[Self <: FindOneAndUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
}
