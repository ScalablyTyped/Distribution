package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDestination extends StObject {
  
  /**
    * An object that describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations export file, and its associated metadata file.
    */
  var s3: js.UndefOr[S3Destination] = js.native
}
object ExportDestination {
  
  @scala.inline
  def apply(): ExportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDestination]
  }
  
  @scala.inline
  implicit class ExportDestinationMutableBuilder[Self <: ExportDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3(value: S3Destination): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
