package typings.awsSdkRoute53IdNormalizerMiddleware

import typings.awsSdkRoute53IdNormalizerMiddleware.anon.AliasTarget
import typings.awsSdkRoute53IdNormalizerMiddleware.anon.Changes
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/route53-id-normalizer-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeBatchAliasTargetIdNormalizerMiddleware[Input /* <: ChangeBatchBearer */, Output /* <: js.Object */](next: Handler[Input, Output]): Handler[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeBatchAliasTargetIdNormalizerMiddleware")(next.asInstanceOf[js.Any]).asInstanceOf[Handler[Input, Output]]
  
  inline def idNormalizerMiddleware[Input /* <: IdentifierBearer */, Output /* <: js.Object */](next: Handler[Input, Output]): Handler[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("idNormalizerMiddleware")(next.asInstanceOf[js.Any]).asInstanceOf[Handler[Input, Output]]
  
  trait Change extends StObject {
    
    var ResourceRecordSet: AliasTarget
  }
  object Change {
    
    inline def apply(ResourceRecordSet: AliasTarget): Change = {
      val __obj = js.Dynamic.literal(ResourceRecordSet = ResourceRecordSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    extension [Self <: Change](x: Self) {
      
      inline def setResourceRecordSet(value: AliasTarget): Self = StObject.set(x, "ResourceRecordSet", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangeBatchBearer extends StObject {
    
    var ChangeBatch: Changes
  }
  object ChangeBatchBearer {
    
    inline def apply(ChangeBatch: Changes): ChangeBatchBearer = {
      val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeBatchBearer]
    }
    
    extension [Self <: ChangeBatchBearer](x: Self) {
      
      inline def setChangeBatch(value: Changes): Self = StObject.set(x, "ChangeBatch", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentifierBearer extends StObject {
    
    var DelegationSetId: js.UndefOr[String] = js.undefined
    
    var HostedZoneId: js.UndefOr[String] = js.undefined
    
    var Id: js.UndefOr[String] = js.undefined
  }
  object IdentifierBearer {
    
    inline def apply(): IdentifierBearer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentifierBearer]
    }
    
    extension [Self <: IdentifierBearer](x: Self) {
      
      inline def setDelegationSetId(value: String): Self = StObject.set(x, "DelegationSetId", value.asInstanceOf[js.Any])
      
      inline def setDelegationSetIdUndefined: Self = StObject.set(x, "DelegationSetId", js.undefined)
      
      inline def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    }
  }
}
