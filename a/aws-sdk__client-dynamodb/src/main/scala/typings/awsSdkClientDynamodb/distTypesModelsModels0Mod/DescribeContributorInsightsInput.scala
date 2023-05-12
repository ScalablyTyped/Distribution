package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContributorInsightsInput extends StObject {
  
  /**
    * <p>The name of the global secondary index to describe, if applicable.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table to describe.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object DescribeContributorInsightsInput {
  
  inline def apply(): DescribeContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContributorInsightsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContributorInsightsInput] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
