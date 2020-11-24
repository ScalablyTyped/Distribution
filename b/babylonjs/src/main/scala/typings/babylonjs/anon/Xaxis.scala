package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xaxis extends js.Object {
  
  var `x-axis`: RootNodeNameString = js.native
  
  var `y-axis`: RootNodeNameString = js.native
}
object Xaxis {
  
  @scala.inline
  def apply(`x-axis`: RootNodeNameString, `y-axis`: RootNodeNameString): Xaxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-axis")(`x-axis`.asInstanceOf[js.Any])
    __obj.updateDynamic("y-axis")(`y-axis`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xaxis]
  }
  
  @scala.inline
  implicit class XaxisOps[Self <: Xaxis] (val x: Self) extends AnyVal {
    
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
    def `setX-axis`(value: RootNodeNameString): Self = this.set("x-axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-axis`(value: RootNodeNameString): Self = this.set("y-axis", value.asInstanceOf[js.Any])
  }
}
