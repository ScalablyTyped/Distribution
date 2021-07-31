package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_GlobalTableNotFoundExceptionDetails> * / any */ trait GlobalTableNotFoundException
    extends StObject
       with DescribeGlobalTableExceptionsUnion
       with DescribeGlobalTableSettingsExceptionsUnion
       with UpdateGlobalTableExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableNotFoundException
  }
  object GlobalTableNotFoundException {
    
    @scala.inline
    def apply(): GlobalTableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableNotFoundException")
      __obj.asInstanceOf[GlobalTableNotFoundException]
    }
    
    @scala.inline
    implicit class GlobalTableNotFoundExceptionMutableBuilder[Self <: GlobalTableNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalTableNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object GlobalTableNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): GlobalTableNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class GlobalTableNotFoundExceptionDetailsMutableBuilder[Self <: GlobalTableNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
