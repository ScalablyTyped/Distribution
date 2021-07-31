package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogGroupField extends StObject {
  
  /**
    * The name of a log field.
    */
  var name: js.UndefOr[Field] = js.undefined
  
  /**
    * The percentage of log events queried that contained the field.
    */
  var percent: js.UndefOr[Percentage] = js.undefined
}
object LogGroupField {
  
  @scala.inline
  def apply(): LogGroupField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogGroupField]
  }
  
  @scala.inline
  implicit class LogGroupFieldMutableBuilder[Self <: LogGroupField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPercent(value: Percentage): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
