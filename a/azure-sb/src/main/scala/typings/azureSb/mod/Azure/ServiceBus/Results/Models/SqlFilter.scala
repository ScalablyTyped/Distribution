package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-messaging-sql-filter
  */
trait SqlFilter extends StObject {
  
  val CompatibilityLevel: String
  
  var Parameters: js.UndefOr[Dictionary[Any]] = js.undefined
  
  var RequiresPreprocessing: js.UndefOr[String] = js.undefined
  
  var SqlExpression: String
}
object SqlFilter {
  
  inline def apply(CompatibilityLevel: String, SqlExpression: String): SqlFilter = {
    val __obj = js.Dynamic.literal(CompatibilityLevel = CompatibilityLevel.asInstanceOf[js.Any], SqlExpression = SqlExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFilter]
  }
  
  extension [Self <: SqlFilter](x: Self) {
    
    inline def setCompatibilityLevel(value: String): Self = StObject.set(x, "CompatibilityLevel", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Dictionary[Any]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRequiresPreprocessing(value: String): Self = StObject.set(x, "RequiresPreprocessing", value.asInstanceOf[js.Any])
    
    inline def setRequiresPreprocessingUndefined: Self = StObject.set(x, "RequiresPreprocessing", js.undefined)
    
    inline def setSqlExpression(value: String): Self = StObject.set(x, "SqlExpression", value.asInstanceOf[js.Any])
  }
}
