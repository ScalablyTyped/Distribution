package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTerminologyResponse extends StObject {
  
  /**
    * The properties of the custom terminology being imported.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.translateMod.TerminologyProperties] = js.undefined
}
object ImportTerminologyResponse {
  
  @scala.inline
  def apply(): ImportTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTerminologyResponse]
  }
  
  @scala.inline
  implicit class ImportTerminologyResponseMutableBuilder[Self <: ImportTerminologyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminologyProperties(value: TerminologyProperties): Self = StObject.set(x, "TerminologyProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyPropertiesUndefined: Self = StObject.set(x, "TerminologyProperties", js.undefined)
  }
}
