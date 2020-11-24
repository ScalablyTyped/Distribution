package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropPrimaryIndexOptions extends js.Object {
  
  /**
    * If true, attempting to drop on a bucket without the specified index won't cause an error to be thrown.
    */
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  
  /**
    * The custom name for the primary index.
    */
  var name: js.UndefOr[String] = js.native
}
object DropPrimaryIndexOptions {
  
  @scala.inline
  def apply(): DropPrimaryIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropPrimaryIndexOptions]
  }
  
  @scala.inline
  implicit class DropPrimaryIndexOptionsOps[Self <: DropPrimaryIndexOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreIfNotExists(value: Boolean): Self = this.set("ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreIfNotExists: Self = this.set("ignoreIfNotExists", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
