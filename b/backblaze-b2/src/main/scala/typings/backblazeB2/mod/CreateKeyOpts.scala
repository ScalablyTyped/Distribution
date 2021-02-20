package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyOpts extends CommonArgs {
  
  var bucketId: js.UndefOr[String] = js.native
  
  var capabilities: js.Array[String] = js.native
  
  var keyName: String = js.native
  
  var namePrefix: js.UndefOr[String] = js.native
  
  var validDurationInSeconds: js.UndefOr[Double] = js.native
}
object CreateKeyOpts {
  
  @scala.inline
  def apply(capabilities: js.Array[String], keyName: String): CreateKeyOpts = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyOpts]
  }
  
  @scala.inline
  implicit class CreateKeyOptsMutableBuilder[Self <: CreateKeyOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    @scala.inline
    def setValidDurationInSeconds(value: Double): Self = StObject.set(x, "validDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidDurationInSecondsUndefined: Self = StObject.set(x, "validDurationInSeconds", js.undefined)
  }
}
