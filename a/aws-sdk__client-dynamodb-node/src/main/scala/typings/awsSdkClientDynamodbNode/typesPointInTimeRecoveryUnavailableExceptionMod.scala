package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPointInTimeRecoveryUnavailableExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PointInTimeRecoveryUnavailableExceptionDetails> * / any */ trait PointInTimeRecoveryUnavailableException
    extends StObject
       with RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.PointInTimeRecoveryUnavailableException
  }
  object PointInTimeRecoveryUnavailableException {
    
    @scala.inline
    def apply(): PointInTimeRecoveryUnavailableException = {
      val __obj = js.Dynamic.literal(name = "PointInTimeRecoveryUnavailableException")
      __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
    }
    
    @scala.inline
    implicit class PointInTimeRecoveryUnavailableExceptionMutableBuilder[Self <: PointInTimeRecoveryUnavailableException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.PointInTimeRecoveryUnavailableException
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
    
    @scala.inline
    def apply(): PointInTimeRecoveryUnavailableExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointInTimeRecoveryUnavailableExceptionDetails]
    }
    
    @scala.inline
    implicit class PointInTimeRecoveryUnavailableExceptionDetailsMutableBuilder[Self <: PointInTimeRecoveryUnavailableExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
