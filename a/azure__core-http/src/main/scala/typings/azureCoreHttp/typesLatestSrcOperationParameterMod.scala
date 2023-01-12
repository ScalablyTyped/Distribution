package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.typesLatestSrcQueryCollectionFormatMod.QueryCollectionFormat
import typings.azureCoreHttp.typesLatestSrcSerializerMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcOperationParameterMod {
  
  @JSImport("@azure/core-http/types/latest/src/operationParameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathStringFromParameter(parameter: OperationParameter): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathStringFromParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPathStringFromParameterPath(parameterPath: ParameterPath, mapper: Mapper): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathStringFromParameterPath")(parameterPath.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait OperationParameter extends StObject {
    
    /**
      * The mapper that defines how to validate and serialize this parameter's value.
      */
    var mapper: Mapper
    
    /**
      * The path to this parameter's value in OperationArguments or the object that contains paths for
      * each property's value in OperationArguments.
      */
    var parameterPath: ParameterPath
  }
  object OperationParameter {
    
    inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationParameter = {
      val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationParameter] (val x: Self) extends AnyVal {
      
      inline def setMapper(value: Mapper): Self = StObject.set(x, "mapper", value.asInstanceOf[js.Any])
      
      inline def setParameterPath(value: ParameterPath): Self = StObject.set(x, "parameterPath", value.asInstanceOf[js.Any])
      
      inline def setParameterPathVarargs(value: String*): Self = StObject.set(x, "parameterPath", js.Array(value*))
    }
  }
  
  trait OperationQueryParameter
    extends StObject
       with OperationParameter {
    
    /**
      * If this query parameter's value is a collection, what type of format should the value be
      * converted to.
      */
    var collectionFormat: js.UndefOr[QueryCollectionFormat] = js.undefined
    
    /**
      * Whether or not to skip encoding the query parameter's value before adding it to the URL.
      */
    var skipEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object OperationQueryParameter {
    
    inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationQueryParameter = {
      val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationQueryParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationQueryParameter] (val x: Self) extends AnyVal {
      
      inline def setCollectionFormat(value: QueryCollectionFormat): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
      
      inline def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
      
      inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  trait OperationURLParameter
    extends StObject
       with OperationParameter {
    
    /**
      * Whether or not to skip encoding the URL parameter's value before adding it to the URL.
      */
    var skipEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object OperationURLParameter {
    
    inline def apply(mapper: Mapper, parameterPath: ParameterPath): OperationURLParameter = {
      val __obj = js.Dynamic.literal(mapper = mapper.asInstanceOf[js.Any], parameterPath = parameterPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationURLParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationURLParameter] (val x: Self) extends AnyVal {
      
      inline def setSkipEncoding(value: Boolean): Self = StObject.set(x, "skipEncoding", value.asInstanceOf[js.Any])
      
      inline def setSkipEncodingUndefined: Self = StObject.set(x, "skipEncoding", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ParameterPath = string | std.Array<string> | {[propertyName: string] : @azure/core-http.@azure/core-http/types/latest/src/operationParameter.ParameterPath}
  }}}
  to avoid circular code involving: 
  - @azure/core-http.@azure/core-http/types/latest/src/operationParameter.ParameterPath
  */
  type ParameterPath = String | js.Array[String] | StringDictionary[Any]
}
