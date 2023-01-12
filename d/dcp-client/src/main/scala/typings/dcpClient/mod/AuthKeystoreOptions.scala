package typings.dcpClient.mod

import typings.dcpClient.dcpClientStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthKeystoreOptions extends StObject {
  
  /**
    * Try an empty password before prompting user. Defaults to true.
    */
  var checkEmpty: Boolean
  
  /**
    * An optional, user-defined identifier used for caching keystores.
    */
  var contextId: js.UndefOr[String] = js.undefined
  
  /**
    *  An optional name for the job that they keystore is being requested for.
    */
  var jobName: js.UndefOr[String] = js.undefined
  
  /**
    * The keystore name.
    */
  var name: String | default
}
object AuthKeystoreOptions {
  
  inline def apply(checkEmpty: Boolean, name: String | default): AuthKeystoreOptions = {
    val __obj = js.Dynamic.literal(checkEmpty = checkEmpty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthKeystoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthKeystoreOptions] (val x: Self) extends AnyVal {
    
    inline def setCheckEmpty(value: Boolean): Self = StObject.set(x, "checkEmpty", value.asInstanceOf[js.Any])
    
    inline def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setName(value: String | default): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
