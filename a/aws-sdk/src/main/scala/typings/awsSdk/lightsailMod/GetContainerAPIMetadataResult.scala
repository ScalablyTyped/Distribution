package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerAPIMetadataResult extends StObject {
  
  /**
    * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
    */
  var metadata: js.UndefOr[ContainerServiceMetadataEntryList] = js.undefined
}
object GetContainerAPIMetadataResult {
  
  @scala.inline
  def apply(): GetContainerAPIMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerAPIMetadataResult]
  }
  
  @scala.inline
  implicit class GetContainerAPIMetadataResultMutableBuilder[Self <: GetContainerAPIMetadataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: ContainerServiceMetadataEntryList): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(value: ContainerServiceMetadataEntry*): Self = StObject.set(x, "metadata", js.Array(value :_*))
  }
}
