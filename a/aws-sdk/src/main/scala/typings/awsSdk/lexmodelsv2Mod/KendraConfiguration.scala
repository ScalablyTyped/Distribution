package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KendraConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kendra index that you want the AMAZON.KendraSearchIntent intent to search. The index must be in the same account and Region as the Amazon Lex bot.
    */
  var kendraIndex: KendraIndexArn
  
  /**
    * A query filter that Amazon Lex sends to Amazon Kendra to filter the response from a query. The filter is in the format defined by Amazon Kendra. For more information, see Filtering queries.
    */
  var queryFilterString: js.UndefOr[QueryFilterString] = js.undefined
  
  /**
    * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra index.
    */
  var queryFilterStringEnabled: js.UndefOr[Boolean] = js.undefined
}
object KendraConfiguration {
  
  inline def apply(kendraIndex: KendraIndexArn): KendraConfiguration = {
    val __obj = js.Dynamic.literal(kendraIndex = kendraIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KendraConfiguration]
  }
  
  extension [Self <: KendraConfiguration](x: Self) {
    
    inline def setKendraIndex(value: KendraIndexArn): Self = StObject.set(x, "kendraIndex", value.asInstanceOf[js.Any])
    
    inline def setQueryFilterString(value: QueryFilterString): Self = StObject.set(x, "queryFilterString", value.asInstanceOf[js.Any])
    
    inline def setQueryFilterStringEnabled(value: Boolean): Self = StObject.set(x, "queryFilterStringEnabled", value.asInstanceOf[js.Any])
    
    inline def setQueryFilterStringEnabledUndefined: Self = StObject.set(x, "queryFilterStringEnabled", js.undefined)
    
    inline def setQueryFilterStringUndefined: Self = StObject.set(x, "queryFilterString", js.undefined)
  }
}
