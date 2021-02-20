package typings.awsSdkMiddlewareEc2Copysnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessKeyId extends StObject {
    
    var accessKeyId: String = js.native
    
    var secretAccessKey: String = js.native
    
    var sessionToken: String = js.native
  }
  object AccessKeyId {
    
    @scala.inline
    def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String): AccessKeyId = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessKeyId]
    }
    
    @scala.inline
    implicit class AccessKeyIdMutableBuilder[Self <: AccessKeyId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hostname extends StObject {
    
    var hostname: String = js.native
    
    var path: String = js.native
    
    var protocol: String = js.native
  }
  object Hostname {
    
    @scala.inline
    def apply(hostname: String, path: String, protocol: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
