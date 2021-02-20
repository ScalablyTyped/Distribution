package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputLocation extends StObject {
  
  /**
    * Describes an S3 location that will receive the results of the restore request.
    */
  var S3: js.UndefOr[S3Location] = js.native
}
object OutputLocation {
  
  @scala.inline
  def apply(): OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocation]
  }
  
  @scala.inline
  implicit class OutputLocationMutableBuilder[Self <: OutputLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3(value: S3Location): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
