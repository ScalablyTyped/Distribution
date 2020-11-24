package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridSessionArtifact extends js.Object {
  
  /**
    * The file name of the artifact.
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * The kind of artifact.
    */
  var `type`: js.UndefOr[TestGridSessionArtifactType] = js.native
  
  /**
    * A semi-stable URL to the content of the object.
    */
  var url: js.UndefOr[String] = js.native
}
object TestGridSessionArtifact {
  
  @scala.inline
  def apply(): TestGridSessionArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionArtifact]
  }
  
  @scala.inline
  implicit class TestGridSessionArtifactOps[Self <: TestGridSessionArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setType(value: TestGridSessionArtifactType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
