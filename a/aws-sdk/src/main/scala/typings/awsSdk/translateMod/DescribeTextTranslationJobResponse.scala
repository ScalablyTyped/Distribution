package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTextTranslationJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with an asynchronous batch translation job.
    */
  var TextTranslationJobProperties: js.UndefOr[typings.awsSdk.translateMod.TextTranslationJobProperties] = js.native
}
object DescribeTextTranslationJobResponse {
  
  @scala.inline
  def apply(): DescribeTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTextTranslationJobResponse]
  }
  
  @scala.inline
  implicit class DescribeTextTranslationJobResponseMutableBuilder[Self <: DescribeTextTranslationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextTranslationJobProperties(value: TextTranslationJobProperties): Self = StObject.set(x, "TextTranslationJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTranslationJobPropertiesUndefined: Self = StObject.set(x, "TextTranslationJobProperties", js.undefined)
  }
}
