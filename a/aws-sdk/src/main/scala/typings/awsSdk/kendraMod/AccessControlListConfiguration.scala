package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlListConfiguration extends StObject {
  
  /**
    * Path to the AWS S3 bucket that contains the ACL files.
    */
  var KeyPath: js.UndefOr[S3ObjectKey] = js.native
}
object AccessControlListConfiguration {
  
  @scala.inline
  def apply(): AccessControlListConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlListConfiguration]
  }
  
  @scala.inline
  implicit class AccessControlListConfigurationMutableBuilder[Self <: AccessControlListConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPath(value: S3ObjectKey): Self = StObject.set(x, "KeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathUndefined: Self = StObject.set(x, "KeyPath", js.undefined)
  }
}
