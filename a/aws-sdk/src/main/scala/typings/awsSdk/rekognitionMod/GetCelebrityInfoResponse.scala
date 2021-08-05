package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCelebrityInfoResponse extends StObject {
  
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typings.awsSdk.rekognitionMod.Urls] = js.undefined
}
object GetCelebrityInfoResponse {
  
  inline def apply(): GetCelebrityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCelebrityInfoResponse]
  }
  
  extension [Self <: GetCelebrityInfoResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUrls(value: Urls): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "Urls", js.undefined)
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "Urls", js.Array(value :_*))
  }
}
