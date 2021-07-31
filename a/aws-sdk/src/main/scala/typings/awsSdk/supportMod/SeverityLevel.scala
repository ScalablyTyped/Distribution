package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeverityLevel extends StObject {
  
  /**
    * The code for case severity level. Valid values: low | normal | high | urgent | critical 
    */
  var code: js.UndefOr[SeverityLevelCode] = js.undefined
  
  /**
    * The name of the severity level that corresponds to the severity level code.  The values returned by the API differ from the values that are displayed in the AWS Support Center. For example, for the code "low", the API name is "Low", but the name in the Support Center is "General guidance". These are the Support Center code/name mappings:    low: General guidance    normal: System impaired    high: Production system impaired    urgent: Production system down    critical: Business-critical system down    For more information, see Choosing a severity in the AWS Support User Guide.
    */
  var name: js.UndefOr[SeverityLevelName] = js.undefined
}
object SeverityLevel {
  
  @scala.inline
  def apply(): SeverityLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityLevel]
  }
  
  @scala.inline
  implicit class SeverityLevelMutableBuilder[Self <: SeverityLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: SeverityLevelCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setName(value: SeverityLevelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
