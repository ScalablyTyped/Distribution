package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilters extends StObject {
  
  /**
    * Filter the lineage entities connected to the StartArn(s) after the create date.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter the lineage entities connected to the StartArn(s) by created date.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter the lineage entities connected to the StartArn(s) by the type of the lineage entity.
    */
  var LineageTypes: js.UndefOr[QueryLineageTypes] = js.undefined
  
  /**
    * Filter the lineage entities connected to the StartArn(s) after the last modified date.
    */
  var ModifiedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter the lineage entities connected to the StartArn(s) before the last modified date.
    */
  var ModifiedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter the lineage entities connected to the StartArn(s) by a set if property key value pairs. If multiple pairs are provided, an entity is included in the results if it matches any of the provided pairs.
    */
  var Properties: js.UndefOr[QueryProperties] = js.undefined
  
  /**
    * Filter the lineage entities connected to the StartArn by type. For example: DataSet, Model, Endpoint, or ModelDeployment.
    */
  var Types: js.UndefOr[QueryTypes] = js.undefined
}
object QueryFilters {
  
  inline def apply(): QueryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFilters]
  }
  
  extension [Self <: QueryFilters](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setLineageTypes(value: QueryLineageTypes): Self = StObject.set(x, "LineageTypes", value.asInstanceOf[js.Any])
    
    inline def setLineageTypesUndefined: Self = StObject.set(x, "LineageTypes", js.undefined)
    
    inline def setLineageTypesVarargs(value: LineageType*): Self = StObject.set(x, "LineageTypes", js.Array(value*))
    
    inline def setModifiedAfter(value: js.Date): Self = StObject.set(x, "ModifiedAfter", value.asInstanceOf[js.Any])
    
    inline def setModifiedAfterUndefined: Self = StObject.set(x, "ModifiedAfter", js.undefined)
    
    inline def setModifiedBefore(value: js.Date): Self = StObject.set(x, "ModifiedBefore", value.asInstanceOf[js.Any])
    
    inline def setModifiedBeforeUndefined: Self = StObject.set(x, "ModifiedBefore", js.undefined)
    
    inline def setProperties(value: QueryProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setTypes(value: QueryTypes): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: String40*): Self = StObject.set(x, "Types", js.Array(value*))
  }
}
