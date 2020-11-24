package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Etc1 extends js.Object {
  
  /**
    * etc1 compression format
    */
  var etc1: js.UndefOr[Boolean] = js.native
  
  /**
    * etc2 compression format
    */
  var etc2: js.UndefOr[Boolean] = js.native
  
  /**
    * pvrtc compression format
    */
  var pvrtc: js.UndefOr[Boolean] = js.native
  
  /**
    * s3tc compression format
    */
  var s3tc: js.UndefOr[Boolean] = js.native
}
object Etc1 {
  
  @scala.inline
  def apply(): Etc1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etc1]
  }
  
  @scala.inline
  implicit class Etc1Ops[Self <: Etc1] (val x: Self) extends AnyVal {
    
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
    def setEtc1(value: Boolean): Self = this.set("etc1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtc1: Self = this.set("etc1", js.undefined)
    
    @scala.inline
    def setEtc2(value: Boolean): Self = this.set("etc2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtc2: Self = this.set("etc2", js.undefined)
    
    @scala.inline
    def setPvrtc(value: Boolean): Self = this.set("pvrtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePvrtc: Self = this.set("pvrtc", js.undefined)
    
    @scala.inline
    def setS3tc(value: Boolean): Self = this.set("s3tc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3tc: Self = this.set("s3tc", js.undefined)
  }
}
