package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerAnnotations extends StObject {
  
  /**
    *  Specifies the Amazon S3 location where the annotations for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri
  
  /**
    * This specifies the Amazon S3 location where the test annotations for an entity recognizer are located. The URI must be in the same AWS Region as the API endpoint that you are calling.
    */
  var TestS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object EntityRecognizerAnnotations {
  
  inline def apply(S3Uri: S3Uri): EntityRecognizerAnnotations = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerAnnotations]
  }
  
  extension [Self <: EntityRecognizerAnnotations](x: Self) {
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3Uri(value: S3Uri): Self = StObject.set(x, "TestS3Uri", value.asInstanceOf[js.Any])
    
    inline def setTestS3UriUndefined: Self = StObject.set(x, "TestS3Uri", js.undefined)
  }
}
