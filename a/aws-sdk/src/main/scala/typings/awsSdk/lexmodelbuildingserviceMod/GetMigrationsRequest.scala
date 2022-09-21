package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationsRequest extends StObject {
  
  /**
    * The maximum number of migrations to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Filters the list to contain only migrations in the specified state.
    */
  var migrationStatusEquals: js.UndefOr[MigrationStatus] = js.undefined
  
  /**
    * A pagination token that fetches the next page of migrations. If the response to this operation is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of migrations, specify the pagination token in the request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The field to sort the list of migrations by. You can sort by the Amazon Lex V1 bot name or the date and time that the migration was started.
    */
  var sortByAttribute: js.UndefOr[MigrationSortAttribute] = js.undefined
  
  /**
    * The order so sort the list.
    */
  var sortByOrder: js.UndefOr[SortOrder] = js.undefined
  
  /**
    * Filters the list to contain only bots whose name contains the specified string. The string is matched anywhere in bot name.
    */
  var v1BotNameContains: js.UndefOr[BotName] = js.undefined
}
object GetMigrationsRequest {
  
  inline def apply(): GetMigrationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMigrationsRequest]
  }
  
  extension [Self <: GetMigrationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMigrationStatusEquals(value: MigrationStatus): Self = StObject.set(x, "migrationStatusEquals", value.asInstanceOf[js.Any])
    
    inline def setMigrationStatusEqualsUndefined: Self = StObject.set(x, "migrationStatusEquals", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortByAttribute(value: MigrationSortAttribute): Self = StObject.set(x, "sortByAttribute", value.asInstanceOf[js.Any])
    
    inline def setSortByAttributeUndefined: Self = StObject.set(x, "sortByAttribute", js.undefined)
    
    inline def setSortByOrder(value: SortOrder): Self = StObject.set(x, "sortByOrder", value.asInstanceOf[js.Any])
    
    inline def setSortByOrderUndefined: Self = StObject.set(x, "sortByOrder", js.undefined)
    
    inline def setV1BotNameContains(value: BotName): Self = StObject.set(x, "v1BotNameContains", value.asInstanceOf[js.Any])
    
    inline def setV1BotNameContainsUndefined: Self = StObject.set(x, "v1BotNameContains", js.undefined)
  }
}
