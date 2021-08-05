package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPointInTimeRecoveryUnavailableExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PointInTimeRecoveryUnavailableExceptionDetails> * / any */ trait PointInTimeRecoveryUnavailableException
    extends StObject
       with RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException
  }
  object PointInTimeRecoveryUnavailableException {
    
    inline def apply(): PointInTimeRecoveryUnavailableException = {
      val __obj = js.Dynamic.literal(name = "PointInTimeRecoveryUnavailableException")
      __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
    }
    
    extension [Self <: PointInTimeRecoveryUnavailableException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointInTimeRecoveryUnavailableExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object PointInTimeRecoveryUnavailableExceptionDetails {
    
    inline def apply(): PointInTimeRecoveryUnavailableExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointInTimeRecoveryUnavailableExceptionDetails]
    }
    
    extension [Self <: PointInTimeRecoveryUnavailableExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
