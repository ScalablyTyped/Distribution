package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "util-methods"
@js.native
trait CommonSubMethods extends js.Object {
  
  /**
    * Get the DataTables cached data for the selected cell
    *
    * @param t Specify which cache the data should be read from. Can take one of two values: search or order
    */
  def cache(t: String): Api = js.native
}
object CommonSubMethods {
  
  @scala.inline
  def apply(cache: String => Api): CommonSubMethods = {
    val __obj = js.Dynamic.literal(cache = js.Any.fromFunction1(cache))
    __obj.asInstanceOf[CommonSubMethods]
  }
  
  @scala.inline
  implicit class CommonSubMethodsOps[Self <: CommonSubMethods] (val x: Self) extends AnyVal {
    
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
    def setCache(value: String => Api): Self = this.set("cache", js.Any.fromFunction1(value))
  }
}
