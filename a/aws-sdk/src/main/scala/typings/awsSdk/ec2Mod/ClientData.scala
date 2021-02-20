package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientData extends StObject {
  
  /**
    * A user-defined comment about the disk upload.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * The time that the disk upload ends.
    */
  var UploadEnd: js.UndefOr[DateTime] = js.native
  
  /**
    * The size of the uploaded disk image, in GiB.
    */
  var UploadSize: js.UndefOr[Double] = js.native
  
  /**
    * The time that the disk upload starts.
    */
  var UploadStart: js.UndefOr[DateTime] = js.native
}
object ClientData {
  
  @scala.inline
  def apply(): ClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit class ClientDataMutableBuilder[Self <: ClientData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setUploadEnd(value: DateTime): Self = StObject.set(x, "UploadEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadEndUndefined: Self = StObject.set(x, "UploadEnd", js.undefined)
    
    @scala.inline
    def setUploadSize(value: Double): Self = StObject.set(x, "UploadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadSizeUndefined: Self = StObject.set(x, "UploadSize", js.undefined)
    
    @scala.inline
    def setUploadStart(value: DateTime): Self = StObject.set(x, "UploadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStartUndefined: Self = StObject.set(x, "UploadStart", js.undefined)
  }
}
