package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionInfo extends StObject {
  
  /**
    * Information about an application revision, including usage details and associated deployment groups.
    */
  var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
  
  /**
    * Information about the location and type of an application revision.
    */
  var revisionLocation: js.UndefOr[RevisionLocation] = js.native
}
object RevisionInfo {
  
  @scala.inline
  def apply(): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionInfo]
  }
  
  @scala.inline
  implicit class RevisionInfoMutableBuilder[Self <: RevisionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenericRevisionInfo(value: GenericRevisionInfo): Self = StObject.set(x, "genericRevisionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericRevisionInfoUndefined: Self = StObject.set(x, "genericRevisionInfo", js.undefined)
    
    @scala.inline
    def setRevisionLocation(value: RevisionLocation): Self = StObject.set(x, "revisionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionLocationUndefined: Self = StObject.set(x, "revisionLocation", js.undefined)
  }
}
