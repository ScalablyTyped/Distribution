package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevEndpointCustomLibraries extends js.Object {
  
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.  You can only use pure Java/Scala libraries with a DevEndpoint. 
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  
  /**
    * The paths to one or more Python libraries in an Amazon Simple Storage Service (Amazon S3) bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not currently supported. 
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
}
object DevEndpointCustomLibraries {
  
  @scala.inline
  def apply(): DevEndpointCustomLibraries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevEndpointCustomLibraries]
  }
  
  @scala.inline
  implicit class DevEndpointCustomLibrariesOps[Self <: DevEndpointCustomLibraries] (val x: Self) extends AnyVal {
    
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
    def setExtraJarsS3Path(value: GenericString): Self = this.set("ExtraJarsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraJarsS3Path: Self = this.set("ExtraJarsS3Path", js.undefined)
    
    @scala.inline
    def setExtraPythonLibsS3Path(value: GenericString): Self = this.set("ExtraPythonLibsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraPythonLibsS3Path: Self = this.set("ExtraPythonLibsS3Path", js.undefined)
  }
}
