package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position1 extends js.Object {
  
  var position1: Cartesian2 = js.native
  
  var position2: Cartesian2 = js.native
}
object Position1 {
  
  @scala.inline
  def apply(position1: Cartesian2, position2: Cartesian2): Position1 = {
    val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position1]
  }
  
  @scala.inline
  implicit class Position1Ops[Self <: Position1] (val x: Self) extends AnyVal {
    
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
    def setPosition1(value: Cartesian2): Self = this.set("position1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition2(value: Cartesian2): Self = this.set("position2", value.asInstanceOf[js.Any])
  }
}
