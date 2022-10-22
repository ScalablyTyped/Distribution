package typings.awsSdkUtilEndpoints

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.distTypesLoggerMod.Logger
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesSharedMod {
  
  trait ConditionObject
    extends StObject
       with FunctionObject {
    
    var assign: js.UndefOr[String] = js.undefined
  }
  object ConditionObject {
    
    inline def apply(argv: FunctionArgv, fn: String): ConditionObject = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionObject]
    }
    
    extension [Self <: ConditionObject](x: Self) {
      
      inline def setAssign(value: String): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
      
      inline def setAssignUndefined: Self = StObject.set(x, "assign", js.undefined)
    }
  }
  
  type EndpointParams = Record[String, String | Boolean]
  
  trait EndpointResolverOptions extends StObject {
    
    var endpointParams: EndpointParams
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object EndpointResolverOptions {
    
    inline def apply(endpointParams: EndpointParams): EndpointResolverOptions = {
      val __obj = js.Dynamic.literal(endpointParams = endpointParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointResolverOptions]
    }
    
    extension [Self <: EndpointResolverOptions](x: Self) {
      
      inline def setEndpointParams(value: EndpointParams): Self = StObject.set(x, "endpointParams", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  trait EvaluateOptions
    extends StObject
       with EndpointResolverOptions {
    
    var referenceRecord: ReferenceRecord
  }
  object EvaluateOptions {
    
    inline def apply(endpointParams: EndpointParams, referenceRecord: ReferenceRecord): EvaluateOptions = {
      val __obj = js.Dynamic.literal(endpointParams = endpointParams.asInstanceOf[js.Any], referenceRecord = referenceRecord.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluateOptions]
    }
    
    extension [Self <: EvaluateOptions](x: Self) {
      
      inline def setReferenceRecord(value: ReferenceRecord): Self = StObject.set(x, "referenceRecord", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ReferenceObject
    - typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionObject
  */
  type Expression = _Expression | String
  
  type FunctionArgv = js.Array[Expression | Boolean | Double]
  
  trait FunctionObject
    extends StObject
       with _Expression {
    
    var argv: FunctionArgv
    
    var fn: String
  }
  object FunctionObject {
    
    inline def apply(argv: FunctionArgv, fn: String): FunctionObject = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionObject]
    }
    
    extension [Self <: FunctionObject](x: Self) {
      
      inline def setArgv(value: FunctionArgv): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: (Expression | Boolean | Double)*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setFn(value: String): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
  
  type FunctionReturn = String | Boolean | Double | StringDictionary[Any]
  
  trait ReferenceObject
    extends StObject
       with _Expression {
    
    var ref: String
  }
  object ReferenceObject {
    
    inline def apply(ref: String): ReferenceObject = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    extension [Self <: ReferenceObject](x: Self) {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: @aws-sdk/util-endpoints.@aws-sdk/util-endpoints/dist-types/types/shared.FunctionReturn} */ trait ReferenceRecord extends StObject
  
  trait _Expression extends StObject
  object _Expression {
    
    inline def FunctionObject(argv: FunctionArgv, fn: String): typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionObject = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionObject]
    }
    
    inline def ReferenceObject(ref: String): typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ReferenceObject = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ReferenceObject]
    }
  }
}
