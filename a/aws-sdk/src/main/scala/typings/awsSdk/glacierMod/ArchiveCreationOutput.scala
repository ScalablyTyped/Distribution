package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveCreationOutput extends StObject {
  
  /**
    * The ID of the archive. This value is also included as part of the location.
    */
  var archiveId: js.UndefOr[String] = js.native
  
  /**
    * The checksum of the archive computed by Amazon S3 Glacier.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * The relative URI path of the newly added archive resource.
    */
  var location: js.UndefOr[String] = js.native
}
object ArchiveCreationOutput {
  
  @scala.inline
  def apply(): ArchiveCreationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveCreationOutput]
  }
  
  @scala.inline
  implicit class ArchiveCreationOutputMutableBuilder[Self <: ArchiveCreationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveId(value: String): Self = StObject.set(x, "archiveId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveIdUndefined: Self = StObject.set(x, "archiveId", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
