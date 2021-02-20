package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerDocuments extends StObject {
  
  /**
    *  Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri = js.native
}
object EntityRecognizerDocuments {
  
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerDocuments = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerDocuments]
  }
  
  @scala.inline
  implicit class EntityRecognizerDocumentsMutableBuilder[Self <: EntityRecognizerDocuments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
