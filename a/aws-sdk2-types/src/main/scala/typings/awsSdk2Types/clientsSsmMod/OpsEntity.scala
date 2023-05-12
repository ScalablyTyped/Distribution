package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsEntity extends StObject {
  
  /**
    * The data returned by the query.
    */
  var Data: js.UndefOr[OpsEntityItemMap] = js.undefined
  
  /**
    * The query ID.
    */
  var Id: js.UndefOr[OpsEntityId] = js.undefined
}
object OpsEntity {
  
  inline def apply(): OpsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsEntity] (val x: Self) extends AnyVal {
    
    inline def setData(value: OpsEntityItemMap): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setId(value: OpsEntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
