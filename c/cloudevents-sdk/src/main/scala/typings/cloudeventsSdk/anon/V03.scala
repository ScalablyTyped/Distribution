package typings.cloudeventsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V03 extends js.Object {
  
  var v03: Dictkey = js.native
  
  var v1: Dictkey = js.native
}
object V03 {
  
  @scala.inline
  def apply(v03: Dictkey, v1: Dictkey): V03 = {
    val __obj = js.Dynamic.literal(v03 = v03.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[V03]
  }
  
  @scala.inline
  implicit class V03Ops[Self <: V03] (val x: Self) extends AnyVal {
    
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
    def setV03(value: Dictkey): Self = this.set("v03", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV1(value: Dictkey): Self = this.set("v1", value.asInstanceOf[js.Any])
  }
}
