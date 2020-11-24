package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingEngine extends js.Object {
  
  /**
    * The name of the rendering engine.
    */
  var name: js.UndefOr[RenderingEngineType] = js.native
  
  /**
    * The version of the rendering engine.
    */
  var version: js.UndefOr[RenderingEngineVersionType] = js.native
}
object RenderingEngine {
  
  @scala.inline
  def apply(): RenderingEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingEngine]
  }
  
  @scala.inline
  implicit class RenderingEngineOps[Self <: RenderingEngine] (val x: Self) extends AnyVal {
    
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
    def setName(value: RenderingEngineType): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVersion(value: RenderingEngineVersionType): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
