package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
  */
@js.native
trait SqlFilter extends StObject {
  
  val CompatibilityLevel: String = js.native
  
  var Parameters: js.UndefOr[Dictionary[_]] = js.native
  
  var RequiresPreprocessing: js.UndefOr[String] = js.native
  
  var SqlExpression: String = js.native
}
object SqlFilter {
  
  @scala.inline
  def apply(CompatibilityLevel: String, SqlExpression: String): SqlFilter = {
    val __obj = js.Dynamic.literal(CompatibilityLevel = CompatibilityLevel.asInstanceOf[js.Any], SqlExpression = SqlExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFilter]
  }
  
  @scala.inline
  implicit class SqlFilterMutableBuilder[Self <: SqlFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibilityLevel(value: String): Self = StObject.set(x, "CompatibilityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Dictionary[_]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setRequiresPreprocessing(value: String): Self = StObject.set(x, "RequiresPreprocessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresPreprocessingUndefined: Self = StObject.set(x, "RequiresPreprocessing", js.undefined)
    
    @scala.inline
    def setSqlExpression(value: String): Self = StObject.set(x, "SqlExpression", value.asInstanceOf[js.Any])
  }
}
