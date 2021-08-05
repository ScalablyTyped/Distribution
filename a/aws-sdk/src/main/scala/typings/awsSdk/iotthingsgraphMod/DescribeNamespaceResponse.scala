package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNamespaceResponse extends StObject {
  
  /**
    * The ARN of the namespace.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The version of the user's namespace to describe.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The name of the public namespace that the latest namespace version is tracking.
    */
  var trackingNamespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The version of the public namespace that the latest version is tracking.
    */
  var trackingNamespaceVersion: js.UndefOr[Version] = js.undefined
}
object DescribeNamespaceResponse {
  
  inline def apply(): DescribeNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNamespaceResponse]
  }
  
  extension [Self <: DescribeNamespaceResponse](x: Self) {
    
    inline def setNamespaceArn(value: Arn): Self = StObject.set(x, "namespaceArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaceArnUndefined: Self = StObject.set(x, "namespaceArn", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    inline def setTrackingNamespaceName(value: NamespaceName): Self = StObject.set(x, "trackingNamespaceName", value.asInstanceOf[js.Any])
    
    inline def setTrackingNamespaceNameUndefined: Self = StObject.set(x, "trackingNamespaceName", js.undefined)
    
    inline def setTrackingNamespaceVersion(value: Version): Self = StObject.set(x, "trackingNamespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setTrackingNamespaceVersionUndefined: Self = StObject.set(x, "trackingNamespaceVersion", js.undefined)
  }
}
