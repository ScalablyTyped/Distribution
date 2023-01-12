package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTextTranslationJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with an asynchronous batch translation job.
    */
  var TextTranslationJobProperties: js.UndefOr[typings.awsSdk.clientsTranslateMod.TextTranslationJobProperties] = js.undefined
}
object DescribeTextTranslationJobResponse {
  
  inline def apply(): DescribeTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTextTranslationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTextTranslationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setTextTranslationJobProperties(value: TextTranslationJobProperties): Self = StObject.set(x, "TextTranslationJobProperties", value.asInstanceOf[js.Any])
    
    inline def setTextTranslationJobPropertiesUndefined: Self = StObject.set(x, "TextTranslationJobProperties", js.undefined)
  }
}
