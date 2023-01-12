package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConstructorOptions extends StObject {
  
  /**
    * The path to the certificate to use for SSL connections
    */
  var certpath: String
}
object ClusterConstructorOptions {
  
  inline def apply(certpath: String): ClusterConstructorOptions = {
    val __obj = js.Dynamic.literal(certpath = certpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setCertpath(value: String): Self = StObject.set(x, "certpath", value.asInstanceOf[js.Any])
  }
}
