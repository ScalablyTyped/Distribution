package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationMediaMessage extends StObject {
  
  /**
    * The list of InstallationMedia objects for the AWS account.
    */
  var InstallationMedia: js.UndefOr[InstallationMediaList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object InstallationMediaMessage {
  
  @scala.inline
  def apply(): InstallationMediaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMediaMessage]
  }
  
  @scala.inline
  implicit class InstallationMediaMessageMutableBuilder[Self <: InstallationMediaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallationMedia(value: InstallationMediaList): Self = StObject.set(x, "InstallationMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationMediaUndefined: Self = StObject.set(x, "InstallationMedia", js.undefined)
    
    @scala.inline
    def setInstallationMediaVarargs(value: InstallationMedia*): Self = StObject.set(x, "InstallationMedia", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
