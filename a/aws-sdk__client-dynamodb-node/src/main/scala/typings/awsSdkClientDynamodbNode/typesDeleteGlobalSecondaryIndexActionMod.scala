package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteGlobalSecondaryIndexActionMod {
  
  @js.native
  trait DeleteGlobalSecondaryIndexAction extends StObject {
    
    /**
      * <p>The name of the global secondary index to be deleted.</p>
      */
    var IndexName: String = js.native
  }
  object DeleteGlobalSecondaryIndexAction {
    
    @scala.inline
    def apply(IndexName: String): DeleteGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
    }
    
    @scala.inline
    implicit class DeleteGlobalSecondaryIndexActionMutableBuilder[Self <: DeleteGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledDeleteGlobalSecondaryIndexAction = DeleteGlobalSecondaryIndexAction
}
