package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p>
    *          <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed
    *             across all of the local secondary indexes, must not exceed 100. If you project the same
    *             attribute into two different indexes, this counts as two distinct attributes when
    *             determining the total.</p>
    */
  var NonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>The set of attributes that are projected into the index:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the
    *                     index.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>INCLUDE</code> - In addition to the attributes described in
    *                         <code>KEYS_ONLY</code>, the secondary index will include other non-key
    *                     attributes that you specify.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ALL</code> - All of the table attributes are projected into the
    *                     index.</p>
    *             </li>
    *          </ul>
    */
  var ProjectionType: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProjectionType | String] = js.undefined
}
object Projection {
  
  inline def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    inline def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
    
    inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
    
    inline def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value*))
    
    inline def setProjectionType(value: ProjectionType | String): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
    
    inline def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
  }
}
