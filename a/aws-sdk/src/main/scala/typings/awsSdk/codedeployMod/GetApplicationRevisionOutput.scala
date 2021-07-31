package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationRevisionOutput extends StObject {
  
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * Additional information about the revision, including type and location.
    */
  var revision: js.UndefOr[RevisionLocation] = js.undefined
  
  /**
    * General information about the revision.
    */
  var revisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
}
object GetApplicationRevisionOutput {
  
  @scala.inline
  def apply(): GetApplicationRevisionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationRevisionOutput]
  }
  
  @scala.inline
  implicit class GetApplicationRevisionOutputMutableBuilder[Self <: GetApplicationRevisionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setRevision(value: RevisionLocation): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionInfo(value: GenericRevisionInfo): Self = StObject.set(x, "revisionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionInfoUndefined: Self = StObject.set(x, "revisionInfo", js.undefined)
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
