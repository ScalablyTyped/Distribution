package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalSecondaryIndexAction extends StObject {
  
  /**
    * The name of the global secondary index to be deleted.
    */
  var IndexName: typings.awsSdk2Types.clientsDynamodbMod.IndexName
}
object DeleteGlobalSecondaryIndexAction {
  
  inline def apply(IndexName: IndexName): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
  }
}
