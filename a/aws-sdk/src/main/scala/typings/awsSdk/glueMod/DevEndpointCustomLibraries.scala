package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevEndpointCustomLibraries extends StObject {
  
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
  implicit class DevEndpointCustomLibrariesMutableBuilder[Self <: DevEndpointCustomLibraries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraJarsS3Path(value: GenericString): Self = StObject.set(x, "ExtraJarsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraJarsS3PathUndefined: Self = StObject.set(x, "ExtraJarsS3Path", js.undefined)
    
    @scala.inline
    def setExtraPythonLibsS3Path(value: GenericString): Self = StObject.set(x, "ExtraPythonLibsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraPythonLibsS3PathUndefined: Self = StObject.set(x, "ExtraPythonLibsS3Path", js.undefined)
  }
}
