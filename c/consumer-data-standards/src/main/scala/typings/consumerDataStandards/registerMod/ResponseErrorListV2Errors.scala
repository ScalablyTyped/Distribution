package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Urn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseErrorListV2Errors
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The code of the error encountered. Where the error is specific to the respondent, an application-specific error code, expressed as a string value. If the error is application-specific, the URN code that the specific error extends must be provided in the meta object. Otherwise, the value is the error code URN.
    */
  var code: String
  
  /**
    * A human-readable explanation specific to this occurrence of the problem.
    */
  var detail: String
  
  /**
    * Additional data for customised error codes
    */
  var meta: js.UndefOr[Urn] = js.undefined
  
  /**
    * A short, human-readable summary of the problem that MUST NOT change from occurrence to occurrence of the problem represented by the error code.
    */
  var title: String
}
object ResponseErrorListV2Errors {
  
  inline def apply(code: String, detail: String, title: String): ResponseErrorListV2Errors = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseErrorListV2Errors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseErrorListV2Errors] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Urn): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
