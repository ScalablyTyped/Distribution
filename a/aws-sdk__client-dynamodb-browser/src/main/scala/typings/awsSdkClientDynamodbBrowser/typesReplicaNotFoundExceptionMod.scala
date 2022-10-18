package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReplicaNotFoundExceptionDetails> * / any */ trait ReplicaNotFoundException
    extends StObject
       with UpdateGlobalTableExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ReplicaNotFoundException
  }
  object ReplicaNotFoundException {
    
    inline def apply(): ReplicaNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ReplicaNotFoundException")
      __obj.asInstanceOf[ReplicaNotFoundException]
    }
    
    extension [Self <: ReplicaNotFoundException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ReplicaNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicaNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ReplicaNotFoundExceptionDetails {
    
    inline def apply(): ReplicaNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaNotFoundExceptionDetails]
    }
    
    extension [Self <: ReplicaNotFoundExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
