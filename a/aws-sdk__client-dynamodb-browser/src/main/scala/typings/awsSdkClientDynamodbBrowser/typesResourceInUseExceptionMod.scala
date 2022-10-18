package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesResourceInUseExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ResourceInUseExceptionDetails> * / any */ trait ResourceInUseException
    extends StObject
       with CreateTableExceptionsUnion
       with DeleteTableExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion
       with UpdateTableExceptionsUnion
       with UpdateTimeToLiveExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException
  }
  object ResourceInUseException {
    
    inline def apply(): ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = "ResourceInUseException")
      __obj.asInstanceOf[ResourceInUseException]
    }
    
    extension [Self <: ResourceInUseException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceInUseExceptionDetails extends StObject {
    
    /**
      * <p>The resource which is being attempted to be changed is in use.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ResourceInUseExceptionDetails {
    
    inline def apply(): ResourceInUseExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceInUseExceptionDetails]
    }
    
    extension [Self <: ResourceInUseExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
