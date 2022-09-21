package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExtensionVersionsRequest extends StObject {
  
  /**
    * The maximum number of results to return.  Use this parameter with NextToken to get results as a set of sequential pages. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.gamesparksMod.MaxResults] = js.undefined
  
  /**
    * The name of the extension.
    */
  var Name: ExtensionName
  
  /**
    * The namespace (qualifier) of the extension.
    */
  var Namespace: ExtensionNamespace
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.gamesparksMod.NextToken] = js.undefined
}
object ListExtensionVersionsRequest {
  
  inline def apply(Name: ExtensionName, Namespace: ExtensionNamespace): ListExtensionVersionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExtensionVersionsRequest]
  }
  
  extension [Self <: ListExtensionVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setName(value: ExtensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: ExtensionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
