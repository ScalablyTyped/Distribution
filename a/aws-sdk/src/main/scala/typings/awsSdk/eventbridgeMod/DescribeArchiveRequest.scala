package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeArchiveRequest extends StObject {
  
  /**
    * The name of the archive to retrieve.
    */
  var ArchiveName: typings.awsSdk.eventbridgeMod.ArchiveName = js.native
}
object DescribeArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName): DescribeArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeArchiveRequest]
  }
  
  @scala.inline
  implicit class DescribeArchiveRequestMutableBuilder[Self <: DescribeArchiveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
  }
}
