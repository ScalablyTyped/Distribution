package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplacementTemplate extends StObject {
  
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[EmailTemplateData] = js.undefined
}
object ReplacementTemplate {
  
  inline def apply(): ReplacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacementTemplate]
  }
  
  extension [Self <: ReplacementTemplate](x: Self) {
    
    inline def setReplacementTemplateData(value: EmailTemplateData): Self = StObject.set(x, "ReplacementTemplateData", value.asInstanceOf[js.Any])
    
    inline def setReplacementTemplateDataUndefined: Self = StObject.set(x, "ReplacementTemplateData", js.undefined)
  }
}
