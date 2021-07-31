package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerAnnotations extends StObject {
  
  /**
    *  Specifies the Amazon S3 location where the annotations for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri
}
object EntityRecognizerAnnotations {
  
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerAnnotations = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerAnnotations]
  }
  
  @scala.inline
  implicit class EntityRecognizerAnnotationsMutableBuilder[Self <: EntityRecognizerAnnotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
