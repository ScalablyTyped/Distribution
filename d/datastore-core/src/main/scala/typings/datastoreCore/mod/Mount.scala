package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Adapter
import typings.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mount[Value] extends js.Object {
  
  /**
    * The child datastore.
    */
  var datastore: Adapter[Value] = js.native
  
  /**
    * The mount prefix.
    */
  var prefix: Key = js.native
}
object Mount {
  
  @scala.inline
  def apply[Value](datastore: Adapter[Value], prefix: Key): Mount[Value] = {
    val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount[Value]]
  }
  
  @scala.inline
  implicit class MountOps[Self <: Mount[_], Value] (val x: Self with Mount[Value]) extends AnyVal {
    
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
    def setDatastore(value: Adapter[Value]): Self = this.set("datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Key): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
}
