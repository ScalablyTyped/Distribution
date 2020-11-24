package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEnvironment extends js.Object {
  
  var orientationAngle: js.UndefOr[Double] = js.native
  
  var orientationType: js.UndefOr[String] = js.native
  
  var userAgent: String = js.native
  
  var windowHeight: Double = js.native
  
  var windowWidth: Double = js.native
}
object TestEnvironment {
  
  @scala.inline
  def apply(userAgent: String, windowHeight: Double, windowWidth: Double): TestEnvironment = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
  
  @scala.inline
  implicit class TestEnvironmentOps[Self <: TestEnvironment] (val x: Self) extends AnyVal {
    
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
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationAngle(value: Double): Self = this.set("orientationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientationAngle: Self = this.set("orientationAngle", js.undefined)
    
    @scala.inline
    def setOrientationType(value: String): Self = this.set("orientationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientationType: Self = this.set("orientationType", js.undefined)
  }
}
